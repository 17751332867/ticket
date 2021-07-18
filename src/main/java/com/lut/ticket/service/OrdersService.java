package com.lut.ticket.service;

import com.lut.ticket.entity.Orders;
import com.lut.ticket.dao.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    /**
     * ??????
     *
     * @return ??????????List
     */
    public List<Orders> listAll() {
    return ordersMapper.listAll();
    }


    /**
     * ??????
     *
     * @param id ??
     * @return ?????????null
     */
    public Orders getById(String id) {
    return ordersMapper.getById(id);
    }

    /**
     * ?????????
     *
     * @param orders ?????
     * @return ??????
     */
    public String insert(Orders orders) {
        orders.setId(String.valueOf(UUID.randomUUID()));
        ordersMapper.insert(orders);
        return orders.getId();
    }

    /**
     * ?????null??
     *
     * @param orders ?????
     * @return ??????
     */
    public int insertIgnoreNull(Orders orders) {
    return ordersMapper.insertIgnoreNull(orders);
    }

    /**
     * ?????????
     *
     * @param orders ?????
     * @return ??????
     */
    public int update(Orders orders) {
    return ordersMapper.update(orders);
    }

    /**
     * ?????null??
     *
     * @param orders ?????
     * @return ??????
     */
    public int updateIgnoreNull(Orders orders) {
    return ordersMapper.updateIgnoreNull(orders);
    }

    /**
     * ????
     *
     * @param orders ??????
     * @return ??????
     */
    public int delete(Orders orders) {
    return ordersMapper.delete(orders);
    }

}