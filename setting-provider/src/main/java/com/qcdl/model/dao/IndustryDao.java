package com.qcdl.model.dao;

import com.qcdl.model.entity.Industry;
import com.qcdl.model.enums.DeleteType;
import com.qcdl.model.mapper.IndustryMapper;
import com.qcdl.rest.param.IndustryParam;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

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
    public List<Industry> list() {
        Example e = new Example(Industry.class);
        Example.Criteria c = e.createCriteria();
        c.andEqualTo("deleted", DeleteType.启用.getCode());
        e.orderBy("pid").asc().orderBy("weight").asc().orderBy("createTime").asc();
        return mapper.selectByExample(e);
    }

    /**
     * 增加一个行业
     *
     * @param param 行业参数
     */
    public void add(IndustryParam param) {
        Industry i = new Industry();
        i.setName(param.getName());
        i.setPid(param.getPid());
        i.setWeight(param.getWeight());
        i.setCreateTime(new Date());
        i.setDeleted(DeleteType.启用.getCode());
        mapper.insertSelective(i);
    }

    /**
     * 修改行业信息
     *
     * @param i 行业参数
     */
    public void update(Industry i) {
        mapper.updateByPrimaryKeySelective(i);
    }

    /**
     * 根据id获取行业
     *
     * @param id 行业id
     * @return 行业信息
     */
    public Industry getId(Integer id) {
        Industry i = new Industry();
        i.setId(id);
        i.setDeleted(DeleteType.启用.getCode());
        return mapper.selectOne(i);
    }
}
