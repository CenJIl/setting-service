package com.qcdl.rest.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;


@ApiModel("专题添加与修改参数")
public class SpecialParam implements Serializable {

    /**
     * 专题id
     */
    @ApiModelProperty(value = "专题id,编辑时必须填写", example = "1")
    private Integer id;

    /**
     * 广告名称
     */
    @ApiModelProperty(value = "广告名称", example = "这是一条广告")
    private String name;

    /**
     * 广告图片
     */
    @ApiModelProperty(value = "广告图片", example = "/123.jpg")
    private String cover;

    /**
     * 广告链接
     */
    @ApiModelProperty(value = "广告链接", example = "http://www.baidu.com")
    private String url;

    /**
     * 广告描述
     */
    @ApiModelProperty(value = "广告描述", example = "描述")
    private String described;

    /**
     * 权重值，数值越小越靠前，最大999，最小0
     */
    @ApiModelProperty(value = "权重值", example = "1")
    private Integer weight;

    /**
     * 获取专题id
     *
     * @return id - 专题id
     */
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
     * @return described 专题描述
     */
    public String getDescribed() {
        return described;
    }

    /**
     * 设置专题描述
     *
     * @param described 专题描述
     */
    public void setDescribed(String described) {
        this.described = described;
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
}
