package com.qcdl.service.impl;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.entity.SettingBanner;
import com.qcdl.rest.param.BannerPageParam;
import com.qcdl.rest.param.BannerParam;

/**
 * Created by yuanhua 2018/3/12.
 *
 * @author Administrator
 */
public interface BannerServiceI {
    /**
     * 获取广告列表
     *
     * @param param 分页查询参数
     * @return 广告分页列表
     */
    PageInfo<SettingBanner> list(BannerPageParam param);

    /**
     * 编辑广告
     *
     * @param param 广告编辑（添加）参数
     */
    void update(BannerParam param);

    /**
     * 删除广告
     *
     * @param id 广告ID
     */
    void delete(Integer id);

    /**
     * 添加广告
     *
     * @param param 广告编辑（添加）参数
     */
    void add(BannerParam param);

    /**
     * 获取广告详情
     *
     * @param id 广告ID
     * @return 广告详情
     */
    SettingBanner get(Integer id);
}
