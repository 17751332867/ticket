package com.lut.ticket;

import com.lut.ticket.dao.CrawlerMapper;
import com.lut.ticket.dao.FlightMapper;
import com.lut.ticket.dao.UserMapper;
import com.lut.ticket.entity.Crawler;
import com.lut.ticket.entity.Flight;
import com.lut.ticket.util.FlightUtil;
import com.lut.ticket.util.MailUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.sql.Timestamp;

@SpringBootTest
class TicketApplicationTests {

    @Autowired
    private FlightMapper flightMapper;
    @Autowired
    private FlightUtil flightUtil;
    @Autowired
    private MailUtil mailUtil;
    @Autowired
    private CrawlerMapper crawlerMapper;
    @Test
    void contextLoads() {
        crawlerMapper.listAll().forEach(System.out::println);
    }

}
