package com.qcdl.model.mapper;

import com.qcdl.model.entity.SettingInformation;
import com.qcdl.rest.dto.InformationDto;
import com.qcdl.rest.param.InformationPageParam;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

/**
 * @author 魏自东
 * @date 2018/3/16 10:16
 */
public interface SettingInformationMapper extends Mapper<SettingInformation>, MySqlMapper<SettingInformation> {
    /**
     * 查询案例列表
     *
     * @param param 查询参数
     * @return 案例列表
     */
    List<InformationDto> informationList(InformationPageParam param);

}