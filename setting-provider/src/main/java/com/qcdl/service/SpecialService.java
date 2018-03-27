package com.qcdl.service;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.dao.SpecialDao;
import com.qcdl.model.entity.SettingSpecial;
import com.qcdl.model.enums.DeleteType;
import com.qcdl.rest.param.SpecialPageParam;
import com.qcdl.rest.param.SpecialParam;
import com.qcdl.service.impl.SpecialServiceI;
import org.apache.commons.lang3.StringUtils;
import org.restful.api.utils.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 魏自东
 * @date 2018/3/16 9:58
 */
@Service("specialService")
public class SpecialService implements SpecialServiceI {
    @Autowired
    private SpecialDao dao;

    @Override
    public PageInfo<SettingSpecial> list(SpecialPageParam param) {
        return new PageInfo<>(dao.specialList(param));
    }

    @Override
    public void update(SpecialParam param) {
        SettingSpecial special = dao.getId(param.getId());
        Assert.notNull(special, "专题不存在!");
        special.setName(param.getName());
        special.setCover(param.getCover());
        special.setDescribed(param.getDescribed());
        special.setUrl(param.getUrl());
        special.setWeight(param.getWeight());
        special.setContent(param.getContent());
        dao.update(special);
    }

    @Override
    public void delete(Integer id) {
        SettingSpecial special = dao.getId(id);
        Assert.notNull(special, "专题不存在!");
        special.setDeleted(DeleteType.已删除.getCode());
        dao.update(special);
    }

    @Override
    public void add(Integer adminId, SpecialParam param) {
        Assert.notNull(param, "参数不能为空！");
        Assert.isFalse(StringUtils.isBlank(param.getName()), "名称未填写！");
        Assert.isFalse(StringUtils.isBlank(param.getCover()), "封面图未上传！");
        Assert.isFalse(StringUtils.isBlank(param.getDescribed()), "简介未填写！");
        Assert.isFalse(StringUtils.isBlank(param.getContent()), "内容未填写！");
        dao.add(adminId, param);
    }

    @Override
    public SettingSpecial get(Integer id) {
        return dao.getId(id);
    }
}
