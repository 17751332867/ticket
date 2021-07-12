package com.lut.ticket.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Flight {
private Integer id;
private String airline;
private String flightNumber;
@JsonFormat(pattern = "HH:mm")
private Date departureDate;
@JsonFormat(pattern = "HH:mm")
private Date arrivalDate;
private String dicty;
private String acity;
private String date;
private List<Ticket> ticketList;
private boolean opened;
}