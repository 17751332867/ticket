package com.lut.ticket.util;

import com.lut.ticket.dao.CrawlerMapper;
import com.lut.ticket.dao.FlightMapper;
import com.lut.ticket.dao.TicketMapper;
import com.lut.ticket.entity.Crawler;
import com.lut.ticket.entity.Flight;
import com.lut.ticket.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

@Component
public class FlightUtil {
    @Autowired
    private CrawlerMapper crawlerMapper;
    @Autowired
    private FlightMapper flightMapper;
    @Autowired
    private TicketMapper ticketMapper;
//
    public boolean transferCrawlerToFlight(){
        crawlerMapper.listAll().forEach((crawler -> {
            crawler.getDate().setHours(0);
            Flight flight = new Flight(0, crawler.getAirline(), crawler.getFlightNumber(), crawler.getDepartureDate(), crawler.getArrivalDate(), crawler.getDcity(), crawler.getAcity(), crawler.getDate().toString(),null,false);
            if(flightMapper.getFlightByAllCondition(flight)==null){
                flightMapper.insert(flight);
            }
            int index = flightMapper.getLastIndex();
            if(crawler.getEconomyClass()!=0){
                int num=300+new Random().nextInt(120);
                Ticket ticket = null;
                    ticket = new Ticket(0,"经济舱",crawler.getEconomyClass(),crawler.getPunctualityRate(),index,num,num);

                ticketMapper.insert(ticket);
            }
            if(crawler.getBusinessClass()!=0){
                int num=40+new Random().nextInt(80);
                Ticket ticket = null;
                ticket = new Ticket(0,"商务舱",crawler.getBusinessClass(),crawler.getPunctualityRate(),index,num,num);
                ticketMapper.insert(ticket);
            }
            if(crawler.getFirstClass()!=0){
                int num=20+new Random().nextInt(30);
                Ticket ticket = null;
                ticket = new Ticket(0,"头等舱",crawler.getFirstClass(),crawler.getPunctualityRate(),index,num,num);
                ticketMapper.insert(ticket);
            }
        }));
        return true;
    }
}
