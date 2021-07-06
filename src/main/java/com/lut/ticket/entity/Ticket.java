package com.lut.ticket.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Ticket {
private Integer id;
private String type;
private Integer price;
private String punctualityRate;
private Integer flightId;
private Integer total;
private Integer remain;
}