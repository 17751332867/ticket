package com.lut.ticket.service;

import com.lut.ticket.entity.Ticket;
import com.lut.ticket.dao.TicketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketMapper ticketMapper;

    /**
     * ??????
     *
     * @return ??????????List
     */
    public List<Ticket> listAll() {
    return ticketMapper.listAll();
    }


    /**
     * ??????
     *
     * @param id ??
     * @return ?????????null
     */
    public Ticket getById(Integer id) {
    return ticketMapper.getById(id);
    }

    /**
     * ?????????
     *
     * @param ticket ?????
     * @return ??????
     */
    public int insert(Ticket ticket) {
    return ticketMapper.insert(ticket);
    }

    /**
     * ?????null??
     *
     * @param ticket ?????
     * @return ??????
     */
    public int insertIgnoreNull(Ticket ticket) {
    return ticketMapper.insertIgnoreNull(ticket);
    }

    /**
     * ?????????
     *
     * @param ticket ?????
     * @return ??????
     */
    public int update(Ticket ticket) {
    return ticketMapper.update(ticket);
    }

    /**
     * ?????null??
     *
     * @param ticket ?????
     * @return ??????
     */
    public int updateIgnoreNull(Ticket ticket) {
    return ticketMapper.updateIgnoreNull(ticket);
    }

    /**
     * ????
     *
     * @param ticket ??????
     * @return ??????
     */
    public int delete(Ticket ticket) {
    return ticketMapper.delete(ticket);
    }

}