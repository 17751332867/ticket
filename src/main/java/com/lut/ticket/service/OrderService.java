package com.lut.ticket.service;

import com.lut.ticket.entity.Order;
import com.lut.ticket.dao.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    /**
     * ??????
     *
     * @return ??????????List
     */
    public List<Order> listAll() {
    return orderMapper.listAll();
    }


    /**
     * ??????
     *
     * @param id ??
     * @return ?????????null
     */
    public Order getById(Integer id) {
    return orderMapper.getById(id);
    }

    /**
     * ?????????
     *
     * @param order ?????
     * @return ??????
     */
    public int insert(Order order) {
    return orderMapper.insert(order);
    }

    /**
     * ?????null??
     *
     * @param order ?????
     * @return ??????
     */
    public int insertIgnoreNull(Order order) {
    return orderMapper.insertIgnoreNull(order);
    }

    /**
     * ?????????
     *
     * @param order ?????
     * @return ??????
     */
    public int update(Order order) {
    return orderMapper.update(order);
    }

    /**
     * ?????null??
     *
     * @param order ?????
     * @return ??????
     */
    public int updateIgnoreNull(Order order) {
    return orderMapper.updateIgnoreNull(order);
    }

    /**
     * ????
     *
     * @param order ??????
     * @return ??????
     */
    public int delete(Order order) {
    return orderMapper.delete(order);
    }

}