package com.qcdl.service.impl;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.entity.SettingSpecial;
import com.qcdl.rest.param.SpecialPageParam;
import com.qcdl.rest.param.SpecialParam;

/**
 * @author 魏自东
 * @date 2018/3/16 9:51
 */
public interface SpecialServiceI {

    /**
     * 分页查询专题列表
     *
     * @param param 分页参数
     * @return 专题列表(分页)
     */
    PageInfo<SettingSpecial> list(SpecialPageParam param);

    /**
     * 修改专题
     *
     * @param param 专题参数
     */
    void update(SpecialParam param);

    /**
     * 删除一条专题
     *
     * @param id 专题id
     */
    void delete(Integer id);

    /**
     * 增加专题
     *
     * @param adminId 管理员Id
     * @param param   专题参数
     */
    void add(Integer adminId, SpecialParam param);

    /**
     * 获取专题详情
     *
     * @param id 专题ID
     * @return 专题详情
     */
    SettingSpecial get(Integer id);
}
