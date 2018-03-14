package com.qcdl.model.mapper;

import com.qcdl.model.entity.SettingSpecial;
import com.qcdl.rest.param.SpecialParam;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

public interface SettingSpecialMapper extends Mapper<SettingSpecial>, MySqlMapper<SettingSpecial> {

    List<SpecialParam> specialList(SpecialParam specialParam);
}