package com.qcdl.service.impl;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.entity.SettingSpecial;
import com.qcdl.model.param.PageParam;
import com.qcdl.rest.param.SpecialParam;

public interface SpecialServiceI {

    /**
     * 查询专题列表
     *
     * @param pageParm
     * @return
     */
    PageInfo<SpecialParam> specialList(PageParam pageParm);

    /**
     * 编辑专题内容
     *
     * @param special
     */
    void specialUpdate(SettingSpecial special);

    /**
     *
     * @param id
     */
    void specialDelete(Integer id);

    /**
     * 增加专题
     *
     * @param special
     */
    void specialAdd(SettingSpecial special);


}
