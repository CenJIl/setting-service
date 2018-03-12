package com.qcdl.model.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
    /**
     * 消息id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 消息标题
     */
    private String title;

    /**
     * 用户所在机构id
     */
    @Column(name = "mechanism_id")
    private Integer mechanismId;

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
     * 消息状态(0.未读;1.已读)
     */
    private Integer readed;

    /**
     * 删除状态(默认启用):0.启用;1.禁用;2.已删除;
     */
    private Integer deleted;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 消息内容
     */
    private String content;

    private static final long serialVersionUID = 1L;

    /**
     * 获取消息id
     *
     * @return id - 消息id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置消息id
     *
     * @param id 消息id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取消息标题
     *
     * @return title - 消息标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置消息标题
     *
     * @param title 消息标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取用户所在机构id
     *
     * @return mechanism_id - 用户所在机构id
     */
    public Integer getMechanismId() {
        return mechanismId;
    }

    /**
     * 设置用户所在机构id
     *
     * @param mechanismId 用户所在机构id
     */
    public void setMechanismId(Integer mechanismId) {
        this.mechanismId = mechanismId;
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
     * 获取消息状态(0.未读;1.已读)
     *
     * @return readed - 消息状态(0.未读;1.已读)
     */
    public Integer getReaded() {
        return readed;
    }

    /**
     * 设置消息状态(0.未读;1.已读)
     *
     * @param readed 消息状态(0.未读;1.已读)
     */
    public void setReaded(Integer readed) {
        this.readed = readed;
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
     * 获取消息内容
     *
     * @return content - 消息内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置消息内容
     *
     * @param content 消息内容
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
        sb.append(", title=").append(title);
        sb.append(", mechanismId=").append(mechanismId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", readed=").append(readed);
        sb.append(", deleted=").append(deleted);
        sb.append(", version=").append(version);
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
        Message other = (Message) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getMechanismId() == null ? other.getMechanismId() == null : this.getMechanismId().equals(other.getMechanismId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getReaded() == null ? other.getReaded() == null : this.getReaded().equals(other.getReaded()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getMechanismId() == null) ? 0 : getMechanismId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getReaded() == null) ? 0 : getReaded().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}