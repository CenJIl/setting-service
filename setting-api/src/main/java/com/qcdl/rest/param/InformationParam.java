package com.qcdl.rest.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel("案例编辑（）添加参数")
public class InformationParam implements Serializable {

    @ApiModelProperty(value = "案例id，编辑的时候必须填写", example = "1")
    private Integer id;
    @ApiModelProperty(value = "案例名称", example = "这是一个案例")
    private String name;
    @ApiModelProperty(value = "案例图片", example = "/baidu.jpg")
    private String picture;
    @ApiModelProperty(value = "案例链接", example = "http://www.baidu.com")
    private String url;
    @ApiModelProperty(value = "案例位置", example = "1")
    private String position;
    @ApiModelProperty(value = "权重值，数值越小越靠前，最大999，最小0", example = "1")
    private String weight;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
