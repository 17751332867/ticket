package com.lut.ticket.controller;

import cn.hutool.json.JSONObject;
import com.lut.ticket.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MailController {
    @Autowired
    private MailService mailService;
    @RequestMapping(value = "/phone/code",method = RequestMethod.GET)
    public JSONObject getCode(@RequestParam("phoneNumber") String phoneNumber) {
        return mailService.getCode(phoneNumber);
    }
}
