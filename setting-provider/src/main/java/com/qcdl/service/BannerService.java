package com.qcdl.service;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.dao.BannerDao;
import com.qcdl.model.entity.SettingBanner;
import com.qcdl.rest.param.BannerPageParam;
import com.qcdl.rest.param.BannerParam;
import com.qcdl.service.impl.BannerServiceI;
import org.apache.commons.lang3.StringUtils;
import org.restful.api.utils.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public PageInfo<SettingBanner> list(BannerPageParam param) {
        return new PageInfo<>(dao.list(param));
    }

    @Override
    public void update(BannerParam param) {
        SettingBanner banner = dao.getById(param.getId());
        Assert.notNull(banner, "广告不存在！");
        banner.setName(param.getName());
        banner.setWeight(param.getWeight());
        banner.setUrl(param.getUrl());
        banner.setPicture(param.getPicture());
        banner.setPosition(param.getPosition());
        dao.update(banner);
    }

    @Override
    public void delete(Integer id) {
        dao.delete(id);
    }

    @Override
    public void add(BannerParam param) {
        Assert.notNull(param, "参数不能为空！");
        Assert.isFalse(StringUtils.isBlank(param.getName()), "名称未填写！");
        Assert.isFalse(StringUtils.isBlank(param.getPicture()), "广告图未上传！");
        Assert.isFalse(param.getPosition() == null || param.getPosition() < 1, "广告位未选择！");
        dao.add(param);
    }

    @Override
    public SettingBanner get(Integer id) {
        return dao.getById(id);
    }
}



