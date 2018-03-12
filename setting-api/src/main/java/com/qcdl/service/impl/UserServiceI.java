//package com.qcdl.service.impl;
//
//import com.qcdl.rest.param.LoginParam;
//import com.qcdl.rest.param.PasswordParam;
//
//import java.util.List;
//
///**
// * 账号服务
// *
// * @author 魏自东
// * @date 2018/3/7 11:03
// */
//public interface UserServiceI {
//    /**
//     * 登录
//     *
//     * @param param 登录参数
//     * @return 登录后的用户信息
//     */
//    User login(LoginParam param);
//
//    /**
//     * 修改指定用户的密码
//     *
//     * @param userId 用户ID
//     * @param param  密码修改参数
//     */
//    void changePassword(Integer userId, PasswordParam param);
//
//    /**
//     * 修改用户资料
//     *
//     * @param user 用户资料
//     */
//    void update(User user);
//
//    /**
//     * 获取运营者列表
//     *
//     * @param mechanismId 机构ID
//     * @return 运营者列表
//     */
//    List<User> list(Integer mechanismId);
//
//    /**
//     * 根据ID获取用户详情
//     *
//     * @param id 用户ID
//     * @return 用户详情
//     */
//    User getById(Integer id);
//
//    /**
//     * 创建运营者
//     *
//     * @param user 用户资料
//     * @return 运营者资料
//     */
//    User create(User user);
//
//    /**
//     * 删除运营者
//     *
//     * @param id 用户ID
//     */
//    void del(Integer id);
//
//    /**
//     * 启用，停用用户
//     *
//     * @param id 用户ID
//     */
//    void toggle(Integer id);
//}
