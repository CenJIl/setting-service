package com.qcdl.rest.param;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author yuanhua
 * @date 2018/3/15
 */
public class AreaPageParam {
    @ApiModelProperty(value = "权重值,从小到大排序,最小0,最大999", example = "1")
    private Integer weight;
    @ApiModelProperty(value = "当前页", example = "1")
    private Integer page = 1;
    @ApiModelProperty(value = "每页条数", example = "10")
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
