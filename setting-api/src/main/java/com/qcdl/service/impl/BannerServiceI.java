package com.qcdl.service.impl;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.entity.SettingBanner;
import com.qcdl.model.param.PageParam;
import com.qcdl.rest.param.BannerParam;

/**
 * Created by yuanhua 2018/3/12.
 *
 * @author Administrator
 */
public interface BannerServiceI {
    /**
     * 查询广告列表
     *
     * @param bannerParam
     * @return
     */
    PageInfo<SettingBanner> bannerList(BannerParam bannerParam);

    /**
     * 编辑广告内容
     *
     * @param banner
     */
    void bannerUpdate(SettingBanner banner);

    /**
     * 删除广告
     *
     * @param id
     */
    void bannerDelete(Integer id);

    /**
     * @param banner
     */
    void bannerAdd(SettingBanner banner);
}
