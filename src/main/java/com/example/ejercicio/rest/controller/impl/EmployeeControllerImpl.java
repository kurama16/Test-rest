package com.example.ejercicio.rest.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejercicio.persistence.models.Employee;
import com.example.ejercicio.persistence.repositories.EmployeeRepository;
import com.example.ejercicio.rest.controller.EmployeeController;

@RestController
@RequestMapping("/employee")
public class EmployeeControllerImpl implements EmployeeController{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void insertEmployee(@RequestBody Employee employee) {
		// TODO Auto-generated method stub
		System.out.println(employee);
		employeeRepository.save(employee);
		
	}

	@Override
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		
		return employeeRepository.findAll();
	}

	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).orElse(null);
	}
	
}
