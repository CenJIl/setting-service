package com.qcdl.service.impl;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.entity.SettingInformation;
import com.qcdl.model.param.PageParam;
import com.qcdl.rest.param.InformationParam;

public interface InformationServicel {
    /**
     * 查询资讯管理列表
     *
     * @param pageParam
     * @return
     */
    PageInfo<InformationParam> informationlist(PageParam pageParam, String name);

    /**
     * 编辑咨询内容
     *
     * @param information
     */
    void informationUpdate(SettingInformation information);

    /**
     * 删除广告
     *
     * @param id
     */
    void informationDelete(Integer id);

    /**
     * 增加广告
     *
     * @param information
     */
    void informationAdd(SettingInformation information);


}
