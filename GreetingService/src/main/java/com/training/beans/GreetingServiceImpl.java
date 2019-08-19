package com.training.beans;

public class GreetingServiceImpl implements GreetingService {
	private String greeting;
	
	public GreetingServiceImpl() {} //Initialize through constructor
		
	public GreetingServiceImpl(String greeting) { //Initialize through constructor
		this.greeting = greeting;
	}

	public void sayGreeting() {
		System.out.println("Hello "+greeting);
		
	}
	
	public void setGreeting(String greeting) {//Initialize through setter method
		this.greeting=greeting;
		
	}

}
