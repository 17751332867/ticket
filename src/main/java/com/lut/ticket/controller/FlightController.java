package com.lut.ticket.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lut.ticket.entity.Flight;
import com.lut.ticket.service.FlightService;

@RestController
@RequestMapping("Flight")
public class FlightController {

    @Autowired
    private FlightService flightService;

    /**
     * ??????
     *
     * @return ??????????List
     */
    @RequestMapping("list")
    public List<Flight> listAll() {
        return flightService.listAll();
    }


    /**
     * ??????
     *
     * @param id ??
     * @return ?????????null
     */
    @RequestMapping("getById")
    public Flight getById(Integer id) {
        return flightService.getById(id);
    }
    
    /**
     * ?????????
     *
     * @param flight ?????
     * @return ??????
     */
    @RequestMapping("insert")
    public int insert(@RequestBody Flight flight) {
        return flightService.insert(flight);
    }
    
    /**
     * ?????null??
     *
     * @param flight ?????
     * @return ??????
     */
    @RequestMapping("insertIgnoreNull")
    public int insertIgnoreNull(@RequestBody Flight flight) {
        return flightService.insertIgnoreNull(flight);
    }
    
    /**
     * ?????????
     *
     * @param flight ?????
     * @return ??????
     */
    @RequestMapping("update")
    public int update(@RequestBody Flight flight) {
        return flightService.update(flight);
    }
    
    /**
     * ?????null??
     *
     * @param flight ?????
     * @return ??????
     */
    @RequestMapping("updateIgnoreNull")
    public int updateIgnoreNull(@RequestBody Flight flight) {
        return flightService.updateIgnoreNull(flight);
    }
    
    /**
     * ????
     *
     * @param flight ??????
     * @return ??????
     */
    @RequestMapping("delete")
    public int delete(Flight flight) {
        return flightService.delete(flight);
    }

    @RequestMapping("getFlightByJudge")
    public List<Flight> getFlightByJudge(Flight flight){
        return flightService.getFlightByJudge(flight);
    }
}