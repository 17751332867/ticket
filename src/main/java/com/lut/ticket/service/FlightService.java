package com.lut.ticket.service;

import com.lut.ticket.entity.Flight;
import com.lut.ticket.dao.FlightMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightMapper flightMapper;

    /**
     * ??????
     *
     * @return ??????????List
     */
    public List<Flight> listAll() {
    return flightMapper.listAll();
    }


    /**
     * ??????
     *
     * @param id ??
     * @return ?????????null
     */
    public Flight getById(Integer id) {
    return flightMapper.getById(id);
    }

    /**
     * ?????????
     *
     * @param flight ?????
     * @return ??????
     */
    public int insert(Flight flight) {
    return flightMapper.insert(flight);
    }

    /**
     * ?????null??
     *
     * @param flight ?????
     * @return ??????
     */
    public int insertIgnoreNull(Flight flight) {
    return flightMapper.insertIgnoreNull(flight);
    }

    /**
     * ?????????
     *
     * @param flight ?????
     * @return ??????
     */
    public int update(Flight flight) {
    return flightMapper.update(flight);
    }

    /**
     * ?????null??
     *
     * @param flight ?????
     * @return ??????
     */
    public int updateIgnoreNull(Flight flight) {
    return flightMapper.updateIgnoreNull(flight);
    }

    /**
     * ????
     *
     * @param flight ??????
     * @return ??????
     */
    public int delete(Flight flight) {
    return flightMapper.delete(flight);
    }

    public List<Flight> getFlightByJudge(Flight flight){
        return flightMapper.getFlightByJudge(flight);
    }
}