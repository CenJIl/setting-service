//package com.qcdl.rest.param;
//
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//
//import java.io.Serializable;
//
///**
// * @author 魏自东
// * @date 2018/3/7 17:21
// */
//@ApiModel("修改密码参数")
//public class PasswordParam implements Serializable {
//    /**
//     * 手机验证码
//     */
//    @ApiModelProperty(value = "手机验证码", required = true, example = "123456")
//    private String code;
//    /**
//     * 新密码
//     */
//    @ApiModelProperty(value = "新密码,MD5加密", required = true, example = "e10adc3949ba59abbe56e057f20f883e")
//    private String newPwd;
//
//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public String getNewPwd() {
//        return newPwd;
//    }
//
//    public void setNewPwd(String newPwd) {
//        this.newPwd = newPwd;
//    }
//}
