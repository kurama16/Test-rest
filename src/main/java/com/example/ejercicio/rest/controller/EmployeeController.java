package com.example.ejercicio.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ejercicio.persistence.models.Employee;
import com.example.ejercicio.persistence.repositories.EmployeeRepository;

public interface EmployeeController {

	public void insertEmployee(Employee employee);
	public List<Employee> getEmployees();
	public Employee getEmployee(long id);
	
}
