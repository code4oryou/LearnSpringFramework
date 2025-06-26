package com.code4oryou.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.code4oryou.learn_spring_framework.game.GameRunner;
import com.code4oryou.learn_spring_framework.game.MarioGame;
import com.code4oryou.learn_spring_framework.game.PacmanGame;
import com.code4oryou.learn_spring_framework.game.SuperContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1: Launch a Spring Context
		
		var context = 
			new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2: Configure the things that we want Spring to manage - @Configuration
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));

		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("person2MethodCall")); // we can call the bean methods directly i.e., the names and age by this method also by using the name and age methods
		
		System.out.println(context.getBean("person3Parameters"));
		
		System.out.println(context.getBean("address2"));
		
//		System.out.println(context.getBean(Address.class)); // this is an alternative way of retreiving the same result using type
	}

}
