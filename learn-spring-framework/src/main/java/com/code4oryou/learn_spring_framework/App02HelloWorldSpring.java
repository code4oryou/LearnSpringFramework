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
		

	}

}
