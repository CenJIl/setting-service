package com.qcdl.test;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.qcdl.BasicTest;
import com.qcdl.model.entity.SettingInformation;
import com.qcdl.rest.param.InformationPageParam;
import com.qcdl.service.InformationService;
import com.qcdl.service.impl.BannerServiceI;
import com.qcdl.service.impl.InformationServiceI;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

public class BannerTest extends BasicTest{
    @Resource
    BannerServiceI service;
    @Autowired
    private InformationServiceI informationServiceI;

    @Test
    public void test() {
        InformationPageParam param = new InformationPageParam();
        param.setPage(1);
        param.setPageSize(10);
        PageInfo<SettingInformation> list = informationServiceI.list(param);
        System.out.println(JSON.toJSONString(list));
    }
}
