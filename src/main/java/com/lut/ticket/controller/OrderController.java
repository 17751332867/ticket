package com.lut.ticket.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lut.ticket.entity.Order;
import com.lut.ticket.service.OrderService;

@RestController
@RequestMapping("Order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * ??????
     *
     * @return ??????????List
     */
    @RequestMapping("list")
    public List<Order> listAll() {
        return orderService.listAll();
    }


    /**
     * ??????
     *
     * @param id ??
     * @return ?????????null
     */
    @RequestMapping("getById")
    public Order getById(Integer id) {
        return orderService.getById(id);
    }
    
    /**
     * ?????????
     *
     * @param order ?????
     * @return ??????
     */
    @RequestMapping("insert")
    public int insert(@RequestBody Order order) {
        return orderService.insert(order);
    }
    
    /**
     * ?????null??
     *
     * @param order ?????
     * @return ??????
     */
    @RequestMapping("insertIgnoreNull")
    public int insertIgnoreNull(@RequestBody Order order) {
        return orderService.insertIgnoreNull(order);
    }
    
    /**
     * ?????????
     *
     * @param order ?????
     * @return ??????
     */
    @RequestMapping("update")
    public int update(@RequestBody Order order) {
        return orderService.update(order);
    }
    
    /**
     * ?????null??
     *
     * @param order ?????
     * @return ??????
     */
    @RequestMapping("updateIgnoreNull")
    public int updateIgnoreNull(@RequestBody Order order) {
        return orderService.updateIgnoreNull(order);
    }
    
    /**
     * ????
     *
     * @param order ??????
     * @return ??????
     */
    @RequestMapping("delete")
    public int delete(@RequestBody Order order) {
        return orderService.delete(order);
    }
    
}