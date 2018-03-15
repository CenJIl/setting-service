package com.qcdl.model.entity;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "setting_area")
public class SettingArea implements Serializable {
    /**
     * 地区id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "地区id", example = "1")
    private Integer id;

    /**
     * 地区名称
     */
    @ApiModelProperty(value = "地区名称", example = "武汉市")
    private String name;

    /**
     * 父级地区名称
     */
    @Column(name = "class_name")
    @ApiModelProperty(value = "父级地区名称", example = "湖北省")
    private String className;

    /**
     * 地区父id,为0时无上级地区
     */
    @Column(name = "class_pid")
    @ApiModelProperty(value = "地区父id,为0时无上级地区", example = "1")
    private Integer classPid;

    /**
     * 权重值,从小到大排序,最小0,最大999
     */
    @ApiModelProperty(value = "权重值,从小到大排序,最小0,最大999", example = "1")
    private Integer weight;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value = "创建时间", example = "2018-3-15 22:38:56")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @ApiModelProperty(value = "更新时间", example = "2018-3-15 22:39:02")
    private Date updateTime;

    /**
     * 版本号
     */
    @ApiModelProperty(value = "版本号", example = "0")
    private Integer version;

    /**
     * 删除状态(1.启用;2.禁用;3.删除)
     */
    @ApiModelProperty(value = "删除状态(0.启用;1.禁用;2.删除)", example = "1")
    private Integer deleted;

    /**
     * 管理员id
     */
    @Column(name = "admin_id")
    @ApiModelProperty(value = "管理员id", example = "1")
    private Integer adminId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取地区id
     *
     * @return id - 地区id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置地区id
     *
     * @param id 地区id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取地区名称
     *
     * @return name - 地区名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置地区名称
     *
     * @param name 地区名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取等级名称
     *
     * @return className - 等级名称
     */
    public String getClassName() {
        return className;
    }

    /**
     * 设置等级名称
     *
     * @param className 等级名称
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * 获取地区父id,为0时无上级地区
     *
     * @return classPid - 地区父id,为0时无上级地区
     */
    public Integer getClassPid() {
        return classPid;
    }

    /**
     * 设置地区父id,为0时无上级地区
     *
     * @param classPid 地区父id,为0时无上级地区
     */
    public void setClassPid(Integer classPid) {
        this.classPid = classPid;
    }

    /**
     * 获取权重值,从小到大排序,最小0,最大999
     *
     * @return weight - 权重值,从小到大排序,最小0,最大999
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 设置权重值,从小到大排序,最小0,最大999
     *
     * @param weight 权重值,从小到大排序,最小0,最大999
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
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
     * 获取删除状态(1.启用;2.禁用;3.删除)
     *
     * @return deleted - 删除状态(1.启用;2.禁用;3.删除)
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 设置删除状态(1.启用;2.禁用;3.删除)
     *
     * @param deleted 删除状态(1.启用;2.禁用;3.删除)
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", className=").append(className);
        sb.append(", classPid=").append(classPid);
        sb.append(", weight=").append(weight);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", version=").append(version);
        sb.append(", deleted=").append(deleted);
        sb.append(", adminId=").append(adminId);
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
        SettingArea other = (SettingArea) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getClassName() == null ? other.getClassName() == null : this.getClassName().equals(other.getClassName()))
                && (this.getClassPid() == null ? other.getClassPid() == null : this.getClassPid().equals(other.getClassPid()))
                && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
                && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
                && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
                && (this.getAdminId() == null ? other.getAdminId() == null : this.getAdminId().equals(other.getAdminId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getClassName() == null) ? 0 : getClassName().hashCode());
        result = prime * result + ((getClassPid() == null) ? 0 : getClassPid().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getAdminId() == null) ? 0 : getAdminId().hashCode());
        return result;
    }
}