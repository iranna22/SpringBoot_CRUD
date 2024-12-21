package com.iranna.springbootcrud.service;

import java.util.List;

import com.iranna.springbootcrud.model.Employee;



public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	Employee updateEmployee(Employee employee, long id);
	void deleteEmployee(long id);
}