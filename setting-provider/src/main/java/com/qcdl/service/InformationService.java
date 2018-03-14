package com.qcdl.service;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.dao.InformationDao;
import com.qcdl.model.entity.SettingInformation;
import com.qcdl.model.param.PageParam;
import com.qcdl.rest.param.InformationParam;
import com.qcdl.service.impl.InformationServicel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("informationService")
public class InformationService implements InformationServicel {
    @Autowired
    private InformationDao dao;


    @Override
    public PageInfo<InformationParam> informationlist(PageParam pageParam) {
        return new PageInfo<>(dao.informationList(pageParam));
    }

    @Override
    public void informationUpdate(SettingInformation information) {
        dao.informationUpdate(information);

    }

    @Override
    public void informationDelete(Integer id) {
        dao.informationDelete(id);

    }

    @Override
    public void informationAdd(SettingInformation information) {
        dao.informationAdd(information);

    }
}
