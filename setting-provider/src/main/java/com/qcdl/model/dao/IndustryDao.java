package com.qcdl.model.dao;

import com.qcdl.model.entity.industry;
import com.qcdl.model.enums.DeleteType;
import com.qcdl.model.mapper.IndustryMapper;
import com.qcdl.rest.param.industryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author yuanhua
 * @date 2018/3/14
 */
@Component
public class IndustryDao {

    @Resource
    private IndustryMapper mapper;

    /**
     * 查询全部行业
     *
     * @return 所有行业
     */
    public List<industry> allList() {
        return mapper.selectAll();
    }

    /**
     * 增加一个行业
     *
     * @param param 行业参数
     */
    public void add(industryParam param) {
        industry classify = new industry();
        classify.setName(param.getName());
        classify.setParentId(param.getParentId());
        classify.setUrl(param.getUrl());
        classify.setCreateTime(new Date());
        classify.setWeight(param.getWeight());
        classify.setDeleted(DeleteType.启用.getCode());
        mapper.insertSelective(classify);
    }

    /**
     * 修改行业信息
     *
     * @param industry 行业参数
     */
    public void update(industry industry) {
        industry.setUpdateTime(new Date());
        mapper.updateByPrimaryKeySelective(industry);
    }

    /**
     * 删除行业信息(未使用)
     *
     * @param id 行业id
     */
    public void delete(Integer id) {
        mapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据id获取行业
     *
     * @param id 行业id
     * @return 行业信息
     */
    public industry getId(Integer id) {
        industry classify = new industry();
        classify.setId(id);
        return mapper.selectOne(classify);
    }
}
