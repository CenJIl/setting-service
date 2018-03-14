package com.qcdl.model.dao;

import com.github.pagehelper.PageHelper;
import com.qcdl.model.entity.SettingBanner;
import com.qcdl.model.enums.DeleteType;
import com.qcdl.model.mapper.SettingBannerMapper;
import com.qcdl.model.param.PageParam;
import com.qcdl.rest.param.BannerParam;
import org.restful.api.utils.Assert;
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

    /**
     * 广告列表
     *
     * @param pageParam 分页参数
     * @return
     */
    public List<BannerParam> bannerList(PageParam pageParam) {
        if (pageParam.getPageSize() != null && pageParam.getPageSize() > 0) {
            PageHelper.startPage(pageParam.getPage(), pageParam.getPageSize());
        }
        BannerParam bannerParam = new BannerParam();
        return mapper.bannerList(bannerParam);
    }

    /**
     * 修改广告内容
     *
     * @param banner 广告参数
     */
    public void bannerUpdate(BannerParam banner) {
        banner.setUpdateTime(new Date());
        banner.setCreateTime(null);
        mapper.updateByPrimaryKeySelective(banner);
    }

    /**
     * 根据id删除一条广告
     *
     * @param id 广告id
     */
    public void bannerDelete(Integer id) {
        SettingBanner banner = new SettingBanner();
        banner.setId(id);
        // 假删除
        banner.setDeleted(DeleteType.已删除.getCode());
        mapper.updateByPrimaryKeySelective(banner);
    }

    public Boolean getId(Integer id) {
        return mapper.selectCountByExample(id) > 0;
    }
}
