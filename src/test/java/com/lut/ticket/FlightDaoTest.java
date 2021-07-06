package com.lut.ticket;

import com.lut.ticket.dao.FlightMapper;
import com.lut.ticket.entity.Flight;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
public class FlightDaoTest {
    @Autowired
    private FlightMapper flightMapper;
    @SneakyThrows
    @Test
    void testListAll(){
//        Flight flight = new Flight();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = sdf.parse("2021-07-05");
//        System.out.println(date);
//        flight.setDicty("北京").setAcity("上海").setDate(date);
//        System.out.println(flightMapper.getFlightByJudge(flight));
    }
}
