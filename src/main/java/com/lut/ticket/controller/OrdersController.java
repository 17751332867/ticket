package com.lut.ticket.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lut.ticket.entity.Orders;
import com.lut.ticket.service.OrdersService;

@RestController
@RequestMapping("Orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    /**
     * ??????
     *
     * @return ??????????List
     */
    @RequestMapping("list")
    public List<Orders> listAll() {
        return ordersService.listAll();
    }


    /**
     * ??????
     *
     * @param id ??
     * @return ?????????null
     */
    @RequestMapping("getById")
    public Orders getById(String id) {
        return ordersService.getById(id);
    }
    
    /**
     * ?????????
     *
     * @param orders ?????
     * @return ??????
     */
    @RequestMapping("insert")
    public String insert(Orders orders) {
        return ordersService.insert(orders);
    }
    
    /**
     * ?????null??
     *
     * @param orders ?????
     * @return ??????
     */
    @RequestMapping("insertIgnoreNull")
    public int insertIgnoreNull(@RequestBody Orders orders) {
        return ordersService.insertIgnoreNull(orders);
    }
    
    /**
     * ?????????
     *
     * @param orders ?????
     * @return ??????
     */
    @RequestMapping("update")
    public int update(@RequestBody Orders orders) {
        return ordersService.update(orders);
    }
    
    /**
     * ?????null??
     *
     * @param orders ?????
     * @return ??????
     */
    @RequestMapping("updateIgnoreNull")
    public int updateIgnoreNull(@RequestBody Orders orders) {
        return ordersService.updateIgnoreNull(orders);
    }
    
    /**
     * ????
     *
     * @param orders ??????
     * @return ??????
     */
    @RequestMapping("delete")
    public int delete(@RequestBody Orders orders) {
        return ordersService.delete(orders);
    }
    
}