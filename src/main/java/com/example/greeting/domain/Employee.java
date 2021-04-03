package com.example.greeting.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Employee {

  private long id;
  private String name;
  private String email;
  private String address;
  private String phone;
}
