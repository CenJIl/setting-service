package com.qcdl.service;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.dao.AreaDao;
import com.qcdl.model.entity.SettingAarea;
import com.qcdl.model.entity.SettingBanner;
import com.qcdl.rest.param.AreaPageParam;
import com.qcdl.rest.param.BannerParam;
import com.qcdl.service.impl.AreaServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hxh on 2018/3/15.
 */
@Service("areaService")
public class AreaService implements AreaServiceI {

    @Autowired
    private AreaDao dao;

    @Override
    public PageInfo<SettingAarea> list(AreaPageParam param) {
        return new PageInfo<>(dao.list(param));
    }

    @Override
    public void update(BannerParam banner) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void add(BannerParam param) {

    }

    @Override
    public SettingBanner get(Integer id) {
        return null;
    }
}
