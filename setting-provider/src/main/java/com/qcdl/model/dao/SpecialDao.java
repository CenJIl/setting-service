package com.qcdl.model.dao;


import com.github.pagehelper.PageHelper;
import com.qcdl.model.entity.SettingSpecial;
import com.qcdl.model.enums.DeleteType;
import com.qcdl.model.mapper.SettingSpecialMapper;
import com.qcdl.model.param.PageParam;
import com.qcdl.rest.param.SpecialParam;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Component
public class SpecialDao {

    @Resource
    private SettingSpecialMapper mapper;

    public List<SpecialParam> specialList(PageParam pageParam) {
        if (pageParam.getPageSize() != null && pageParam.getPageSize() > 0) {
            PageHelper.startPage(pageParam.getPage(), pageParam.getPageSize());
        }
        SpecialParam specialParam = new SpecialParam();
        return mapper.specialList(specialParam);
    }

    public void specialUpdate(SettingSpecial special) {
        special.setUpdateTime(new Date());
        mapper.updateByPrimaryKeySelective(special);
    }

    public void specialDelete(Integer id) {
        SettingSpecial special = new SettingSpecial();
        special.setId(id);
        special.setDeleted(DeleteType.已删除.getCode());
        mapper.updateByPrimaryKeySelective(special);
    }

    public void specialAdd(SettingSpecial special) {
        mapper.insertSelective(special);
    }

}
