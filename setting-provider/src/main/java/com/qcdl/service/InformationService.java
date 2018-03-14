package com.qcdl.service;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.dao.InformationDao;
import com.qcdl.model.entity.SettingInformation;
import com.qcdl.model.param.PageParam;
import com.qcdl.service.impl.InformationServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("informationService")
public class InformationService implements InformationServiceI {
    @Autowired
    private InformationDao dao;

    @Override
    public PageInfo<SettingInformation> informationList(PageParam pageParam, String name, Integer ClassifyId) {
        return new PageInfo<>(dao.informationList(pageParam, name, ClassifyId));
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
