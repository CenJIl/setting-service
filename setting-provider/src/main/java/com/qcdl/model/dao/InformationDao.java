package com.qcdl.model.dao;


import com.github.pagehelper.PageHelper;
import com.qcdl.model.entity.SettingInformation;
import com.qcdl.model.enums.DeleteType;
import com.qcdl.model.mapper.industryMapper;
import com.qcdl.model.mapper.SettingInformationMapper;
import com.qcdl.rest.param.InformationPageParam;
import com.qcdl.rest.param.InformationParam;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

;

@Component
public class InformationDao {
    @Resource
    private SettingInformationMapper mapper;

    @Resource
    private industryMapper classifyMapper;

    /**
     * 查询案例列表(分页)
     *
     * @param param
     * @return
     */
    public List<SettingInformation> list(InformationPageParam param) {
        if (param.getPageSize() != null && param.getPageSize() > 0) {
            PageHelper.startPage(param.getPage(), param.getPageSize());
        }
        return mapper.informationList(param.getName(), param.getIndustryId());
    }

    /**
     * 增加一个案例
     */
    public void add(InformationParam param) {
        SettingInformation information = new SettingInformation();
        information.setName(param.getName());
        information.setAuthor(param.getAuthor());
        information.setCover(param.getCover());
        information.setUrl(param.getUrl());
        //TODO 后台上线后解开
//        information.setAdminId(param.getAdminId());
        information.setIndustryId(param.getIndustryId());
        information.setCreateTime(new Date());
        information.setVersion(0);
        information.setDeleted(DeleteType.启用.getCode());
        mapper.insertSelective(information);
    }

    /**
     * 修改案例信息
     *
     * @param information 案例参数
     */
    public void update(SettingInformation information) {
        mapper.updateByPrimaryKeySelective(information);
    }

    /**
     * 删除案例
     *
     * @param id
     */
    public void delete(Integer id) {
        SettingInformation information = new SettingInformation();
        information.setId(id);
        information.setDeleted(DeleteType.已删除.getCode());
        mapper.updateByPrimaryKeySelective(information);
    }

    /**
     * 根据ID获取
     *
     * @param id 案例ID
     * @return 案例详情
     */
    public SettingInformation getId(Integer id) {
        SettingInformation information = new SettingInformation();
        information.setId(id);
        information.setDeleted(DeleteType.启用.getCode());
        return mapper.selectOne(information);
    }

}
