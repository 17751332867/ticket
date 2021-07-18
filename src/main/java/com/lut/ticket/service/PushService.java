package com.lut.ticket.service;

import com.lut.ticket.dao.PushMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PushService {
    @Autowired
    private PushMapper pushMapper;
    public int addPush(Integer id){
        return pushMapper.addPush(id);
    }
}
