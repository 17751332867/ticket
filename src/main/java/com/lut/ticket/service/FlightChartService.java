package com.lut.ticket.service;

import com.lut.ticket.dao.FlightChartMapper;
import com.lut.ticket.entity.FlightChart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightChartService {
    @Autowired
    private FlightChartMapper flightChartMapper;

    public List<FlightChart> getAllData(){
        return flightChartMapper.getAllData();
    }
}
