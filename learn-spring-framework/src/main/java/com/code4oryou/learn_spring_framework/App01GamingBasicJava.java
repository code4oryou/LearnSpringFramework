package com.code4oryou.learn_spring_framework;

import com.code4oryou.learn_spring_framework.game.GameRunner;
import com.code4oryou.learn_spring_framework.game.MarioGame;
import com.code4oryou.learn_spring_framework.game.PacmanGame;
import com.code4oryou.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame(); //1: Object Creation
		
		var gameRunner = new GameRunner(game); 
		//2: Object Creation + Wiring of Dependencies
		// Game is a Dependency of GameRunner 
		
		gameRunner.run();

	}

}
