package com.qcdl.model.mapper;

import com.qcdl.model.entity.Message;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface MessageMapper extends Mapper<Message>, MySqlMapper<Message> {
}