package com.qcdl.rest.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author 魏自东
 * @date 2018/3/16 10:12
 */
@ApiModel("案例添加与修改参数")
public class InformationParam implements Serializable {
    @ApiModelProperty(value = "案例id,编辑时必须填写", example = "1")
    private Integer id;
    @ApiModelProperty(value = "案例名称", example = "这是一个案例")
    private String name;
    @ApiModelProperty(value = "封面图", example = "/123.jpg")
    private String cover;
    @ApiModelProperty(value = "文章链接", example = "http://www.baidu.com")
    private String url;
    @ApiModelProperty(value = "行业id", example = "1")
    private Integer industryId;
    @ApiModelProperty(value = "作者", example = "作者")
    private String author;
    @ApiModelProperty(value = "案例描述", example = "描述")
    private String description;
    @ApiModelProperty("案例内容")
    private String content;

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

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Integer industryId) {
        this.industryId = industryId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
