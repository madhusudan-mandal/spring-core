package com.spring.core.practice.autowiringXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLBasedAutowiring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/practice/autowiringXML/beanConfig.xml");
//		Employee employee1 = context.getBean("employee1", Employee.class);
		Employee employee2 = context.getBean("employee2", Employee.class);
//		Employee employee3 = context.getBean("employee3", Employee.class);
//		System.out.println(employee1);
		System.out.println(employee2);
//		System.out.println(employee3);
	}

}
