package com.qcdl.service;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.dao.InformationDao;
import com.qcdl.model.entity.SettingInformation;
import com.qcdl.rest.param.InformationPageParam;
import com.qcdl.rest.param.InformationParam;
import com.qcdl.service.impl.InformationServiceI;
import org.restful.api.utils.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author yuanhua
 */
@Service("informationService")
public class InformationService implements InformationServiceI {
    @Autowired
    private InformationDao dao;

    @Override
    public PageInfo<SettingInformation> list(InformationPageParam param) {
        return new PageInfo<>(dao.list(param));
    }

    @Override
    public void add(InformationParam param) {
        dao.add(param);
    }

    @Override
    public void update(InformationParam param) {
        SettingInformation information = dao.getId(param.getId());
        Assert.notNull(information, "该案例不存在!");
        information.setId(param.getId());
        information.setName(param.getName());
        information.setAuthor(param.getAuthor());
        information.setCover(param.getCover());
        information.setUrl(param.getUrl());
        //TODO 后台上线后解开
//        information.setAdminId(param.getAdminId());
        information.setIndustryId(param.getIndustryId());
        information.setUpdateTime(new Date());
//        information.setVersion(information.getVersion() + 1);
        dao.update(information);
    }

    @Override
    public void delete(Integer id) {
        dao.delete(id);

    }

    @Override
    public SettingInformation getId(Integer id) {
        return dao.getId(id);
    }

}
