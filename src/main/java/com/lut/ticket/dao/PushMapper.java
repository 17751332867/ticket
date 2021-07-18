package com.lut.ticket.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PushMapper {
    public int addPush(Integer id);
}
