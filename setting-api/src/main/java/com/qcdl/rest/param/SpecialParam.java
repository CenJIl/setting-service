package com.qcdl.rest.param;

import com.qcdl.model.entity.SettingSpecial;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel("专题编辑（添加）参数")

public class SpecialParam extends SettingSpecial {
    @ApiModelProperty(value = "专题id，编辑的时候必须填写", example = "1")
    private Integer id;
    @ApiModelProperty(value = "专题名称", example = "这是一个专题")
    private String name;
    @ApiModelProperty(value = "专题封面", example = "/baidu.jpg")
    private String cover;
    @ApiModelProperty(value = "专题链接", example = "http:/www.baidu.com")
    private String url;
    @ApiModelProperty(value = "专题描述", example = "这个专题很好")
    private String describe;
    @ApiModelProperty(value = "专题一级菜单", example = "联系我们/资源介绍/广告模式")
    private String menu;
    @ApiModelProperty(value = "专题二级菜单", example = "（“联系我们”链接-->）邮箱，电话")
    private String twoLevelMenu;
    @ApiModelProperty(value = "权重值，数值越小越靠前，最大999，最小0", example = "1")
    private Integer weight;
    @ApiModelProperty(hidden = true)
    private Integer adminId;


    public Integer getId() {
        return id;
    }

    /**
     * 设置专题id
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
     * 设置专题一级菜单
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

}
