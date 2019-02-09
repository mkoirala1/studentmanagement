package com.employee.demo.dao;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeDAO {
public List<Employee> findAll();
public Employee findById(int theId);

public void save(Employee theemployee);
public void deleteById(int theId);

}
