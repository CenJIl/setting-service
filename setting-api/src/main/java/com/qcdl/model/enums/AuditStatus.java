package com.qcdl.model.enums;

import org.restful.api.filter.exception.WebException;

/**
 * 审核状态
 *
 * @author 魏自东
 * @date 2018/3/7 10:56
 */
public enum AuditStatus {
    未审核(0), 审核中(1), 审核通过(2), 审核失败(3);
    int code;

    AuditStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static AuditStatus parse(Integer code) {
        for (AuditStatus dt : AuditStatus.values()) {
            if (code.equals(dt.getCode())) {
                return dt;
            }
        }
        throw new WebException("审核状态【" + code + "】不是有效状态！");
    }
}
