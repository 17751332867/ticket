package com.lut.ticket.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.sql.Timestamp;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Crawler {
private Integer id;
private String airline;
private String flightNumber;
private Date departureDate;
private Date arrivalDate;
private Integer economyClass;
private Integer businessClass;
private Integer firstClass;
private String punctualityRate;
private String dcity;
private String acity;
private Timestamp date;
}