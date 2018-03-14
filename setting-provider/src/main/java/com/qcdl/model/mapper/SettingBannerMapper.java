package com.qcdl.model.mapper;

import com.qcdl.model.entity.SettingBanner;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

public interface SettingBannerMapper extends Mapper<SettingBanner>, MySqlMapper<SettingBanner> {
    /**
     * 查询广告列表
     *
     * @param position
     * @return
     */
    List<SettingBanner> bannerList(@Param(value = "position") Integer position);

}