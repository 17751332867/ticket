package com.lut.ticket.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Order {
private Integer id;
private String passenger;
private Integer flightId;
private Integer ticketId;
private String state;
}