package com.qcdl.rest.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author 魏自东
 * @date 2018/3/16 10:55
 */
@ApiModel("行业添加与修改参数")
public class IndustryParam implements Serializable {

    @ApiModelProperty(value = "行业id,编辑时必须填写", example = "1")
    private Integer id;

    @ApiModelProperty(value = "行业名称", example = "建材")
    private String name;

    @ApiModelProperty(value = "行业父id,0为顶级行业", example = "1")
    private Integer pid;

    @ApiModelProperty(value = "权重值,从小到大,0最小,999最大", example = "1")
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
