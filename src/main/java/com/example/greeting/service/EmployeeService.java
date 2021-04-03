package com.example.greeting.service;

import com.example.greeting.dao.EmployeeDao;
import com.example.greeting.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao dao;

    public List<Employee> populateEmployees() {
        return dao.retrieveEmployees();
    }

    public Employee updateEmployee(Employee employee, long id) {
        return dao.updateEmployee(employee, id);
    }

    public void deleteEmployee(Employee employee, long id) {
        dao.deleteEmployee(employee, id);
    }

    public void createEmployee(Employee employee) {
        dao.createEmployee(employee);
    }
}
