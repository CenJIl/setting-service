package com.qcdl.model.entity;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class industry implements Serializable {
    /**
     * 分类id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "分类id", example = "1")
    private Integer id;

    /**
     * 分类名称
     */
    @ApiModelProperty(value = "分类名称", example = "1")
    private String name;

    /**
     * 分类父id(0为无父id)
     */
    @Column(name = "parent_id")
    @ApiModelProperty(value = "分类id", example = "1")
    private Integer parentId;

    /**
     * 跳转路径
     */
    private String url;

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
     * 权重值,从小到大,0最小,999最大
     */
    private Integer weight;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 删除状态(0.启用;1.禁用;2.删除)
     */
    private Integer deleted;

    private static final long serialVersionUID = 1L;

    /**
     * 获取分类id
     *
     * @return id - 分类id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置分类id
     *
     * @param id 分类id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取分类名称
     *
     * @return name - 分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分类名称
     *
     * @param name 分类名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取分类父id(0为无父id)
     *
     * @return parent_id - 分类父id(0为无父id)
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置分类父id(0为无父id)
     *
     * @param parentId 分类父id(0为无父id)
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取跳转路径
     *
     * @return url - 跳转路径
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置跳转路径
     *
     * @param url 跳转路径
     */
    public void setUrl(String url) {
        this.url = url;
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
     * 获取权重值,从小到大,0最小,999最大
     *
     * @return weight - 权重值,从小到大,0最小,999最大
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 设置权重值,从小到大,0最小,999最大
     *
     * @param weight 权重值,从小到大,0最小,999最大
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
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
     * 设置删除状态(0.启用;1.禁用;2.删除)
     *
     * @return deleted - 版本号
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 设置删除状态(0.启用;1.禁用;2.删除)
     *
     * @param deleted 版本号
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
        sb.append(", parentId=").append(parentId);
        sb.append(", url=").append(url);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", weight=").append(weight);
        sb.append(", version=").append(version);
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
        industry other = (industry) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
                && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
                && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
                && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return result;
    }

}