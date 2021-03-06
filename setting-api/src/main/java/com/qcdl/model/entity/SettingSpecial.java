package com.qcdl.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 魏自东
 * @date 2018/3/16 15:18
 */
@Table(name = "setting_special")
@ApiModel("专题")
public class SettingSpecial implements Serializable {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("ID")
    private Integer id;

    /**
     * 专题名称
     */
    @ApiModelProperty("专题名称")
    private String name;

    /**
     * 封面图
     */
    @ApiModelProperty("封面图")
    private String cover;

    /**
     * 专题链接
     */
    @ApiModelProperty("专题链接")
    private String url;

    /**
     * 权重值,数值越小越靠前,最小0，最大999
     */
    @ApiModelProperty("权重值,数值越小越靠前,最小0，最大999")
    private Integer weight;

    /**
     * 管理员id
     */
    @Column(name = "admin_id")
    @ApiModelProperty(hidden = true)
    private Integer adminId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @ApiModelProperty("更新时间")
    private Date updateTime;

    /**
     * 版本号
     */
    @ApiModelProperty(hidden = true)
    private Integer version;

    /**
     * 删除状态(0.启用;1.禁用;2已删除)
     */
    @ApiModelProperty("删除状态(0.启用;1.禁用;2已删除)")
    private Integer deleted;

    /**
     * 专题描述
     */
    @ApiModelProperty("专题描述")
    private String described;

    /**
     * 专题内容（富文本）
     */
    @ApiModelProperty("专题内容（富文本）")
    private String content;

    private static final long serialVersionUID = 1L;

    /**
     * 获取删除状态(默认启用):0.启用;1.禁用;2.已删除;
     *
     * @return id - 删除状态(默认启用):0.启用;1.禁用;2.已删除;
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置删除状态(默认启用):0.启用;1.禁用;2.已删除;
     *
     * @param id 删除状态(默认启用):0.启用;1.禁用;2.已删除;
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取专题名称
     *
     * @return name - 专题名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置专题名称
     *
     * @param name 专题名称
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
     * 获取专题链接
     *
     * @return url - 专题链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置专题链接
     *
     * @param url 专题链接
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取权重值,数值越小越靠前,最小0，最大999
     *
     * @return weight - 权重值,数值越小越靠前,最小0，最大999
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 设置权重值,数值越小越靠前,最小0，最大999
     *
     * @param weight 权重值,数值越小越靠前,最小0，最大999
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
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
     * 获取删除状态(0.启用;1.禁用;2已删除)
     *
     * @return deleted - 删除状态(0.启用;1.禁用;2已删除)
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 设置删除状态(0.启用;1.禁用;2已删除)
     *
     * @param deleted 删除状态(0.启用;1.禁用;2已删除)
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取专题描述
     *
     * @return described - 专题描述
     */
    public String getDescribed() {
        return described;
    }

    /**
     * 设置专题描述
     *
     * @param described 专题描述
     */
    public void setDescribed(String described) {
        this.described = described;
    }

    /**
     * 获取专题内容（富文本）
     *
     * @return content - 专题内容（富文本）
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置专题内容（富文本）
     *
     * @param content 专题内容（富文本）
     */
    public void setContent(String content) {
        this.content = content;
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
        sb.append(", weight=").append(weight);
        sb.append(", adminId=").append(adminId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", version=").append(version);
        sb.append(", deleted=").append(deleted);
        sb.append(", described=").append(described);
        sb.append(", content=").append(content);
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
        SettingSpecial other = (SettingSpecial) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getCover() == null ? other.getCover() == null : this.getCover().equals(other.getCover()))
                && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
                && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
                && (this.getAdminId() == null ? other.getAdminId() == null : this.getAdminId().equals(other.getAdminId()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
                && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
                && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
                && (this.getDescribed() == null ? other.getDescribed() == null : this.getDescribed().equals(other.getDescribed()))
                && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCover() == null) ? 0 : getCover().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getAdminId() == null) ? 0 : getAdminId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getDescribed() == null) ? 0 : getDescribed().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}