package com.qcdl.service.impl;

import com.qcdl.model.entity.SettingArea;
import com.qcdl.rest.param.AreaParam;

import java.util.List;

/**
 * @author 魏自东
 * @date 2018/3/16 10:32
 */
public interface AreaServiceI {

    /**
     * 获取地区列表
     *
     * @return 地区列表
     */
    List<SettingArea> list();

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

    /**
     * 获取地区级联树
     *
     * @return 地区树
     */
    List<SettingArea> tree();

}
