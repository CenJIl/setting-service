package com.qcdl.rest.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by yuanhua 2018/3/12.
 *
 * @author Administrator
 */
@ApiModel("广告编辑（添加）参数")
public class BannerParam implements Serializable {
    @ApiModelProperty(value = "广告id,编辑的时候必须填写", example = "1")
    private Integer id;
    @ApiModelProperty(value = "广告名称", example = "这是一条广告")
    private String name;
    @ApiModelProperty(value = "广告图片", example = "/baidu.jpg")
    private String picture;
    @ApiModelProperty(value = "广告链接", example = "http://www.baidu.com")
    private String url;
    @ApiModelProperty(value = "广告位置", example = "1")
    private Integer position;
    @ApiModelProperty(value = "权重值,数值越小越靠前，最大999，最小0", example = "1")
    private Integer weight;
    @ApiModelProperty(hidden = true)
    private Integer adminId;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

}
