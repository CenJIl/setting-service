package com.qcdl.test;

import com.qcdl.rest.param.BannerParam;
import com.qcdl.service.impl.BannerServiceI;
import org.junit.Test;

import javax.annotation.Resource;

public class BannerTest {
    @Resource
    BannerServiceI service;

    @Test
    public void test() {
        BannerParam bannerParam = new BannerParam();
        bannerParam.setName("word");
        service.bannerUpdate(1, bannerParam);
    }
}
