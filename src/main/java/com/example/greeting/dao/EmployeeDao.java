package com.example.greeting.dao;

import com.example.greeting.domain.Employee;

import java.util.List;

public interface EmployeeDao {

    public void createEmployee(Employee employee);

    public List<Employee> retrieveEmployees();

    public Employee updateEmployee(Employee employee, long id);

    public void deleteEmployee(Employee employee, long id);
}
