package com.qcdl.rest.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by hxh on 2018/3/15.
 */
@ApiModel("行业添加与修改参数")
public class industryParam implements Serializable {

    @ApiModelProperty(value = "行业id", example = "1")
    private Integer id;

    @ApiModelProperty(value = "行业名称", example = "建材")
    private String name;

    @ApiModelProperty(value = "行业父id", example = "1")
    private Integer parentId;

    @ApiModelProperty(value = "url地址", example = "http://www.baidu.com")
    private String url;

    @ApiModelProperty(value = "权重值,从小到大,0最小,999最大", example = "1")
    private Integer weight;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
