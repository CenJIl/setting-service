package com.qcdl.model.mapper;

import com.qcdl.model.entity.Message;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author 魏自东
 * @date 2018/3/20 9:41
 */
public interface MessageMapper extends Mapper<Message>, MySqlMapper<Message> {
}