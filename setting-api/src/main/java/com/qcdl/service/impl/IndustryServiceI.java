package com.qcdl.service.impl;

import com.qcdl.model.entity.Industry;
import com.qcdl.rest.param.IndustryParam;

import java.util.List;

/**
 * @author 魏自东
 * @date 2018/3/16 10:54
 */
public interface IndustryServiceI {

    /**
     * 查询全部行业
     *
     * @return 所有行业
     */
    List<Industry> list();

    /**
     * 获取行业详情
     *
     * @param id 行业id
     * @return 行业详情
     */
//    Industry getId(Integer id);

    /**
     * 增加行业
     *
     * @param param 行业参数
     */
    void add(IndustryParam param);

    /**
     * 更新行业信息
     *
     * @param param 行业参数
     */
    void update(IndustryParam param);

    /**
     * 删除行
     *
     * @param id 行业ID
     */
    void delete(Integer id);

    /**
     * 获取行业级联树
     *
     * @return 行业级联树
     */
    List<Industry> tree();


}
