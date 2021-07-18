package com.lut.ticket.service;

import com.lut.ticket.dao.CrawlerMapper;
import com.lut.ticket.entity.Crawler;
import com.lut.ticket.entity.Flight;
import com.lut.ticket.dao.FlightMapper;
import com.lut.ticket.util.FlightUtil;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

@Service
public class FlightService {

    @Autowired
    private FlightMapper flightMapper;
    @Autowired
    private FlightUtil flightUtil;
    @Autowired
    private CrawlerMapper crawlerMapper;
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
    @SneakyThrows
    public List<Flight> getFlightByJudge(Flight flight){
        List<Flight> flights = flightMapper.getFlightByJudge(flight);
        if(flights.size()==0||flights==null){
            crawlerMapper.deleteAll();
            String python_path=System.getProperty("user.dir")+"\\crawler\\crawler.py";
            String cmd = "python \""+python_path+"\" "+flight.getDicty()+" "+flight.getAcity()+" "+(flight.getDate().split("-")[0])+" "+(flight.getDate().split("-")[1])+" "+flight.getDate().split("-")[2];
            System.out.println(cmd);
            Process process = Runtime.getRuntime().exec(cmd);
            InputStream is = process.getInputStream();
            Scanner scanner = new Scanner(is);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
            int re = process.waitFor();
            scanner.close();
            is.close();
            flightUtil.transferCrawlerToFlight();
            flights = flightMapper.getFlightByJudge(flight);
        }
        return flights;
    }
}