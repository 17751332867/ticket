package com.lut.ticket.util;

import cn.hutool.json.JSONObject;
import com.zhenzi.sms.ZhenziSmsClient;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Component
public class MailUtil {
    private String apiUrl="https://sms_developer.zhenzikj.com";
    private String appId = "109364";
    private String appSecret = "YjI5MDQ0ZjAtOTNlZi00ZmU0LWEzOWItNDg1NDI5NGIzYWM1";


    public JSONObject getCode(@RequestParam("phoneNumber") String phoneNumber) {
        try{
            JSONObject json;
            ZhenziSmsClient client = new ZhenziSmsClient(apiUrl, appId, appSecret);
            String code = String.valueOf(new Random().nextInt(899999) + 100000);
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("number", phoneNumber);
            params.put("templateId", "5783");
            //这个参数就是短信模板上那两个参数
            String[] templateParams = new String[2];
            templateParams[0] = code;
            templateParams[1] = "2分钟";
            params.put("templateParams", templateParams);
            String result = client.send(params);
            json = new JSONObject(result);
            json = new JSONObject();
            json.append("memPhone",phoneNumber);
            json.append("code",code);
            json.append("createTime",System.currentTimeMillis());
            // 将认证码存入SESSION
            return json;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
