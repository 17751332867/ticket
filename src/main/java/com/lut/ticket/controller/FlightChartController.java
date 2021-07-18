package com.lut.ticket.controller;

import com.lut.ticket.entity.FlightChart;
import com.lut.ticket.service.FlightChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightChartController {
    @Autowired
    private FlightChartService flightChartService;
    @RequestMapping("getAllData")

    public List<FlightChart> getAllData(){
        return flightChartService.getAllData();
    }
}
