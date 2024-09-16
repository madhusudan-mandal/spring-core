package com.spring.core.practice.dependencyinjection.ioc;

public class Airtel implements Sim {

	public void messaging() {
		System.out.println("This is message impletemented by Airtel");
	}
	
	public void calling() {
		System.out.println("This is call impletemented by Airtel");
		
	}
}
