package com.qcdl.model.dao;


import com.github.pagehelper.PageHelper;
import com.qcdl.model.entity.SettingSpecial;
import com.qcdl.model.enums.DeleteType;
import com.qcdl.model.mapper.SettingSpecialMapper;
import com.qcdl.rest.param.SpecialParam;
import com.qcdl.rest.param.specialPageParam;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Component
public class SpecialDao {

    @Resource
    private SettingSpecialMapper mapper;

    /**
     * 分页查询专题列表
     *
     * @param param 分页参数
     * @return 专题列表
     */
    public List<SettingSpecial> specialList(specialPageParam param) {
        if (param.getPageSize() != null && param.getPageSize() > 0) {
            PageHelper.startPage(param.getPage(), param.getPageSize());
        }
        Example example = new Example(SettingSpecial.class);
        example.createCriteria().andEqualTo("deleted", DeleteType.启用.getCode());
        example.orderBy("weight").asc();
        return mapper.selectByExample(example);
    }

    /**
     * 更新专题信息
     *
     * @param param 专题信息
     */
    public void update(SettingSpecial param) {
        param.setUpdateTime(new Date());
        mapper.updateByPrimaryKeySelective(param);
    }

    /**
     * 删除专题信息
     *
     * @param id 专题id
     */
    public void delete(Integer id) {
        SettingSpecial special = new SettingSpecial();
        special.setId(id);
        special.setDeleted(DeleteType.已删除.getCode());
        mapper.updateByPrimaryKeySelective(special);
    }

    /**
     * 增加专题信息
     *
     * @param param 专题信息
     */
    public void add(SpecialParam param) {
        SettingSpecial special = new SettingSpecial();
        special.setName(param.getName());
        special.setCover(param.getCover());
        special.setDescribed(param.getDescribed());
        special.setUrl(param.getUrl());
        special.setWeight(param.getWeight());
        special.setDeleted(DeleteType.启用.getCode());
        special.setCreateTime(new Date());
        mapper.insertSelective(special);
    }

    /**
     * 根据id获取专题
     *
     * @param id 专题id
     * @return 专题详情
     */
    public SettingSpecial getId(Integer id) {
        SettingSpecial special = new SettingSpecial();
        special.setId(id);
        return mapper.selectOne(special);
    }
}
