//package com.qcdl.client;
//
//import com.qcdl.service.impl.UserServiceI;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
///**
// * User dubbo测试
// *
// * @author WeiZiDong
// */
//public class UserTest {
//
//    private static Logger logger = LogManager.getLogger(UserTest.class);
//    private static UserServiceI service;
//
//    public static void main(String[] args) {
//        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        testDubbo(ctx);
//    }
//
//    private static void testDubbo(ConfigurableApplicationContext ctx) {
//        logger.info("\n---------dubbo协议测试开始---------");
//        service = ctx.getBean(UserServiceI.class);
//        test();
//    }
//
//    private static void test() {
//    }
//
//}
