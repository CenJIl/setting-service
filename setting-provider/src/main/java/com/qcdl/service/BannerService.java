package com.qcdl.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qcdl.model.dao.BannerDao;
import com.qcdl.model.entity.SettingBanner;
import com.qcdl.model.param.PageParam;
import com.qcdl.rest.param.BannerParam;
import com.qcdl.service.impl.BannerServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;

/**
 * Created by yuanhua 2018/3/12.
 *
 * @author Administrator
 */
@Service("bannerService")
public class BannerService implements BannerServiceI {

    @Autowired
    private BannerDao dao;

    @Override
    public PageInfo<SettingBanner> bannerList(BannerParam bannerParam) {
        return new PageInfo<>(dao.bannerList(bannerParam));
    }

    @Override
    public void bannerUpdate(SettingBanner banner) {
        dao.bannerUpdate(banner);
    }

    @Override
    public void bannerDelete(Integer id) {
        dao.bannerDelete(id);
    }

    @Override
    public void bannerAdd(SettingBanner banner) {
        dao.bannerAdd(banner);
    }
}



