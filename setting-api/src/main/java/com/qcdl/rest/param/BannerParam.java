package com.qcdl.rest.param;

import com.qcdl.model.entity.SettingBanner;
import io.swagger.annotations.ApiModel;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by yuanhua 2018/3/12.
 * @author Administrator
 */
@ApiModel
public class BannerParam extends SettingBanner {

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
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", picture=").append(picture);
        sb.append(", url=").append(url);
        sb.append(", position=").append(position);
        sb.append(", weight=").append(weight);
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
        return (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getPicture() == null ? other.getPicture() == null : this.getPicture().equals(other.getPicture()))
                && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
                && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
                && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPicture() == null) ? 0 : getPicture().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        return result;
    }
}
