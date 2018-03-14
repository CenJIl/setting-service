package com.qcdl.service.impl;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.entity.Classify;
import com.qcdl.model.param.PageParam;

/**
 * Created by hxh on 2018/3/14.
 */
public interface ClassifyServiceI {
    PageInfo<Classify> classifyList(PageParam pageParam);

    void classifyCreate(Classify classify);
}
