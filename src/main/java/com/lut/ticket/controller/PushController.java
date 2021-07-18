package com.lut.ticket.controller;

import com.lut.ticket.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PushController {
    @Autowired
    private PushService pushService;
    @RequestMapping("addPush")
    public int addPush(Integer id){
        return pushService.addPush(id);
    }
}
