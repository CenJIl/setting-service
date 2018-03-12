package com.qcdl.model.enums;

import org.restful.api.filter.exception.WebException;

/**
 * 删除类型
 *
 * @author 魏自东
 * @date 2018/3/7 10:56
 */
public enum DeleteType {

    启用(0), 禁用(1), 已删除(2);
    int code;

    DeleteType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static DeleteType parse(Integer code) {
        for (DeleteType dt : DeleteType.values()) {
            if (code.equals(dt.getCode())) {
                return dt;
            }
        }
        throw new WebException("删除类型【" + code + "】不是有效类型！");
    }
}
