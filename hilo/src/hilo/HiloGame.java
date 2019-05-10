package hilo;
import java.util.Scanner;
	public class HiloGame {
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			int randNum;
			int game;
			game = 1;
			
			randNum = (int)((20)*Math.random()+1);
			
			int guess;
			
			
			while (game==1) {
				System.out.println("Guess a number between 1-20");
				
				guess = input.nextInt();
				
				
				if(guess==randNum) {
					System.out.println("ur right");
					break;
				}
				if(guess>=randNum) {
					System.out.println("Too high");
				}
				if(guess<=randNum) {
					System.out.println("Too low");
				}
		}
	
	}

}