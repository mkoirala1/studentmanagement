package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Employee;


public interface EmployeeRepositories extends CrudRepository<Employee, Integer>  {

}
