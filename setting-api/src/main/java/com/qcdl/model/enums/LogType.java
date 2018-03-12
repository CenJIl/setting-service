package com.qcdl.model.enums;

import org.restful.api.filter.exception.WebException;

/**
 * 日志类型
 *
 * @author 魏自东
 * @date 2018/3/7 17:28
 */
public enum LogType {
    登录日志(1), 登出日志(2);
    int code;

    LogType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static LogType parse(Integer code) {
        for (LogType dt : LogType.values()) {
            if (code.equals(dt.getCode())) {
                return dt;
            }
        }
        throw new WebException("日志类型【" + code + "】不是有效类型！");
    }
}
