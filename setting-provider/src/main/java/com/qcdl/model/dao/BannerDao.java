package com.qcdl.model.dao;

import com.github.pagehelper.PageHelper;
import com.qcdl.model.mapper.SettingBannerMapper;
import com.qcdl.model.param.PageParam;
import com.qcdl.rest.param.BannerParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
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

    public List<BannerParam> bannerList(PageParam pageParam) {
        if (pageParam.getPageSize() != null && pageParam.getPageSize() > 0) {
            PageHelper.startPage(pageParam.getPage(), pageParam.getPageSize());
        }
        BannerParam bannerParam = new BannerParam();
        return mapper.bannerList(bannerParam);
    }
}
