package com.qcdl.service.impl;

import com.qcdl.model.entity.industry;
import com.qcdl.rest.param.industryParam;

import java.util.List;

/**
 * Created by hxh on 2018/3/14.
 */
public interface IndustryServiceI {

    /**
     * 查询全部行业
     *
     * @return 所有行业
     */
    List<industry> allList();

    /**
     * 增加行业
     *
     * @param param 行业参数
     */
    void add(industryParam param);

    /**
     * 更新行业信息
     *
     * @param param 行业参数
     */
    void update(industryParam param);

    /**
     * 删除行
     *
     * @param id 行业ID
     */
    void delete(Integer id);

}
