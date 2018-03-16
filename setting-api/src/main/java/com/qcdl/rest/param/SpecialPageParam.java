package com.qcdl.rest.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author 魏自东
 * @date 2018/3/16 9:51
 */
@ApiModel("专题分页参数")
public class SpecialPageParam implements Serializable {
    @ApiModelProperty(value = "当前页", required = true, example = "1")
    private Integer page = 1;
    @ApiModelProperty(value = "每页条数", required = false, example = "10")
    private Integer pageSize = 10;

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
