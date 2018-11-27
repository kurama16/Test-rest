package com.example.ejercicio.persistence.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
private String name;
private String lastName;
private int age;

public Employee() {
	super();
}

public Employee(long id, String name, String lastName, int age) {
	super();
	this.id = id;
	this.name = name;
	this.lastName = lastName;
	this.age = age;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
}


}
