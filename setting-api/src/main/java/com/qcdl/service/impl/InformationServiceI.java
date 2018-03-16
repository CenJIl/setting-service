package com.qcdl.service.impl;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.entity.SettingInformation;
import com.qcdl.rest.dto.InformationDto;
import com.qcdl.rest.param.InformationPageParam;
import com.qcdl.rest.param.InformationParam;

/**
 * @author 魏自东
 * @date 2018/3/16 10:14
 */
public interface InformationServiceI {
    /**
     * 分页查询案例列表
     *
     * @param param 分页,名称,行业id
     * @return 案例分页列表
     */
    PageInfo<InformationDto> list(InformationPageParam param);

    /**
     * 增加案例
     *
     * @param param   案例参数
     * @param adminId 管理员ID
     */
    void add(Integer adminId, InformationParam param);

    /**
     * 查询案例详情
     *
     * @param id 案例ID
     * @return 案例
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
     * @param id 案例ID
     */
    void delete(Integer id);
}
