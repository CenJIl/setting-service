package com.qcdl.rest.param;

import com.qcdl.model.entity.SettingInformation;
import io.swagger.annotations.ApiModel;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

@ApiModel

public class InformationParam extends SettingInformation {


    private Integer id;
    private String name;
    private String cover;
    private String url;
    private Integer industry;
    private String author;
    private Integer adminId;
    private String twoLevelIndustry;

    @Column(name="update_time")

    private Date updateTime;

    @Column(name = "create_time")
    private Date createTime;

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

    public Integer getIndustry() {
        return industry;
    }

    public void setIndustry(Integer industry) {
        this.industry = industry;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getTwoLevelIndustry() {
        return twoLevelIndustry;
    }

    public void setTwoLevelIndustry(String twoLevelIndustry) {
        this.twoLevelIndustry = twoLevelIndustry;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public InformationParam(){}

    public InformationParam(Integer id, String name, String cover, String url, Integer industry, String author, Integer adminId, String twoLevelIndustry, Date updateTime, Date createTime) {
        this.id = id;
        this.name = name;
        this.cover = cover;
        this.url = url;
        this.industry = industry;
        this.author = author;
        this.adminId = adminId;
        this.twoLevelIndustry = twoLevelIndustry;
        this.updateTime = updateTime;
        this.createTime = createTime;
    }
}
