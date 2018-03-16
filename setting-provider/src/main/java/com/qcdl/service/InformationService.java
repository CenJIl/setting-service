package com.qcdl.service;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.dao.InformationDao;
import com.qcdl.model.entity.SettingInformation;
import com.qcdl.rest.dto.InformationDto;
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
    public PageInfo<InformationDto> list(InformationPageParam param) {
        return new PageInfo<>(dao.list(param));
    }

    @Override
    public void add(Integer adminId, InformationParam param) {
        dao.add(adminId, param);
    }

    @Override
    public void update(InformationParam param) {
        SettingInformation information = dao.getId(param.getId());
        Assert.notNull(information, "该案例不存在!");
        information.setName(param.getName());
        information.setAuthor(param.getAuthor());
        information.setCover(param.getCover());
        information.setUrl(param.getUrl());
        information.setIndustryId(param.getIndustryId());
        information.setUpdateTime(new Date());
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
