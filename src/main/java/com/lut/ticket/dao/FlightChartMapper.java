package com.lut.ticket.dao;

import com.lut.ticket.entity.FlightChart;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FlightChartMapper {
    List<FlightChart> getAllData();
}
