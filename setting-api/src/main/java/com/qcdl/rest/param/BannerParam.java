package com.qcdl.rest.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by yuanhua 2018/3/12.
 *
 * @author Administrator
 */
@ApiModel
public class BannerParam implements Serializable {

    /**
     * 广告位置()
     */
    @ApiModelProperty(value = "分类位置", example = "1")
    private Integer position;

    /**
     * 当前页，默认值是1
     */
    @ApiModelProperty(value = "当前页", required = true, example = "1")
    private Integer page = 1;
    /**
     * 每页条数,默认值是10
     */
    @ApiModelProperty(value = "每页条数", required = false, example = "10")
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
