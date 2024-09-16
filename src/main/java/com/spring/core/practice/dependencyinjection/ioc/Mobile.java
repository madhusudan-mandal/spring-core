package com.spring.core.practice.dependencyinjection.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sim sim1 = new Jio();
		sim1.calling();
		sim1.messaging();
		// In this approach the programmer are responsible for maintaining the objects and also with use of new keyword the code will  
		// be tightly coupled. 
		
		//In below approach we are using the ApplicationContext which is a Spring Container to manage the objects
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/practice/dependencyinjection/ioc/di-config.xml");
		Sim sim = context.getBean("airtel", Airtel.class); // this will return the instance 
		sim.calling();
		sim.messaging();
		
	}

}
