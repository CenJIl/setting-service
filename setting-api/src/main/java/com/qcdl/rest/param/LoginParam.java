package com.qcdl.rest.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author 魏自东
 * @date 2018/3/7 16:51
 */
@ApiModel("登录参数")
public class LoginParam implements Serializable {
    /**
     * 手机号码
     */
    @ApiModelProperty(value = "手机号码")
    private String phone;
    /**
     * 密码
     */
    @ApiModelProperty(value = "密码，必须MD5加密")
    private String password;
    /**
     * 验证码
     */
    @ApiModelProperty(value = "验证码")
    private String code;
    @ApiModelProperty(hidden = true)
    private String ip;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
