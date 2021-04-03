package com.example.greeting.dao;

import com.example.greeting.domain.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

  private static List<Employee> employeeList = null;

  static {
    employeeList = new ArrayList<>();
    employeeList.add(
        new Employee(1, "Emmanuel Akolly", "emmanuel@gmail.com", "home address", "763-222-2222"));
    employeeList.add(
        new Employee(2, "Alex Akolly", "alex@gmail.com", "home address", "763-222-2222"));
    employeeList.add(
        new Employee(3, "Claire Akolly", "claire@gmail.com", "home address", "763-222-2222"));
    employeeList.add(
        new Employee(4, "Lydia Akolly", "lydia@gmail.com", "home address", "763-222-2222"));
    employeeList.add(
        new Employee(5, "Christina Akolly", "christina@gmail.com", "home address", "763-222-2222"));
    employeeList.add(
        new Employee(6, "Isabelle Akolly", "isabelle@gmail.com", "home address", "763-222-2222"));
  }

  @Override
  public void createEmployee(Employee employee) {
    employeeList.add(employee);
  }

    @Override
    public List<Employee> retrieveEmployees() {
        return employeeList;
    }

    @Override
  public Employee updateEmployee(Employee employee, long id) {
    for (Employee emp : employeeList) {
      if (employee.getId() == emp.getId()) {
        emp = employee;
        employeeList.remove(emp);
        employeeList.add(employee);
        break;
      }
    }
    return employee;
  }

  @Override
  public void deleteEmployee(Employee employee, long id) {
    for (Employee emp : employeeList) {
      if (employee.getId() == emp.getId()) {
        emp = employee;
        employeeList.remove(emp);
        break;
      }
    }
  }
}
