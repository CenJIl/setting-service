package com.qcdl.model.enums;

import org.restful.api.filter.exception.WebException;

/**
 * APP应用类型
 *
 * @author 魏自东
 * @date 2018/3/7 10:56
 */
public enum AppType {

    广告主平台("advertiser_APP"), 媒体主平台("Media_owner_APP"), 渠道商平台("Channel_dealer_APP"), 公会管理平台("Guild_management_APP");
    String code;

    AppType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static AppType parse(String code) {
        for (AppType dt : AppType.values()) {
            if (code.equals(dt.getCode())) {
                return dt;
            }
        }
        throw new WebException("APP应用类型【" + code + "】不是有效类型！");
    }
}
