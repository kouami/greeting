package com.example.greeting;

import com.example.greeting.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingApplication implements CommandLineRunner {



    public static void main(String[] args) {
        SpringApplication.run(GreetingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
