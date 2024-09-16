package com.spring.core.practice.lifecycle;

import java.util.Objects;

import javax.annotation.PostConstruct;

import javax.annotation.PreDestroy;

public class Employee {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//By using Annotation, i-> added the dependency in pom.xml file,
	// -> 2. enable the annotation in xml file or define a bean of Employee class in xml
	
	@PostConstruct
	public void init()
	{
		System.out.println("Initializing the Employee bean");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroying the Employee bean");
	}
}
