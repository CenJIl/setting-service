package com.qcdl.service.impl;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.entity.SettingAarea;
import com.qcdl.model.entity.SettingBanner;
import com.qcdl.rest.param.AreaPageParam;
import com.qcdl.rest.param.BannerParam;

/**
 * Created by hxh on 2018/3/15.
 */
public interface AreaServiceI {

    PageInfo<SettingAarea> list(AreaPageParam param);

    void update(BannerParam banner);

    void delete(Integer id);

    void add(BannerParam param);

    SettingBanner get(Integer id);
}
