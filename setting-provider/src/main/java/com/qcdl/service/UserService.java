//package com.qcdl.service;
//
//import com.qcdl.model.dao.DepartmentDao;
//import com.qcdl.model.dao.MechanismDao;
//import com.qcdl.model.dao.PermissionDao;
//import com.qcdl.model.dao.UserDao;
//import com.qcdl.model.enums.DeleteType;
//import com.qcdl.rest.param.LoginParam;
//import com.qcdl.rest.param.PasswordParam;
//import com.qcdl.service.impl.UserServiceI;
//import org.apache.commons.lang3.StringUtils;
//import org.restful.api.filter.exception.ResponseCode;
//import org.restful.api.utils.Assert;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.wzd.framwork.utils.MD5Util;
//import org.wzd.framwork.utils.RegexUtils;
//
//import java.util.List;
//
///**
// * @author 魏自东
// * @date 2018/3/7 15:59
// */
//@Service("userService")
//public class UserService implements UserServiceI {
//    @Autowired
//    private UserDao userDao;
//    @Autowired
//    private MechanismDao mechanismDao;
//    @Autowired
//    private DepartmentDao departmentDao;
//    @Autowired
//    private PermissionDao permissionDao;
//
//    @Override
//    public User login(LoginParam param) {
//        // 校验登录参数
//        Assert.notNull(param, "登录参数未填写！");
//        Assert.isTrue(StringUtils.isNotBlank(param.getPhone()), "手机号码未填写！");
//        Assert.isTrue(RegexUtils.checkPhone(param.getPhone()), "手机号码格式错误！");
//        Assert.isTrue(StringUtils.isNoneBlank(param.getPassword()), "密码未填写！");
//        Assert.isTrue(StringUtils.isNotBlank(param.getCode()), "验证码未填写！");
//        // 校验图片验证码
//        VerifyCodeUtils.checkVerifyCode(param.getCode());
//        // 根据电话号码获取账户信息
//        User u = userDao.getByPhone(param.getPhone());
//        // 校验用户信息
//        Assert.notNull(u, ResponseCode.账号错误.getCode(), "手机号码未注册！");
//        Assert.isFalse(u.getDeleted() == DeleteType.禁用.getCode(), "账号已被冻结，请联系管理员解冻后登录！");
//        Assert.isTrue(StringUtils.equalsIgnoreCase(u.getPassword(), MD5Util.getMD5ofStr(param.getPassword() + u.getSalt())), "密码错误！");
//        // 登陆成功，获取所在机构
//        Mechanism m = mechanismDao.getById(u.getMechanismId());
//        // 判断机构所属
//
//        // 获取用户权限
//
//        return u;
//    }
//
//    @Override
//    public void changePassword(Integer userId, PasswordParam param) {
//
//    }
//
//    @Override
//    public void update(User user) {
//
//    }
//
//    @Override
//    public List<User> list(Integer mechanismId) {
//        return null;
//    }
//
//    @Override
//    public User getById(Integer id) {
//        return null;
//    }
//
//    @Override
//    public User create(User user) {
//        return null;
//    }
//
//    @Override
//    public void del(Integer id) {
//
//    }
//
//    @Override
//    public void toggle(Integer id) {
//
//    }
//}
