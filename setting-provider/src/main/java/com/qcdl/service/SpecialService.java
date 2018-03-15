package com.qcdl.service;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.dao.SpecialDao;
import com.qcdl.model.entity.SettingSpecial;
import com.qcdl.model.enums.DeleteType;
import com.qcdl.rest.param.SpecialParam;
import com.qcdl.rest.param.specialPageParam;
import com.qcdl.service.impl.SpecialServiceI;
import org.restful.api.utils.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("specialService")
public class SpecialService implements SpecialServiceI {

    @Autowired
    private SpecialDao dao;

    @Override
    public PageInfo<SettingSpecial> list(specialPageParam param) {
        return new PageInfo<>(dao.specialList(param));
    }

    @Override
    public void update(SpecialParam param) {
        SettingSpecial special = dao.getId(param.getId());
        Assert.notNull(special, "专题不存在!");
        special.setId(param.getId());
        special.setName(param.getName());
        special.setCover(param.getCover());
        special.setDescribed(param.getDescribed());
        special.setUrl(param.getUrl());
        special.setWeight(param.getWeight());
        dao.update(special);
    }

    @Override
    public void delete(Integer id) {
        SettingSpecial special = dao.getId(id);
        Assert.notNull(special, "专题不存在!");
        special.setId(id);
        special.setDeleted(DeleteType.已删除.getCode());
        dao.update(special);
    }

    @Override
    public void add(SpecialParam param) {
        dao.add(param);
    }


}
