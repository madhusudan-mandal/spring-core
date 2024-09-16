package com.spring.core.practice.constructorInjection;

public class Employee {

	private int id;
	private String name;
	
	public Employee(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee [ EmployeeId: " + id+", EmployeeName: "+name+" ]";
	}
	
}
