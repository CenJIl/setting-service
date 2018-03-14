package com.qcdl.model.dao;

import com.github.pagehelper.PageHelper;
import com.qcdl.model.entity.Classify;
import com.qcdl.model.mapper.ClassifyMapper;
import com.qcdl.model.param.PageParam;
import org.restful.api.utils.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by hxh on 2018/3/14.
 */
@Component
public class ClassifyDao {

    @Autowired
    private ClassifyMapper mapper;

    public List<Classify> classifyList(PageParam pageParam) {
        if (pageParam.getPageSize() > 0 && pageParam.getPageSize() > 0) {
            PageHelper.startPage(pageParam.getPage(), pageParam.getPageSize());
        }
        return mapper.selectAll();
    }

    public void classifyCreate(Classify classify) {
        Assert.isTrue(classify.getName() != null || classify.getName() != "", "名称不能为空");
        classify.setCreateTime(new Date());
        classify.setUpdateTime(null);
        mapper.insertSelective(classify);
    }
}
