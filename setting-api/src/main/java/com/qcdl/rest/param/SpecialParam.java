package com.qcdl.rest.param;

import com.qcdl.model.entity.SettingSpecial;
import io.swagger.annotations.ApiModel;

import javax.persistence.Column;
import java.util.Date;


@ApiModel

public class SpecialParam extends SettingSpecial {

    /**
     * 专题id
     */
    private Integer id;

    /**
     * 广告名称
     */
    private String name;

    /**
     * 广告图片
     */
    private String cover;

    /**
     * 广告链接
     */
    private String url;

    /**
     * 广告描述
     */
    private String describe;
    /**
     * 一级菜单
     */
    private String menu;
    /**
     * 二级菜单
     */
    private String twoLevelMenu;
    /**
     * 权重值，数值越小越靠前，最大999，最小0
     */
    private Integer weight;
    /**
     * 管理员id
     */
    private Integer adminId;
    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;
    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取专题id
     *
     * @return id - 专题id
     */
    public Integer getId() {
        return id;
    }

    /**
     *设置专题id
     *
     * @param id 专题id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取专题名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 设置专题名称
     *
     * @param name 专题名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获得封面图
     *
     * @return
     */
    public String getCover() {
        return cover;
    }

    /**
     * 设置封面图
     *
     * @param cover 封面图
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * 获取专题链接
     *
     * @return url 专题链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置专题链接
     *
     * @param url 专题链接
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获得专题描述
     *
     * @return describe 专题描述
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 设置专题描述
     *
     * @param describe 专题描述
     */
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    /**
     * 获得专题菜单
     *
     * @return menu 专题菜单
     */
    public String getMenu() {
        return menu;
    }

    /**
     * 设置专题菜单
     *
     * @param menu 一级菜单
     */
    public void setMenu(String menu) {
        this.menu = menu;
    }

    /**
     * 获得专题二级菜单
     *
     * @return twoLevalMenu 二级菜单
     */
    public String getTwoLevelMenu() {
        return twoLevelMenu;
    }

    /**
     * 设置专题二级菜单
     *
     * @param twoLevelMenu 二级菜单
     */
    public void setTwoLevelMenu(String twoLevelMenu) {
        this.twoLevelMenu = twoLevelMenu;
    }

    /**
     * 获得专题权重，数值越小越靠前,最小0，最大999
     *
     * @return weight 权重值
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 设置专题权重值，数值越小越靠前，最小0，最大999
     *
     * @param weight 权重值,数值越小越靠前,最小0，最大999
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 获得管理员id
     *
     * @return id 管理员id
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * 设置管理员id
     *
     * @param adminId 管理员id
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * 获得创建时间
     *
     * @return create-time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获得更新时间
     *
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
