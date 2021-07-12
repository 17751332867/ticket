package com.lut.ticket.controller;

import java.util.List;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lut.ticket.entity.Ticket;
import com.lut.ticket.service.TicketService;

@RestController
@RequestMapping("Ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    /**
     * ??????
     *
     * @return ??????????List
     */

    @SneakyThrows
    @RequestMapping("crawler")
    public String crawler(){
        String python_path=System.getProperty("user.dir")+"\\crawler\\crawler.py";
        String cmd = "python \""+python_path+"\" "+"北京 南京 2021 7 10";
        System.out.println(cmd);
        Runtime.getRuntime().exec(cmd);
        return "success";
    }
    @RequestMapping("list")
    public List<Ticket> listAll() {
        return ticketService.listAll();
    }


    /**
     * ??????
     *
     * @param id ??
     * @return ?????????null
     */
    @RequestMapping("getById")
    public Ticket getById(Integer id) {
        return ticketService.getById(id);
    }
    
    /**
     * ?????????
     *
     * @param ticket ?????
     * @return ??????
     */
    @RequestMapping("insert")
    public int insert(@RequestBody Ticket ticket) {
        return ticketService.insert(ticket);
    }
    
    /**
     * ?????null??
     *
     * @param ticket ?????
     * @return ??????
     */
    @RequestMapping("insertIgnoreNull")
    public int insertIgnoreNull(@RequestBody Ticket ticket) {
        return ticketService.insertIgnoreNull(ticket);
    }
    
    /**
     * ?????????
     *
     * @param ticket ?????
     * @return ??????
     */
    @RequestMapping("update")
    public int update(@RequestBody Ticket ticket) {
        return ticketService.update(ticket);
    }
    
    /**
     * ?????null??
     *
     * @param ticket ?????
     * @return ??????
     */
    @RequestMapping("updateIgnoreNull")
    public int updateIgnoreNull(@RequestBody Ticket ticket) {
        return ticketService.updateIgnoreNull(ticket);
    }
    
    /**
     * ????
     *
     * @param ticket ??????
     * @return ??????
     */
    @RequestMapping("delete")
    public int delete(@RequestBody Ticket ticket) {
        return ticketService.delete(ticket);
    }
    
}