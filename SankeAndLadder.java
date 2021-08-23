package com.snakeandladder;

public class SnakeAndLadder {

	public static void main(String[] args) {
		final int NO_PLAY = 1;
		final int LADDER = 2;
		final int SNAKE =3;
		
		int position=0;
		int countDice =0;
		System.out.println("Welcome to Snake and Ladder Problem");		
		
		while(position != 100){
			
			int option = 1 + (int) Math.floor(Math.random() * 10) % 3;
		
			if(option == NO_PLAY){
				System.out.println("No Play");
			}
			else if(option == LADDER) {
				System.out.println("Player moved forward by "+diceRoll);
				position+=diceRoll;
				countDice++;
			}
			else if(option == SNAKE) {
				System.out.println("Player moved backward by "+diceRoll);
				position-=diceRoll;
				countDice++;
			}
			if(position<0)
				position = 0;
			else if(position>100)
				position-= diceRoll;
			
	}
		System.out.println("no of time dice was played" + countDice);
}
