package com.qcdl.model.entity;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author yuanhua
 */
public class Industry implements Serializable {
    /**
     * 行业id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "行业id")
    private Integer id;

    /**
     * 行业名称
     */
    @ApiModelProperty(value = "行业名称")
    private String name;

    /**
     * 行业父id(0为顶级行业)
     */
    @ApiModelProperty(value = "行业父id")
    private Integer pid;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 排序,从小到大,0最小,999最大
     */
    @ApiModelProperty(value = "排序,从小到大,0最小,999最大")
    private Integer weight;

    /**
     * 删除状态(0.启用;1.禁用;2.删除)
     */
    @ApiModelProperty(value = "删除状态(0.启用;1.禁用;2.删除)")
    private Integer deleted;

    /**
     * 最低价格
     */
    @Column(name = "minimum_price")
    @ApiModelProperty(value = "最低价格")
    private BigDecimal minimumPrice;

    private static final long serialVersionUID = 1L;

    /**
     * 获取行业id
     *
     * @return id - 行业id
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
     * 获取行业名称
     *
     * @return name - 行业名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置行业名称
     *
     * @param name 行业名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取行业父id(0为无父id)
     *
     * @return pid - 行业父id(0为无父id)
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置行业父id(0为顶级)
     *
     * @param pid 行业父id(0为顶级id)
     */
    public void setPid(Integer pid) {
        this.pid = pid;
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
     * 获取排序,从小到大,0最小,999最大
     *
     * @return weight - 排序,从小到大,0最小,999最大
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 设置排序,从小到大,0最小,999最大
     *
     * @param weight 排序,从小到大,0最小,999最大
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
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

    /**
     * 获取最低价格
     *
     * @return minimum_price - 最低价格
     */
    public BigDecimal getMinimumPrice() {
        return minimumPrice;
    }

    /**
     * 设置最低价格
     *
     * @param minimumPrice 最低价格
     */
    public void setMinimumPrice(BigDecimal minimumPrice) {
        this.minimumPrice = minimumPrice;
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
        sb.append(", createTime=").append(createTime);
        sb.append(", weight=").append(weight);
        sb.append(", deleted=").append(deleted);
        sb.append(", minimumPrice=").append(minimumPrice);
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
        Industry other = (Industry) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getMinimumPrice() == null ? other.getMinimumPrice() == null : this.getMinimumPrice().equals(other.getMinimumPrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getMinimumPrice() == null) ? 0 : getMinimumPrice().hashCode());
        return result;
    }
}