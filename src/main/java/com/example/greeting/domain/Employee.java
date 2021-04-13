package com.example.greeting.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Employee {

  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private String email;
  private String address;
  private String phone;

  public Employee() {}

  public Employee(String name, String email, String address, String phone) {
    this.name = name;
    this.email = email;
    this.address = address;
    this.phone = phone;
  }
}
