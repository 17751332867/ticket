package com.lut.ticket.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Passenger {
    private Integer id;
    private String name;
    private String cardId;
    private String phone;
    private String type;
    private String passengerId;
}