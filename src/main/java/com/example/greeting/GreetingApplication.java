package com.example.greeting;

import com.example.greeting.dao.EmployeeRepository;
import com.example.greeting.domain.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GreetingApplication {

  public static void main(String[] args) {
    SpringApplication.run(GreetingApplication.class, args);
  }

  @Bean
  public CommandLineRunner init(EmployeeRepository repo) {
    return (args -> {
      repo.save(
          new Employee("Emmanuel Akolly", "emmanuel@gmail.com", "home address", "763-222-2222"));
      repo.save(new Employee("Alex Akolly", "alex@gmail.com", "home address", "763-222-2222"));
      repo.save(new Employee("Claire Akolly", "claire@gmail.com", "home address", "763-222-2222"));
      repo.save(new Employee("Lydia Akolly", "lydia@gmail.com", "home address", "763-222-2222"));
      repo.save(
          new Employee("Christina Akolly", "christina@gmail.com", "home address", "763-222-2222"));
      repo.save(
          new Employee("Isabelle Akolly", "isabelle@gmail.com", "home address", "763-222-2222"));
    });
  }
}
