package com.iranna.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iranna.springbootcrud.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
