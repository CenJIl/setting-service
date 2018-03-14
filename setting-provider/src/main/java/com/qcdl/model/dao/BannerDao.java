package com.qcdl.model.dao;

import com.github.pagehelper.PageHelper;
import com.qcdl.model.entity.SettingBanner;
import com.qcdl.model.enums.DeleteType;
import com.qcdl.model.mapper.SettingBannerMapper;
import com.qcdl.rest.param.BannerParam;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by yuanhua 2018/3/12.
 *
 * @author Administrator
 */
@Component
public class BannerDao {

    @Resource
    private SettingBannerMapper mapper;

    public List<SettingBanner> bannerList(BannerParam bannerParam) {
        if (bannerParam.getPageSize() != null && bannerParam.getPageSize() > 0) {
            PageHelper.startPage(bannerParam.getPage(), bannerParam.getPageSize());
        }
        return mapper.bannerList(bannerParam.getPosition());
    }

    public void bannerUpdate(SettingBanner banner) {
        banner.setUpdateTime(new Date());
        mapper.updateByPrimaryKeySelective(banner);
    }

    public void bannerDelete(Integer id) {
        SettingBanner banner = new SettingBanner();
        banner.setId(id);
        banner.setDeleted(DeleteType.已删除.getCode());
        mapper.updateByPrimaryKeySelective(banner);
    }

    public void bannerAdd(SettingBanner banner) {
        mapper.insertSelective(banner);
    }
}
