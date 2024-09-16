package com.spring.core.practice.setterInjection;

public class Student {

	private int id;
	private String nameString;
	
	public Student() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Student(int id, String nameString)
	{
		this.id=id;
		this.nameString=nameString;
	}
	
	// Note: in setter injection we need to use the name of setter method in bean file to set the Class object
	// for example here setId and setName are the setter method and hence in bean file we need to set the property as below 
	// 1. <bean class="<class completed path including package>" name="onjectName">
	// 			<property name="id" not name="setId" value="101"/>
//				<property name="name" not setName value="example"/>
//			</bean>
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId() {
		return this.id;
	}
	
	
	public void setName(String nameString)
	{
		this.nameString=nameString;
	}
	
	public String getName()
	{
		return this.getName();
	}
	public boolean equals(Student s)
	{
		if(this.id == s.id && this.nameString.equals(s.nameString))
		{
			return true;
		}
		else 
			return false;
	}
	
	public String toString() {
		return "Student[ ID: "+this.id+", Name: "+this.nameString + "]";
	}
}
