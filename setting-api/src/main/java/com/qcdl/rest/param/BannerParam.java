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
public class BannerParam implements Serializable {

    /**
     * 广告id
     */
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
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

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

}
