package com.lut.ticket.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;

import com.lut.ticket.config.AlipayConfig;
import com.lut.ticket.entity.Orders;
import com.lut.ticket.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Controller
public class PayController {
  @Autowired
  private OrdersService ordersService;
  @RequestMapping("/pay")
  @ResponseBody
  public void payController(HttpServletRequest request, HttpServletResponse response) throws IOException {
    //获得初始化的AlipayClient
    AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);

    //设置请求参数
    AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
    alipayRequest.setReturnUrl(AlipayConfig.return_url);
    alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

    //商户订单号，商户网站订单系统中唯一订单号，必填
    String out_trade_no = new String(request.getParameter("ordersId").getBytes("ISO-8859-1"),"UTF-8");
    //付款金额，必填
    String total_amount = new String(request.getParameter("totalPrice").getBytes("ISO-8859-1"),"UTF-8");
    //订单名称，必填
    String subject = new String(request.getParameter("ticketId").getBytes("ISO-8859-1"),"UTF-8");
    //商品描述，可空
    String body = new String(request.getParameter("description").getBytes("ISO-8859-1"),"UTF-8");

    alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
            + "\"total_amount\":\""+ total_amount +"\","
            + "\"subject\":\""+ subject +"\","
            + "\"body\":\""+ body +"\","
            + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");


    //请求
    String form="";
    try {
      form = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单
    } catch (AlipayApiException e) {
      e.printStackTrace();
    }
    response.setContentType("text/html;charset=" + AlipayConfig.charset);
    response.getWriter().write(form);//直接将完整的表单html输出到页面
    response.getWriter().flush();
    response.getWriter().close();
  }
  @RequestMapping("/handlePay")
  public String handlePay(HttpServletRequest request, HttpServletResponse response) throws Exception {
    Map<String, String> params = new HashMap<String, String>();
    Map<String, String[]> requestParams = request.getParameterMap();
    for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext(); ) {
      String name = (String) iter.next();
      String[] values = (String[]) requestParams.get(name);
      String valueStr = "";
      for (int i = 0; i < values.length; i++) {
        valueStr = (i == values.length - 1) ? valueStr + values[i]
                : valueStr + values[i] + ",";
      }
      //乱码解决，这段代码在出现乱码时使用
      valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
      params.put(name, valueStr);
    }

    boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type); //调用SDK验证签名

    if (signVerified) {//验证成功
      //商户订单号
      String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");
      Orders orders = ordersService.getById(out_trade_no);
      orders.setState("已支付");
      ordersService.update(orders);
      //支付宝交易号
      String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");


      System.out.println("success");
      return "redirect:http://www.baidu.com";

    } else {//验证失败
      System.out.println("fail");
      return "redirect:http://www.baidu.com";
    }
  }
  @RequestMapping("/test")
  public String test(){
    return "redirect:http://www.baidu.com";
  }
}
