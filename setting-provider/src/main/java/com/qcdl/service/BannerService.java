package com.qcdl.service;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.dao.BannerDao;
import com.qcdl.model.entity.SettingBanner;
import com.qcdl.model.param.PageParam;
import com.qcdl.rest.param.BannerParam;
import com.qcdl.service.impl.BannerServiceI;
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
    public PageInfo<BannerParam> bannerList(PageParam pageParam) {
        return new PageInfo<>(dao.bannerList(pageParam));
    }

    @Override
    public void bannerUpdate(BannerParam banner) {
        Boolean flag = dao.getId(banner.getId());
        Assert.isTrue(flag, "广告不存在!");
        dao.bannerUpdate(banner);
    }

    @Override
    public void bannerDelete(Integer id) {
        Boolean flag = dao.getId(id);
        Assert.isTrue(flag, "广告不存在!");
        dao.bannerDelete(id);
    }

}
