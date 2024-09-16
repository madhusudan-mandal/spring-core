package com.spring.core.practice.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/practice/lifecycle/LifeCycle.xml");
		Employee employee =  context.getBean("employee", Employee.class);
		Student student = context.getBean("student", Student.class);
		Team team = context.getBean("team", Team.class);
		
		System.out.println(team.getTeamName());
		System.out.println(student.getName());
		System.out.println(employee.getName());
		((ClassPathXmlApplicationContext)context).close();
	}

}
