package com.lut.ticket.service;

import cn.hutool.json.JSONObject;
import com.lut.ticket.util.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private MailUtil mailUtil;
    public JSONObject getCode(String phoneNumber) {

        return mailUtil.getCode(phoneNumber);
    }
}
