package com.lut.ticket.service;

import com.lut.ticket.entity.Passenger;
import com.lut.ticket.dao.PassengerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    @Autowired
    private PassengerMapper passengerMapper;

    /**
     * ??????
     *
     * @return ??????????List
     */
    public List<Passenger> listAll() {
    return passengerMapper.listAll();
    }


    /**
     * ??????
     *
     * @param id ??
     * @return ?????????null
     */
    public Passenger getById(Integer id) {
        return passengerMapper.getById(id);
    }

    /**
     * ?????????
     *
     * @param passenger ?????
     * @return ??????
     */
    public int insert(Passenger passenger) {
     return passengerMapper.insert(passenger);
    }

    /**
     * ?????null??
     *
     * @param passenger ?????
     * @return ??????
     */
    public int insertIgnoreNull(Passenger passenger) {
    return passengerMapper.insertIgnoreNull(passenger);
    }

    /**
     * ?????????
     *
     * @param passenger ?????
     * @return ??????
     */
    public int update(Passenger passenger) {
    return passengerMapper.update(passenger);
    }

    /**
     * ?????null??
     *
     * @param passenger ?????
     * @return ??????
     */
    public int updateIgnoreNull(Passenger passenger) {
    return passengerMapper.updateIgnoreNull(passenger);
    }

    /**
     * ????
     *
     * @param passenger ??????
     * @return ??????
     */
    public int delete(Passenger passenger) {
    return passengerMapper.delete(passenger);
    }

}