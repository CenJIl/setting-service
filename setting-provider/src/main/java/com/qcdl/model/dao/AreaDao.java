package com.qcdl.model.dao;

import com.github.pagehelper.PageHelper;
import com.qcdl.model.entity.SettingAarea;
import com.qcdl.model.mapper.SettingAareaMapper;
import com.qcdl.rest.param.AreaPageParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yuanhua
 * @date 2018/3/15
 */
@Component
public class AreaDao {
    @Autowired
    private SettingAareaMapper mapper;

    public List<SettingAarea> list(AreaPageParam param) {
        if (param.getPageSize() != null && param.getPageSize() > 0) {
            PageHelper.startPage(param.getPage(), param.getPageSize());
        }
        return mapper.selectAll();
    }
}
