package com.qcdl.model.mapper;

import com.qcdl.model.entity.SettingInformation;
import com.qcdl.rest.param.InformationParam;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

public interface SettingInformationMapper extends Mapper<SettingInformation>, MySqlMapper<SettingInformation> {

    List<SettingInformation> informationList(@Param(value = "name") String name, @Param(value = "ClassifyId") Integer ClassifyId);

}