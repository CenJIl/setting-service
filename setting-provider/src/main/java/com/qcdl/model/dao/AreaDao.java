package com.qcdl.model.dao;

import com.qcdl.model.entity.SettingArea;
import com.qcdl.model.enums.DeleteType;
import com.qcdl.model.mapper.SettingAreaMapper;
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
    private SettingAreaMapper mapper;

    /**
     * 获取地区列表
     *
     * @return 地区列表
     */
    public List<SettingArea> list() {
        Example e = new Example(SettingArea.class);
        Example.Criteria c = e.createCriteria();
        c.andEqualTo("deleted", DeleteType.启用.getCode());
        e.orderBy("pid").asc().orderBy("weight").asc().orderBy("createTime").asc();
        return mapper.selectByExample(e);
    }

    /**
     * 添加地区信息
     *
     * @param param 地区参数
     */
    public void add(AreaParam param) {
        SettingArea area = new SettingArea();
        area.setName(param.getName());
        area.setPid(param.getPid());
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
        mapper.updateByPrimaryKeySelective(area);
    }
}
