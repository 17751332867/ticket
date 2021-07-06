package com.lut.ticket.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class User {
private Integer id;
private String username;
private String password;
private String phone;
private String qq;
private String state;
private String address;
}