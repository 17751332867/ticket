package com.lut.ticket.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lut.ticket.entity.Passenger;
import com.lut.ticket.service.PassengerService;

@RestController
@RequestMapping("Passenger")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    /**
     * ??????
     *
     * @return ??????????List
     */
    @RequestMapping("list")
    public List<Passenger> listAll() {
        return passengerService.listAll();
    }


    /**
     * ??????
     *
     * @param id ??
     * @return ?????????null
     */
    @RequestMapping("getById")
    public Passenger getById(Integer id) {
        return passengerService.getById(id);
    }
    
    /**
     * ?????????
     *
     * @param passenger ?????
     * @return ??????
     */
    @RequestMapping("insert")
    public int insert(Passenger passenger) {
        return passengerService.insert(passenger);
    }
    
    /**
     * ?????null??
     *
     * @param passenger ?????
     * @return ??????
     */
    @RequestMapping("insertIgnoreNull")
    public int insertIgnoreNull(@RequestBody Passenger passenger) {
        return passengerService.insertIgnoreNull(passenger);
    }
    
    /**
     * ?????????
     *
     * @param passenger ?????
     * @return ??????
     */
    @RequestMapping("update")
    public int update(@RequestBody Passenger passenger) {
        return passengerService.update(passenger);
    }
    
    /**
     * ?????null??
     *
     * @param passenger ?????
     * @return ??????
     */
    @RequestMapping("updateIgnoreNull")
    public int updateIgnoreNull(@RequestBody Passenger passenger) {
        return passengerService.updateIgnoreNull(passenger);
    }
    
    /**
     * ????
     *
     * @param passenger ??????
     * @return ??????
     */
    @RequestMapping("delete")
    public int delete(@RequestBody Passenger passenger) {
        return passengerService.delete(passenger);
    }
    
}