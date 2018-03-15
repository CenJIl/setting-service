package com.qcdl.rest.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author Administrator
 */
@ApiModel("案例分页参数")
public class InformationPageParam implements Serializable {

    @ApiModelProperty(value = "案例名称,为空时查询全部", required = true, example = "案例")
    private String name;

    @ApiModelProperty(value = "行业id,为0时查询全部", required = true, example = "1")
    private Integer industryId;

    @ApiModelProperty(value = "当前页", required = true, example = "1")
    private Integer page = 1;

    @ApiModelProperty(value = "每页条数", required = false, example = "10")
    private Integer pageSize = 10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Integer industryId) {
        this.industryId = industryId;
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
