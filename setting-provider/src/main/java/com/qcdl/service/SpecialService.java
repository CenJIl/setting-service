package com.qcdl.service;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.dao.SpecialDao;
import com.qcdl.model.entity.SettingSpecial;
import com.qcdl.model.param.PageParam;
import com.qcdl.rest.param.SpecialParam;
import com.qcdl.service.impl.SpecialServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("specialService")
public class SpecialService implements SpecialServiceI {

    @Autowired
    private SpecialDao dao;

    @Override
    public PageInfo<SpecialParam> specialList(PageParam pageParam) {
        return new PageInfo<>(dao.specialList(pageParam));
    }

    @Override
    public void specialUpdate(SettingSpecial special) {
        dao.specialUpdate(special);
    }

    @Override
    public void specialDelete(Integer id) {
        dao.specialDelete(id);
    }

    @Override
    public void specialAdd(SettingSpecial special) {
        dao.specialAdd(special);
    }


}
