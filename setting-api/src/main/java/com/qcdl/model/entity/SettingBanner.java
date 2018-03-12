package com.qcdl.model.entity;

import io.swagger.annotations.ApiModel;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "setting_banner")
@ApiModel("广告管理")
public class SettingBanner implements Serializable {
    /**
     * 广告id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 广告名称
     */
    private String name;

    /**
     * 广告图片
     */
    private String picture;

    /**
     * 广告链接
     */
    private String url;

    /**
     * 广告位置()
     */
    private Integer position;

    /**
     * 权重值,数值越小越靠前，最大999，最小0
     */
    private Integer weight;

    /**
     * 管理员id
     */
    @Column(name = "admin_id")
    private Integer adminId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 删除状态(默认启用):0.启用;1.禁用;2.已删除;
     */
    private Integer deleted;

    private static final long serialVersionUID = 1L;

    /**
     * 获取广告id
     *
     * @return id - 广告id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置广告id
     *
     * @param id 广告id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取广告名称
     *
     * @return name - 广告名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置广告名称
     *
     * @param name 广告名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取广告图片
     *
     * @return picture - 广告图片
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 设置广告图片
     *
     * @param picture 广告图片
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * 获取广告链接
     *
     * @return url - 广告链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置广告链接
     *
     * @param url 广告链接
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取广告位置()
     *
     * @return position - 广告位置()
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * 设置广告位置()
     *
     * @param position 广告位置()
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * 获取权重值,数值越小越靠前，最大999，最小0
     *
     * @return weight - 权重值,数值越小越靠前，最大999，最小0
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 设置权重值,数值越小越靠前，最大999，最小0
     *
     * @param weight 权重值,数值越小越靠前，最大999，最小0
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
        sb.append(", picture=").append(picture);
        sb.append(", url=").append(url);
        sb.append(", position=").append(position);
        sb.append(", weight=").append(weight);
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
        SettingBanner other = (SettingBanner) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPicture() == null ? other.getPicture() == null : this.getPicture().equals(other.getPicture()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
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
        result = prime * result + ((getPicture() == null) ? 0 : getPicture().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getAdminId() == null) ? 0 : getAdminId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }
}