package Submerged;

import hsa_new.Console;

public class Submerged {
	
	/**
	 * 
	 * Submerged
	 * Text Adventure Game
	 * FEB.28.2017
	 * @author Jimmy Huynh and Snehan Gorain
	 * 
	 */
	
	public static void main(String[] args) {
		
		Console c = new Console();
		
		// Play again variable
		char playAgain;
		
		
		// Main Program
		do {
			
			// Introduction to the game and situation
			// Stuck in a submarine, no power
		
			c.println("You are trapped in a submarine at the bottom of the ocean. As you were"
				+ " on your way to Tunisia in a private submarine, the lights suddently went"
				+ " out and you crashed. You go to the kitchen to discover the captain of the"
				+ " ship,  dead. With multiple stab wounds, you assume he has been"
				+ " murdered.");
			
			
			// Decisions: find others or stay alone?
			c.println("There are 2 other members on the ship. Do you want to (a): stay "
					+ "alone in case one of them is "
					+ "the murderer?? Or (b): Find the other members?");
			char userInput;
			userInput = c.readChar();
			
			
			//Split up results - incomplete
			if (userInput == 'a') {
				
				// Decision
				c.println("You decide to stay alone, just in case. You need to make your"
						+ " next move. Do you (a) want to take a break and keep hiding? "
								+ "Or (b): go find a weapon");
			}
			
			else {
				// Decision - incomplete
				c.println("You decide to go find help. You head towards the main hallway."
						+ " Do you go to (a) the lounge? Or (b) the bedroom?");
			}
			
			
			
			// Gets input - play again?
			c.println("Would you like to play again? (y/n)");
			playAgain = c.readChar();
			
			if (playAgain != 'n' && playAgain != 'y') {
				playAgain = 'n';
				c.println("That is not a valid answer.");
			}
			
			
		} while (playAgain != 'n');

		c.println("The game has ended.");
		
	}

}
