//package com.qcdl.model.dao;
//
//import com.qcdl.model.enums.DeleteType;
//import org.springframework.stereotype.Component;
//import tk.mybatis.mapper.entity.Example;
//
//import javax.annotation.Resource;
//import java.util.Arrays;
//import java.util.List;
//
///**
// * @author 魏自东
// * @date 2018/3/7 16:02
// */
//@Component
//public class UserDao {
//    @Resource
//    private com.stylefeng.guns.common.persistence.dao.UserMapper userMapper;
//
//    /**
//     * 根据电话号码获取用户信息
//     *
//     * @param phone 电话号码
//     * @return 用户信息
//     */
//    public User getByPhone(String phone) {
//        Example e = new Example(User.class);
//        e.createCriteria()
//                .andEqualTo("phone", phone)
//                .andIn("deleted", Arrays.asList(DeleteType.启用.getCode(), DeleteType.禁用.getCode()));
//        List<User> userList = userMapper.selectByExample(e);
//        if (userList.isEmpty()) {
//            return null;
//        }
//        return userList.get(0);
//    }
//}
