package com.qcdl.service.impl;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.entity.SettingInformation;
import com.qcdl.rest.param.InformationPageParam;
import com.qcdl.rest.param.InformationParam;

public interface InformationServiceI {
    /**
     * 分页查询案例列表
     *
     * @param param 分页,名称,行业id
     * @return
     */
    PageInfo<SettingInformation> list(InformationPageParam param);

    /**
     * 增加案例
     *
     * @param param 案例参数
     */
    void add(InformationParam param);

    /**
     * 查询案例详情
     *
     * @param id
     * @return
     */
    SettingInformation getId(Integer id);

    /**
     * 修改案例信息
     *
     * @param param 案例参数
     */
    void update(InformationParam param);

    /**
     * 删除案例
     *
     * @param id
     */
    void delete(Integer id);
}
