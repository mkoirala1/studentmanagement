package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.demo.dao.EmployeeDAO;

import com.example.demo.entity.Employee;

@Service
public class EmployeeServiceIml implements EmployeeService {

	private EmployeeDAO employeeDAO;
	public EmployeeServiceIml(EmployeeDAO theemployeeDAO) {
		employeeDAO=theemployeeDAO;
	}
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theId) {
		return employeeDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		employeeDAO.save(theEmployee);

	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		employeeDAO.deleteById(theId);

	}

}