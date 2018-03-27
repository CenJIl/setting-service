package com.qcdl.service;

import com.qcdl.model.dao.IndustryDao;
import com.qcdl.model.entity.Industry;
import com.qcdl.model.enums.DeleteType;
import com.qcdl.rest.param.IndustryParam;
import com.qcdl.service.impl.IndustryServiceI;
import org.apache.commons.lang3.StringUtils;
import org.restful.api.utils.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wzd.framwork.utils.TreeUtil;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author hxh
 * @date 2018/3/14
 */
@Service("industryService")
public class IndustryService implements IndustryServiceI {
    @Autowired
    private IndustryDao dao;

    @Override
    public List<Industry> list() {
        return dao.list();
    }

//    @Override
//    public Industry getId(Integer id) {
//        Assert.notNull(id, "行业id不能为空!");
//        return dao.getId(id);
//    }

    @Override
    public void add(IndustryParam param) {
        Assert.notNull(param, "参数不能为空！");
        Assert.isFalse(StringUtils.isBlank(param.getName()), "名称未填写！");
        dao.add(param);
    }

    @Override
    public void update(IndustryParam param) {
        Industry industry = dao.getId(param.getId());
        Assert.notNull(industry, "行业不存在!");
        industry.setName(param.getName());
        industry.setWeight(param.getWeight());
        industry.setPid(param.getPid());
        dao.update(industry);
    }

    @Override
    public void delete(Integer id) {
        Industry i = dao.getId(id);
        Assert.notNull(i, "行业不存在!");
        i.setDeleted(DeleteType.已删除.getCode());
        dao.update(i);
    }

    @Override
    public List<Industry> tree() {
        List<Industry> industryList = dao.list();
        return TreeUtil.bulid(industryList,
                industry -> industry.getPid() == null || industry.getPid() == 0,
                industry -> {
                    List<Industry> children = industryList.stream().filter(item -> industry.getId().equals(item.getPid())).collect(Collectors.toList());
                    industry.setChildren(children);
                    return children;
                });
    }


}
