package com.snakeandladder;

public class SnakeLadder {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Snake and Ladder Problem");		
		
		Player player1 = new Player();
		Player player2 = new Player();
		
		int stop = 0;
		int status = 1;
		
		while(stop != 1)
		{
			switch(status) {
				case 1:
					System.out.println(" \n\n  Player1's turn: \n");
					player1.play();
					if( player1.position == 100) {
						System.out.println("player1 won the match");
						stop = 1;
					}	
					else if( player1.option != player1.LADDER )
						status = 2;	
					break;
					
				case 2:	
					System.out.println(" \n\n Player2's turn: \n");
					player2.play();
					if( player2.position == 100) {
						System.out.println("player2 won the match");
						stop = 1;
					}	
					else if( player2.option != player2.LADDER )
						status = 1;	
					break;
						
			}
		}
		System.out.println();
		System.out.println("no of times dice was played  by player 1 = " + player1.countDice);
		System.out.println("no of times dice was played  by player 2 = " + player2.countDice);
	}

}