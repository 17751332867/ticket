package com.lut.ticket;

import com.lut.ticket.dao.CrawlerMapper;
import com.lut.ticket.dao.FlightChartMapper;
import com.lut.ticket.dao.FlightMapper;
import com.lut.ticket.dao.UserMapper;
import com.lut.ticket.entity.Crawler;
import com.lut.ticket.entity.Flight;
import com.lut.ticket.util.FlightUtil;
import com.lut.ticket.util.MailUtil;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Scanner;

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
    @Autowired
    private FlightChartMapper flightChartMapper;
    @SneakyThrows
    @Test
    void contextLoads() throws IOException {
        System.out.println(flightChartMapper.getAllData());
    }

}
