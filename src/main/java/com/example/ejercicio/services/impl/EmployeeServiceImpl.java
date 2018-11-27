package com.example.ejercicio.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio.exceptions.AddEmployeeException;
import com.example.ejercicio.exceptions.FindEmployeeException;
import com.example.ejercicio.exceptions.IncompleteDataException;
import com.example.ejercicio.persistence.models.Employee;
import com.example.ejercicio.persistence.repositories.EmployeeRepository;
import com.example.ejercicio.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		if(employee==null) {
			throw new IncompleteDataException("employee cannot be null");
		}
		try {
			employeeRepository.save(employee);
		}catch(Exception e) {
			throw new AddEmployeeException();
		}
	}

	@Override
	public List<Employee> getEmployees() {
		try {
			return employeeRepository.findAll();
		}catch(Exception e) {

			throw new FindEmployeeException();
		}
	}

	@Override
	public Employee getEmployee(long id) {
		if(id<0) {
			throw new IncompleteDataException("id must be greater than 0");
		}
		try {
			return employeeRepository.findById(id).orElse(null);
		}catch(Exception e) {
			throw new FindEmployeeException();
		}
	}

}
