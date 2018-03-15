package com.qcdl.rest.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by hxh on 2018/3/15.
 */
@ApiModel("专题分页参数")
public class specialPageParam implements Serializable {

    @ApiModelProperty(value = "权重值,数值越小越靠前,最小0，最大999", example = "1")
    private Integer weight;
    @ApiModelProperty(value = "当前页", required = true, example = "1")
    private Integer page = 1;
    @ApiModelProperty(value = "每页条数", required = false, example = "10")
    private Integer pageSize = 10;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
