package com.example.ejercicio.services;

import java.util.List;

import com.example.ejercicio.persistence.models.Employee;

public interface  EmployeeService {
	
	public void insertEmployee(Employee employee);
	public List<Employee> getEmployees();
	public Employee getEmployee(long id);
}
