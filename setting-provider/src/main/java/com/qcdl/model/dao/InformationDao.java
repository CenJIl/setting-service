package com.qcdl.model.dao;


import com.github.pagehelper.PageHelper;
import com.qcdl.model.entity.Classify;
import com.qcdl.model.entity.SettingInformation;
import com.qcdl.model.enums.DeleteType;
import com.qcdl.model.mapper.ClassifyMapper;
import com.qcdl.model.mapper.SettingInformationMapper;
import com.qcdl.model.param.PageParam;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class InformationDao {
    @Resource
    private SettingInformationMapper mapper;

    @Resource
    private ClassifyMapper classifyMapper;

    public List<SettingInformation> informationList(PageParam pageParam, String name, Integer ClassifyId) {
        if (pageParam.getPageSize() != null && pageParam.getPageSize() > 0) {
            PageHelper.startPage(pageParam.getPage(), pageParam.getPageSize());
        }
        return mapper.informationList(name, ClassifyId);
    }


    public void informationDelete(Integer id) {
        SettingInformation information = new SettingInformation();
        information.setId(id);
        information.setDeleted(DeleteType.已删除.getCode());
        mapper.updateByPrimaryKeySelective(information);

    }

    public void informationAdd(SettingInformation information) {
        mapper.insertSelective(information);
    }

    public void informationUpdate(SettingInformation information) {
        information.setUpdateTime(new Date());
        mapper.updateByPrimaryKeySelective(information);
    }


}
