package com.qcdl.service.impl;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.entity.SettingInformation;
import com.qcdl.model.param.PageParam;
import com.qcdl.rest.param.InformationParam;

public interface InformationServiceI {
    /**
     * 查询案例管理列表
     *
     * @param pageParam
     * @param name
     * @return
     */
    PageInfo<SettingInformation> informationList(PageParam pageParam, String name, Integer ClassifyId);

    /**
     * 编辑案例内容
     *
     * @param information
     */
    void informationUpdate(SettingInformation information);

    /**
     * 删除案例
     *
     * @param id
     */
    void informationDelete(Integer id);

    /**
     * 增加案例
     *
     * @param information
     */
    void informationAdd(SettingInformation information);


}