package com.spring.core.practice.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/practice/setterInjection/bean.xml");
		Student student = context.getBean("student2", Student.class);
		System.out.println(student.toString());
		}

}
