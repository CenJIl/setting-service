package com.qcdl.service;

import com.qcdl.model.dao.IndustryDao;
import com.qcdl.model.entity.industry;
import com.qcdl.model.enums.DeleteType;
import com.qcdl.rest.param.industryParam;
import com.qcdl.service.impl.IndustryServiceI;
import org.restful.api.utils.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by hxh on 2018/3/14.
 */
@Service("classifyService")
public class IndustryService implements IndustryServiceI {
    @Autowired
    private IndustryDao dao;

    /**
     * 查询全部行业
     *
     * @return 所有行业
     */
    @Override
    public List<industry> allList() {
        return dao.allList();
    }

    /**
     * 增加一个行业信息
     *
     * @param param 行业参数
     */
    @Override
    public void add(industryParam param) {
        dao.add(param);
    }

    /**
     * 修改行业信息
     *
     * @param param 行业参数
     */
    @Override
    public void update(industryParam param) {
        industry industry = dao.getId(param.getId());
        Assert.notNull(industry, "行业不存在!");
        industry.setId(param.getId());
        industry.setName(param.getName());
        industry.setWeight(param.getWeight());
        industry.setUpdateTime(new Date());
        dao.update(industry);
    }

    @Override
    public void delete(Integer id) {
        industry classify = dao.getId(id);
        Assert.notNull(classify, "行业不存在!");
        classify.setId(id);
        classify.setDeleted(DeleteType.已删除.getCode());
        dao.update(classify);
    }

}
