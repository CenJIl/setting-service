package com.qcdl.service;

import com.github.pagehelper.PageInfo;
import com.qcdl.model.dao.AreaDao;
import com.qcdl.model.entity.SettingArea;
import com.qcdl.model.enums.DeleteType;
import com.qcdl.rest.param.AreaPageParam;
import com.qcdl.rest.param.AreaParam;
import com.qcdl.service.impl.AreaServiceI;
import org.restful.api.utils.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hxh on 2018/3/15.
 */
@Service("areaService")
public class AreaService implements AreaServiceI {

    @Autowired
    private AreaDao dao;

    @Override
    public PageInfo<SettingArea> list(AreaPageParam param) {
        return new PageInfo<>(dao.list(param));
    }

    @Override
    public void update(AreaParam param) {
        SettingArea area = dao.getId(param.getId());
        Assert.notNull(area, "该城市不存在!");
        area.setId(param.getId());
        area.setName(param.getName());
        area.setClassPid(param.getClassPid());
        area.setWeight(param.getWeight());
        dao.update(area);
    }

    @Override
    public void delete(Integer id) {
        SettingArea area = dao.getId(id);
        Assert.notNull(area, "该城市不存在!");
        area.setId(id);
        area.setDeleted(DeleteType.已删除.getCode());
        dao.update(area);
    }

    @Override
    public void add(AreaParam param) {
        dao.add(param);
    }

//    @Override
//    public SettingBanner get(Integer id) {
//        return null;
//    }
}
