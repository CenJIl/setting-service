package com.qcdl.service;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.dao.ClassifyDao;
import com.qcdl.model.entity.Classify;
import com.qcdl.model.entity.SettingInformation;
import com.qcdl.model.param.PageParam;
import com.qcdl.service.impl.ClassifyServiceI;
import org.restful.api.filter.authority.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hxh on 2018/3/14.
 */
@Service("classifyService")
public class ClassifyService implements ClassifyServiceI {
    @Autowired
    private ClassifyDao dao;

    @Override
    public PageInfo<Classify> classifyList(PageParam pageParam) {
        return new PageInfo<>(dao.classifyList(pageParam));
    }

    @Override
    public void classifyCreate(Classify classify) {
        dao.classifyCreate(classify);
    }
}
