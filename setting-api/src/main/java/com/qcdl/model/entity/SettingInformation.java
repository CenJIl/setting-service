package com.qcdl.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 魏自东
 * @date 2018/3/16 10:09
 */
@Table(name = "setting_information")
@ApiModel("案例管理")
public class SettingInformation implements Serializable {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "案例id", example = "1")
    private Integer id;

    /**
     * 案例名称
     */
    @ApiModelProperty(value = "案例名称", example = "这是一个案例")
    private String name;

    /**
     * 封面图
     */
    @ApiModelProperty(value = "封面图", example = "123.jpg")
    private String cover;

    /**
     * 文章链接
     */
    @ApiModelProperty(value = "文章链接")
    private String url;

    /**
     * 行业
     */
    @ApiModelProperty(value = "行业", example = "1")
    private Integer industryId;

    /**
     * 作者
     */
    @ApiModelProperty(value = "作者", example = "作者")
    private String author;

    /**
     * 管理员id
     */
    @Column(name = "admin_id")
    @ApiModelProperty(value = "管理员id", example = "1")
    private Integer adminId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value = "创建时间", example = "2018-3-14 15:49:05")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @ApiModelProperty(value = "更新时间", example = "2018-3-14 15:49:11")
    private Date updateTime;

    /**
     * 版本号
     */
    @ApiModelProperty(value = "版本号", example = "1")
    private Integer version;

    /**
     * 删除状态(默认启用):0.启用;1.禁用;2.已删除;
     */
    @ApiModelProperty(value = "删除状态(默认启用):0.启用;1.禁用;2.已删除;", example = "1")
    private Integer deleted;

    private static final long serialVersionUID = 1L;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取案例名称
     *
     * @return name - 案例名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置案例名称
     *
     * @param name 案例名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取封面图
     *
     * @return cover - 封面图
     */
    public String getCover() {
        return cover;
    }

    /**
     * 设置封面图
     *
     * @param cover 封面图
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * 获取文章链接
     *
     * @return url - 文章链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置文章链接
     *
     * @param url 文章链接
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取行业
     *
     * @return industryId - 行业
     */
    public Integer getIndustryId() {
        return industryId;
    }

    /**
     * 设置行业
     *
     * @param industryId 行业
     */
    public void setIndustryId(Integer industryId) {
        this.industryId = industryId;
    }

    /**
     * 获取作者
     *
     * @return author - 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置作者
     *
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取管理员id
     *
     * @return admin_id - 管理员id
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * 设置管理员id
     *
     * @param adminId 管理员id
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取版本号
     *
     * @return version - 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 获取删除状态(默认启用):0.启用;1.禁用;2.已删除;
     *
     * @return deleted - 删除状态(默认启用):0.启用;1.禁用;2.已删除;
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 设置删除状态(默认启用):0.启用;1.禁用;2.已删除;
     *
     * @param deleted 删除状态(默认启用):0.启用;1.禁用;2.已删除;
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", cover=").append(cover);
        sb.append(", url=").append(url);
        sb.append(", industryId=").append(industryId);
        sb.append(", author=").append(author);
        sb.append(", adminId=").append(adminId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", version=").append(version);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SettingInformation other = (SettingInformation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getCover() == null ? other.getCover() == null : this.getCover().equals(other.getCover()))
                && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
                && (this.getIndustryId() == null ? other.getIndustryId() == null : this.getIndustryId().equals(other.getIndustryId()))
                && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
                && (this.getAdminId() == null ? other.getAdminId() == null : this.getAdminId().equals(other.getAdminId()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
                && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
                && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCover() == null) ? 0 : getCover().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getIndustryId() == null) ? 0 : getIndustryId().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getAdminId() == null) ? 0 : getAdminId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }
}