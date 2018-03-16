package com.qcdl.service;

import com.qcdl.model.dao.AreaDao;
import com.qcdl.model.entity.SettingArea;
import com.qcdl.model.enums.DeleteType;
import com.qcdl.rest.param.AreaParam;
import com.qcdl.service.impl.AreaServiceI;
import org.restful.api.utils.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wzd.framwork.utils.TreeUtil;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 魏自东
 * @date 2018/3/16 11:04
 */
@Service("areaService")
public class AreaService implements AreaServiceI {
    @Autowired
    private AreaDao dao;

    @Override
    public List<SettingArea> list() {
        return dao.list();
    }

    @Override
    public void update(AreaParam param) {
        SettingArea area = dao.getId(param.getId());
        Assert.notNull(area, "该城市不存在!");
        area.setName(param.getName());
        area.setWeight(param.getWeight());
        area.setPid(param.getPid());
        dao.update(area);
    }

    @Override
    public void delete(Integer id) {
        SettingArea area = dao.getId(id);
        Assert.notNull(area, "该城市不存在!");
        area.setDeleted(DeleteType.已删除.getCode());
        dao.update(area);
    }

    @Override
    public void add(AreaParam param) {
        dao.add(param);
    }

    @Override
    public List<SettingArea> tree() {
        List<SettingArea> areaList = dao.list();
        return TreeUtil.bulid(areaList,
                item -> item.getPid() == null || item.getPid() == 0,
                item -> {
                    List<SettingArea> children = areaList.stream().filter(area -> item.getId().equals(area.getPid())).collect(Collectors.toList());
                    item.setChildren(children);
                    return children;
                });
    }

}
