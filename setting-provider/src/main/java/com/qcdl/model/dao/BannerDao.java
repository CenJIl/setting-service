package com.qcdl.model.dao;

import com.github.pagehelper.PageHelper;
import com.qcdl.model.entity.SettingBanner;
import com.qcdl.model.enums.DeleteType;
import com.qcdl.model.mapper.SettingBannerMapper;
import com.qcdl.rest.param.BannerPageParam;
import com.qcdl.rest.param.BannerParam;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Arrays;
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
     * 获取广告列表
     *
     * @param param 分页查询参数
     * @return 广告分页列表
     */
    public List<SettingBanner> list(BannerPageParam param) {
        Example e = new Example(SettingBanner.class);
        Example.Criteria c = e.createCriteria();
        if (param.getPosition() != null && param.getPosition() > 0) {
            c.andIn("position", Arrays.asList(0, param.getPosition()));
        }
        c.andIn("deleted", Arrays.asList(DeleteType.启用.getCode(), DeleteType.禁用.getCode()));
        e.orderBy("weight").asc().orderBy("createTime").desc();
        if (param.getPageSize() != null && param.getPageSize() > 0) {
            PageHelper.startPage(param.getPage(), param.getPageSize());
        }
        return mapper.selectByExample(e);
    }

    /**
     * 删除一条广告
     *
     * @param id 广告ID
     */
    public void delete(Integer id) {
        SettingBanner banner = new SettingBanner();
        banner.setId(id);
        banner.setDeleted(DeleteType.已删除.getCode());
        mapper.updateByPrimaryKeySelective(banner);
    }

    /**
     * 根据ID获取
     *
     * @param id 广告ID
     * @return 广告
     */
    public SettingBanner getById(Integer id) {
        SettingBanner banner = new SettingBanner();
        banner.setId(id);
        banner.setDeleted(DeleteType.启用.getCode());
        return mapper.selectOne(banner);
    }

    /**
     * 更新广告
     *
     * @param banner 待更新广告
     */
    public void update(SettingBanner banner) {
        Example e = new Example(SettingBanner.class);
        Example.Criteria c = e.createCriteria();
        c.andEqualTo("id", banner.getId());
        c.andEqualTo("version", banner.getVersion());
        banner.setVersion(banner.getVersion() + 1);
        mapper.updateByExampleSelective(banner, e);
    }

    /**
     * 添加广告
     *
     * @param param 待添加广告
     */
    public void add(BannerParam param) {
        SettingBanner banner = new SettingBanner();
        banner.setDeleted(DeleteType.启用.getCode());
        banner.setVersion(0);
        banner.setCreateTime(new Date());
        banner.setAdminId(param.getAdminId());
        banner.setPosition(param.getPosition());
        banner.setPicture(param.getPicture());
        banner.setUrl(param.getUrl());
        banner.setWeight(param.getWeight());
        banner.setName(param.getName());
        mapper.insertSelective(banner);
    }
}
