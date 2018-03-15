package com.qcdl.rest.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by yuanhua 2018/3/12.
 *
 * @author Administrator
 */
@ApiModel("广告列表分页查询参数")
public class BannerPageParam implements Serializable {
    @ApiModelProperty(value = "广告位置,0:所有广告位置,1-999:其他广告位置", example = "0")
    private Integer position;
    @ApiModelProperty(value = "当前页", example = "1")
    private Integer page = 1;
    @ApiModelProperty(value = "每页条数", example = "10")
    private Integer pageSize = 10;

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
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
