package com.qcdl.model.enums;

import org.restful.api.filter.exception.WebException;

/**
 * 用户类型
 *
 * @author 魏自东
 * @date 2018/3/7 10:56
 */
public enum UserType {

    创建者(0), 运营者(1);
    int code;

    UserType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static UserType parse(Integer code) {
        for (UserType dt : UserType.values()) {
            if (code.equals(dt.getCode())) {
                return dt;
            }
        }
        throw new WebException("用户类型【" + code + "】不是有效类型！");
    }
}
