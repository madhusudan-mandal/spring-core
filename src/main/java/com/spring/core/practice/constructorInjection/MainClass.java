package com.spring.core.practice.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/practice/constructorInjection/bean.xml");
//		Project project = context.getBean("project1",Project.class);  
		// the above line will throw an error as project1 is not define in bean.xml file. Need to use the project

		Project project = context.getBean("project",Project.class);
		
		
		System.out.println(project);
	}

}
