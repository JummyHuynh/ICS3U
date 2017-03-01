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
			c.readChar(); //read in enter at the end of the line
			
			
			//Split up results - incomplete
			if (userInput == 'a') {
				
				// Decision
				c.println("You decide to stay alone, just in case. You need to make your"
						+ "   next move. Do you (a) want to take a break and keep hiding? "
								+ "Or (b): go find a weapon");
				
				
				userInput = c.readChar();
				c.readChar(); //read in enter at the end of the line
				
				if (userInput == 'a') {
					c.println("You take a break. The door locks and you suffocate.");
					// END
				}
				else {
					// Array for weapons
					String[] weapons = {"Rope", "Pistol", "Axe"};
					// The weapon they acquire
					int acquiredWeapon = (int)(Math.random() * 3);
					
					if (acquiredWeapon == 0) {
						c.println("You got the rope");
					}
					else if (acquiredWeapon == 1) {
						c.println("You got the pistol");
					}
					else {
						c.println("You got the axe");
					}
					
					
				// Random Number Generator - not working
					int randomPersonNumber = (int)(Math.random() * 2) + 1;
					
					// Meet the co-captain
					if (randomPersonNumber == 1) {
						
						c.println("You meet the co-captain. You don't know whether to"
								+ " trust him. Do you (a) attack? or (b) help him?");
						
						userInput = c.readChar();
						c.readChar(); //read in enter at the end of the line
						
						//Attack the CC
						if (userInput == 'a') {
							//
						}
						
						}
						
						
						// Meet the "friend" (still have to write code)
					else {
						
						c.println("You meet the friend. You don't know whether to"
								+ " trust him. Do you (a) attack? or (b) help him?");
						
					}
					
				}
			}
			
			else {
				// Decision - incomplete
				c.println("You decide to go find help. You head towards the main hallway."
						+ " Do you go to (a) the lounge? Or (b) the bedroom?");
			}
			
			
			
			// Gets input - play again?
			c.println("Would you like to play again? (y/n)");
			playAgain = c.readChar();
			c.readChar(); //read in enter at the end of the line
			
			if (playAgain != 'n' && playAgain != 'y') {
				playAgain = 'n';
				c.println("That is not a valid answer.");
			}
			
			
		} while (playAgain != 'n');

		c.println("The game has ended.");
		
	}

}
