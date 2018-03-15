package com.qcdl.model.dao;

import com.github.pagehelper.PageHelper;
import com.qcdl.model.entity.SettingArea;
import com.qcdl.model.enums.DeleteType;
import com.qcdl.model.mapper.SettingAareaMapper;
import com.qcdl.rest.param.AreaPageParam;
import com.qcdl.rest.param.AreaParam;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author yuanhua
 * @date 2018/3/15
 */
@Component
public class AreaDao {
    @Resource
    private SettingAareaMapper mapper;

    /**
     * 分页查询地区列表
     *
     * @param param 分页参数
     * @return 地区列表
     */
    public List<SettingArea> list(AreaPageParam param) {
        if (param.getPageSize() != null && param.getPageSize() > 0) {
            PageHelper.startPage(param.getPage(), param.getPageSize());
        }
        Example example = new Example(SettingArea.class);
        example.orderBy("weight").asc();
        return mapper.selectByExample(example);
    }

    /**
     * 添加地区信息
     *
     * @param param 地区参数
     */
    public void add(AreaParam param) {
        SettingArea area = new SettingArea();
        area.setName(param.getName());
        area.setClassName(param.getClassName());
        area.setClassPid(param.getClassPid());
        area.setWeight(param.getWeight());
        area.setCreateTime(new Date());
        area.setDeleted(DeleteType.启用.getCode());
        mapper.insertSelective(area);
    }

    /**
     * 根据id查询地区
     *
     * @param id 地区id
     * @return 地区信息
     */
    public SettingArea getId(Integer id) {
        SettingArea area = new SettingArea();
        area.setId(id);
        area.setDeleted(DeleteType.启用.getCode());
        return mapper.selectOne(area);
    }

    /**
     * 更新地区信息
     *
     * @param area 地区参数
     */
    public void update(SettingArea area) {
        area.setUpdateTime(new Date());
        mapper.updateByPrimaryKeySelective(area);
    }
}
