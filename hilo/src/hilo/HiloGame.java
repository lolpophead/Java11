package hilo;
import java.util.Scanner;
	public class HiloGame {
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			//allows for inputs latter in the code 
			
			int randNum;
			int game;
			game = 1;
			// creates the varibles for the random number and for the game state
			randNum = (int)((20)*Math.random()+1);
			//generates a random number between 1-20
			int guess;
			//creates the guess varible
			
			while (game==1) {
				System.out.println("Guess a number between 1-20");
				
				guess = input.nextInt();
			//starts the game in awhile loops and prompts the user to enter a number
			//guess is assigned the variable of the next input
				
				if(guess==randNum) {
					System.out.println("ur right");
					break;
				}
				//if the users guess matches the random number the win and the loop ends
				if(guess>=randNum) {
					System.out.println("Too high");
				}
				//if the guess is greater than the random number it tells the user
				if(guess<=randNum) {
					System.out.println("Too low");
				}
				//if the user's guess is lower than the generated number it tells the user
		}
	
	}

}
	//it worked