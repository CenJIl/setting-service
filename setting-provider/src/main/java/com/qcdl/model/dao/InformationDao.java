package com.qcdl.model.dao;


import com.github.pagehelper.PageHelper;
import com.qcdl.model.entity.SettingInformation;
import com.qcdl.model.enums.DeleteType;
import com.qcdl.model.mapper.SettingInformationMapper;
import com.qcdl.rest.dto.InformationDto;
import com.qcdl.rest.param.InformationPageParam;
import com.qcdl.rest.param.InformationParam;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author 魏自东
 * @date 2018/3/16 11:14
 */
@Component
public class InformationDao {
    @Resource
    private SettingInformationMapper mapper;

    /**
     * 分页查询案例列表
     *
     * @param param 分页,名称,行业id
     * @return 案例分页列表
     */
    public List<InformationDto> list(InformationPageParam param) {
        if (param.getPageSize() != null && param.getPageSize() > 0) {
            PageHelper.startPage(param.getPage(), param.getPageSize());
        }
        return mapper.informationList(param);
    }

    /**
     * 增加一个案例
     *
     * @param adminId 管理员ID
     * @param param   增加的案例
     */
    public void add(Integer adminId, InformationParam param) {
        SettingInformation information = new SettingInformation();
        information.setId(null);
        information.setName(param.getName());
        information.setAuthor(param.getAuthor());
        information.setCover(param.getCover());
        information.setUrl(param.getUrl());
        information.setIndustryId(param.getIndustryId());
        information.setAdminId(adminId);
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
        Example e = new Example(SettingInformation.class);
        Example.Criteria c = e.createCriteria();
        c.andEqualTo("id", information.getId());
        c.andEqualTo("version", information.getVersion());
        information.setVersion(information.getVersion() + 1);
        mapper.updateByExampleSelective(information, e);
    }

    /**
     * 删除案例
     *
     * @param id 案例ID
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
