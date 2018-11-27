package com.example.ejercicio.persistence.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ejercicio.persistence.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
