package com.qcdl.model.dao;


import com.github.pagehelper.PageHelper;
import com.qcdl.model.entity.SettingSpecial;
import com.qcdl.model.enums.DeleteType;
import com.qcdl.model.mapper.SettingSpecialMapper;
import com.qcdl.model.param.PageParam;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Component
public class SpecialDao {

    @Resource
    private SettingSpecialMapper mapper;

    public List<SettingSpecial> specialList(PageParam pageParam) {
        if (pageParam.getPageSize() != null && pageParam.getPageSize() > 0) {
            PageHelper.startPage(pageParam.getPage(), pageParam.getPageSize());
        }
        Example example = new Example(SettingSpecial.class);
        example.createCriteria().andEqualTo("deleted", 0);
        return mapper.selectByExample(example);
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
