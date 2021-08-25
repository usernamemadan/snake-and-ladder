package com.snakeandladder;

public class Player {

	final int NO_PLAY = 1;
	final int LADDER = 2;
	final int SNAKE =3;
	
	int countDice =0;
	int position = 0;
	int option = 0;
	
	
	public void play() {
	
		int diceRoll = 1 + (int) Math.floor(Math.random() * 10) % 6;
		
		option = 1 + (int) Math.floor(Math.random() * 10) % 3;
	
		if(option == NO_PLAY){
			System.out.println("No Play");
		}else if(option == LADDER) {
			System.out.println("Player moved forward by "+diceRoll);
			position+=diceRoll;
			countDice++;
		}else if(option == SNAKE) {
			System.out.println("Player moved backward by "+diceRoll);
			position-=diceRoll;
			countDice++;
		}
		
		if(position<0)
			position = 0;
		else if(position>100)
			position-= diceRoll;
		
		System.out.println("Player's position : " + position);
		
		
		
	}
}
