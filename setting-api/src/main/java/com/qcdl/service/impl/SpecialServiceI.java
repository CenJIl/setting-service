package com.qcdl.service.impl;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.entity.SettingSpecial;
import com.qcdl.rest.param.SpecialParam;
import com.qcdl.rest.param.specialPageParam;

public interface SpecialServiceI {

    /**
     * 查询专题列表
     *
     * @param param
     * @return
     */
    PageInfo<SettingSpecial> list(specialPageParam param);

    /**
     * 编辑专题内容
     *
     * @param param
     */
    void update(SpecialParam param);

    /**
     * @param id
     */
    void delete(Integer id);

    /**
     * 增加专题
     *
     * @param param
     */
    void add(SpecialParam param);

}
