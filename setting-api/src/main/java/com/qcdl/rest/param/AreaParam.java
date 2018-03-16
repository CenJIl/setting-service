package com.qcdl.rest.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author 魏自东
 * @date 2018/3/16 10:39
 */
@ApiModel("地区添加与修改参数")
public class AreaParam implements Serializable {
    @ApiModelProperty(value = "地区id,修改地区信息时必填", example = "1")
    private Integer id;
    @ApiModelProperty(value = "地区名称", example = "武汉市")
    private String name;
    @ApiModelProperty(value = "父级地区id,0为顶级", example = "1")
    private Integer pid;
    @ApiModelProperty(value = "权重值,从小到大排序,最小0,最大999", example = "1")
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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
