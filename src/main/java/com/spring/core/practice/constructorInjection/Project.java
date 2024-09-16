package com.spring.core.practice.constructorInjection;

import java.util.List;

public class Project {

	private int projectId;
	private String name;
	List<Employee> employees;
	public Project(int id, String name, List<Employee> emp) {
		// TODO Auto-generated constructor stub
		this.projectId=id;
		this.name=name;
		this.employees=emp;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Project [ ProjectId: "+projectId+" ProjectName: "+name+" Employees: "+employees+" ]";
	}
}
