package com.qcdl.model.entity;

import io.swagger.annotations.ApiModel;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "mark_case")
@ApiModel("案例已读未读")
public class MarkCase implements Serializable {
    /**
     * 案例已读id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 案例id
     */
    @Column(name = "information_id")
    private Integer informationId;

    /**
     * 用户所在机构id
     */
    @Column(name = "mechanism_id")
    private Integer mechanismId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取案例已读id
     *
     * @return id - 案例已读id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置案例已读id
     *
     * @param id 案例已读id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取案例id
     *
     * @return information_id - 案例id
     */
    public Integer getInformationId() {
        return informationId;
    }

    /**
     * 设置案例id
     *
     * @param informationId 案例id
     */
    public void setInformationId(Integer informationId) {
        this.informationId = informationId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", informationId=").append(informationId);
        sb.append(", mechanismId=").append(mechanismId);
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
        MarkCase other = (MarkCase) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getInformationId() == null ? other.getInformationId() == null : this.getInformationId().equals(other.getInformationId()))
            && (this.getMechanismId() == null ? other.getMechanismId() == null : this.getMechanismId().equals(other.getMechanismId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getInformationId() == null) ? 0 : getInformationId().hashCode());
        result = prime * result + ((getMechanismId() == null) ? 0 : getMechanismId().hashCode());
        return result;
    }
}