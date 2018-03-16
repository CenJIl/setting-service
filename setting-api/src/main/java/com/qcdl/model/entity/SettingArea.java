package com.qcdl.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author 魏自东
 * @date 2018/3/16 11:02
 */
@Table(name = "setting_area")
@ApiModel("地区")
public class SettingArea implements Serializable {
    /**
     * 地区id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("ID")
    private Integer id;

    /**
     * 地区名称
     */
    @ApiModelProperty("地区名称")
    private String name;

    /**
     * 地区父id,为0时无上级地区
     */
    @ApiModelProperty("地区父id,0为顶级")
    private Integer pid;

    /**
     * 权重值,从小到大排序,最小0,最大999
     */
    @ApiModelProperty("权重值,从小到大排序,最小0,最大999")
    private Integer weight;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * 删除状态(0.启用;1.禁用;2.删除)
     */
    @ApiModelProperty(hidden = true)
    private Integer deleted;

    private static final long serialVersionUID = 1L;
    @Transient
    @ApiModelProperty("下级城市")
    private List<SettingArea> children;

    public List<SettingArea> getChildren() {
        return children;
    }

    public void setChildren(List<SettingArea> children) {
        this.children = children;
    }

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
     * 获取地区父id,为0时无上级地区
     *
     * @return pid - 地区父id,为0时无上级地区
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置地区父id,为0时无上级地区
     *
     * @param pid 地区父id,为0时无上级地区
     */
    public void setPid(Integer pid) {
        this.pid = pid;
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
     * 获取删除状态(0.启用;1.禁用;2.删除)
     *
     * @return deleted - 删除状态(0.启用;1.禁用;2.删除)
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 设置删除状态(0.启用;1.禁用;2.删除)
     *
     * @param deleted 删除状态(0.启用;1.禁用;2.删除)
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
        sb.append(", pid=").append(pid);
        sb.append(", weight=").append(weight);
        sb.append(", createTime=").append(createTime);
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
        SettingArea other = (SettingArea) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
                && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }
}