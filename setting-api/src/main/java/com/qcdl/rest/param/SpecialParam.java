package com.qcdl.rest.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author 魏自东
 * @date 2018/3/16 9:52
 */
@ApiModel("专题添加与修改参数")
public class SpecialParam implements Serializable {
    @ApiModelProperty(value = "专题id,编辑时必须填写", example = "1")
    private Integer id;
    @ApiModelProperty(value = "专题名称", example = "这是一条专题")
    private String name;
    @ApiModelProperty(value = "封面图", example = "/123.jpg")
    private String cover;
    @ApiModelProperty(value = "专题链接", example = "http://www.baidu.com")
    private String url;
    @ApiModelProperty(value = "专题描述", example = "描述")
    private String described;
    @ApiModelProperty(value = "权重值", example = "1")
    private Integer weight;

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

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescribed() {
        return described;
    }

    public void setDescribed(String described) {
        this.described = described;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
