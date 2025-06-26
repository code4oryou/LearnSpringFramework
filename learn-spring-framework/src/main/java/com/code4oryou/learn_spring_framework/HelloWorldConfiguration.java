package com.code4oryou.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {};

record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Ayush";
	}
	
	@Bean
	public int age() {
		return 24;
	}
	
	@Bean
	public Person person() {
		return new Person("Pushkar", 25, new Address("Alipurduar", "West Bengal"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address()); //name, age method call
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) { 
		//name, age, address3
		return new Person(name, age, address3); //instead of calling the methods directly like in person2MethodCall, we are calling parameters and this is an alternative way
	}
	
	@Bean(name = "address2") // using name attribute we can also change the name of the method
	public Address address() {
		return new Address("Kolkata", "West Bengal");
	}
	
	@Bean(name = "address3") // using name attribute we can also change the name of the method
	public Address address3() {
		return new Address("Siliguri", "West Bengal");
	}
}
