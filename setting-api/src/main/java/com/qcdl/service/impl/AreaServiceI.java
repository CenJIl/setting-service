package com.qcdl.service.impl;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.entity.SettingArea;
import com.qcdl.rest.param.AreaPageParam;
import com.qcdl.rest.param.AreaParam;

/**
 * Created by hxh on 2018/3/15.
 */
public interface AreaServiceI {

    /**
     * 分页查询地区列表
     *
     * @param param 分页参数
     * @return 地区列表
     */
    PageInfo<SettingArea> list(AreaPageParam param);

    /**
     * 编辑地区信息
     *
     * @param param 地区参数
     */
    void update(AreaParam param);

    /**
     * 删除地区信息
     *
     * @param id 地区id
     */
    void delete(Integer id);

    /**
     * 添加地区信息
     *
     * @param param 地区 参数
     */
    void add(AreaParam param);

//    SettingBanner get(Integer id);
}
