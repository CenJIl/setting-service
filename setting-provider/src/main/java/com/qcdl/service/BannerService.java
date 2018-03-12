package com.qcdl.service;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.dao.BannerDao;
import com.qcdl.model.param.PageParam;
import com.qcdl.rest.param.BannerParam;
import com.qcdl.service.impl.BannerServiceI;
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

}
