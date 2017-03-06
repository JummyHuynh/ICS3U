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
		// Resting code - Thread.sleep(milliseconds);
		
		// Main Program
		do {
			
			// Introduction to the game and situation
			// Stuck in a submarine, no power
		
			c.println("You are trapped in a submarine at the bottom of the ocean. As you were"
				+ " on your way to Tunisia in a private submarine, the lights suddently went"
				+ " out and you crashed. You go to the kitchen to discover the captain of the"
				+ " ship,  dead. With multiple stab wounds, you assume he has been"
				+ " murdered.");
			c.println(); //for spacing
			
			
			// Decisions: find others or stay alone?
			c.println("There are 2 other members on the ship. Do you want to (a): stay "
					+ "alone in case one of them is "
					+ "the murderer?? Or (b): Find the other members?");
			c.println(); //for spacing
			
			char userInput;
			userInput = c.readChar();
			c.readChar(); //read in enter at the end of the line
			
			
			//Split up results - incomplete
			if (userInput == 'a') {
				
				// Decision
				c.println("You decide to stay alone, just in case. You need to make your"
						+ " next move. Do you (a) want to take a break and keep hiding? "
								+ "Or (b): go find a weapon");
				c.println(); //for spacing
	
				
				
				userInput = c.readChar();
				c.readChar(); //read in enter at the end of the line
				
				if (userInput == 'a') {
					c.println("You take a break. The door locks and you suffocate.");
					c.println(); //for spacing
					// END
				}
				else {
					// Array for weapons
					String[] weapons = {"Rope", "Pistol", "Axe"};
					// The weapon they acquire
					int acquiredWeapon = (int)(Math.random() * 3);
					
					
					//Easier way:
					c.println("You got the " + weapons[acquiredWeapon]);
					
					
				// Random Number Generator - not working
					int randomPersonNumber = (int)(Math.random() * 2);
					
					// Meet the co-captain
					if (randomPersonNumber == 0) {
						
						c.println("You meet the co-captain. You don't know whether to"
								+ " trust him. Do you (a) attack? or (b) help him?");
						c.println(); //for spacing
						
						userInput = c.readChar();
						c.readChar(); //read in enter at the end of the line
						
						//Attack the CC
						if (userInput == 'a') {
						
							
							//weapon is rope
							if (acquiredWeapon == 0) {
								c.println("You attack him with a rope. He manages to free himeself"
										+ " and, feeling threatened, he subdues you and handcuffs "
										+ "you to the desk. When he finally gets everyone out, you"
										+ " are arrested and blamed for the murder.");
							}
							// weapon is pistol
							else if (acquiredWeapon == 1){
								// Random amount of bullets
								int randomBullets = (int)(Math.random() * 2);
								
								//If there are no bullets
								if (randomBullets == 0) {
									c.println("You shoot, but nothing comes out of the barrel. The co-captain"
											+ " feels threatened and attacks you while you are distracted by your"
											+ " dumb ass. You eventually get arrested and charged for the murder"
											+ " of the captain.");
									//END
								}
								
								//If there is a bullet
								else {
									c.println("You try to aim for his leg, but without proper training, you "
											+ "accidentally shoot him in the chest, and he dies. You have killed"
											+ " your only way out. You try to get yourself out but you run out "
											+ "of oxygen and die.");
									//END
								}
							
								
							}
							// weapon is axe
							else {
								c.println("You attack the captain. Not meaning to kill him, you aim for"
										+ " his back, but he ducks and you bash his head. You have "
										+ "killed your only way out. Struggling with the controls yourself, "
										+ "you eventually run out of oxygen and die.");
								//END
							}
							
							
						}
						
						//Help the captain
						
						else {
							c.println("You help the captain. You both work together to fix the wiring"
									+ " and reboot the sub. You work together and get out of there. "
									+ "The friend gets arrested for murder.");
							c.println(); //spacing
							
							// END
						}
						
						}
					
						
						
						// Meet the "friend"
					else {
						
						c.println("You see the friend. You don't know whether to"
								+ " trust him. He doesn't see you, so you have the advantage."
								+ " Do you (a) attack? or (b) help him?");
						c.println(); //for spacing
						
						userInput = c.readChar();
						
						// Attack the friend
						if(userInput == 'a') {
							
							String weaponAttack; 
									
							if (acquiredWeapon == 0) {
								weaponAttack = "Strangle";
							}
							else if (acquiredWeapon == 1) {
								weaponAttack = "Shoot";
							}
							else {
								weaponAttack = "Bash";
							}
							
							c.println("You sneak up on him and " + weaponAttack + " him with" 
									+ " the " + weapons[acquiredWeapon]);
							c.println("He gets knowcked out and you handcuff him to prevent him"
									+ " from doing anything else. You find the murder weapon on him, "
									+ "and you go find the co-captain, knowing he is innocent. "
									+ "You work together to get help. You are saved.");
							// END
						
						}
						
						//help the friend
						else {
							c.println("He attacks you and ties you up. "
									+ "He blames you for the murder, even though you didn't do anything."
									+ " You get arrested and you never get to clear your name.");
							// END
						}
						
					}
					
				}
			}
			
			else {
				
				char finalAnswer;
				
			do {
				finalAnswer = 0;
				
				// Decision - incomplete (need do loop)
				c.println("You decide to go find help. You head towards the main hallway."
						+ " Do you go to (a) the lounge? Or (b) the bedroom?");
				c.println(); //for spacing
				userInput = c.readChar();
				c.readChar();
				
				
					//You go to lounge
				
				if (userInput == 'a') {
					c.println("You find the friend in the lounge. You don't know"
							+ " why he's there. Are you going to (a) trust him? or"
							+ " (b) go back to the hallway?");
					finalAnswer = c.readChar();
					c.readChar();
					
				}
				// go to bedroom
				else {
					c.println("You find the co-captain in the bedroom. You don't know"
							+ " why he's there. Are you going to (a) trust him? or"
							+ " (b) go back to the hallway?");
					finalAnswer = c.readChar();
					c.readChar();
					
				}
				
				// Redo this
				} while (finalAnswer != 'a');
			
			//the lounge
				if (userInput == 'a') {
					c.println("You trusted the friend. They tell you that they need to go "
							+ "to the control room. He offers you to go first. Do you"
							+ " (a) accept and go first? or (b) tell him to go first?");
					userInput = c.readChar();
					c.readChar();
					
					//You go first
					if (userInput == 'a') {
						c.println("He stabs you, you ded.");
						c.println(); // for spacing
						
						//END
						
					}
					
					//you go second
					else {
						c.println("You say you'd feel more comfortable if you walked behind. "
								+ "he accepts. You notice something stained his shirt. Do you"
								+ " (a) ask him about it? or (b) try to get away?");
						
						userInput = c.readChar();
						c.readChar();
						
						//asked him
						if (userInput == 'a') {
							c.println("He knows you're onto him. He shanks yo limpy ass. You ded.");
							c.println(); // for spacing
							
							// END
							
						}
						else {
							c.println("You need to get away. Do you (a) run or do you (b) sneak away and"
									+ " hope he doesn't notice?");
							userInput = c.readChar();
							c.readChar();
							
							//Run and notices
							if (userInput == 'a') {
								c.print("He notices you and  chases after. He gets to you, ties you up. You lose.");
								c.println();
								// END
							}
							
							// Sneak away
							else {
								c.println("You find scuba-gear and you leave the submarine. On the surface of the water,"
										+ " you see an island and a boat. You don't know if the boat is going towards or away"
										+ " from you. Do you (a) got to the island? or (b) risk going to the boat?");
								userInput = c.readChar();
								c.readChar();
								
								
								//Swim to island
								if (userInput == 'a') {
									c.println("You are safe, but you are stranded on the island.");
									//END
								}
				
								
								else {
									int randomBoatDestiny = (int)(Math.random() * 2);

									if (randomBoatDestiny == 0) {
										c.println("The boat heads in your direction and you are"
												+ " saved and brought back to Malta.");
										//END
									}
									else {
										c.println("The boat was heading away from you. You get lost "
												+ "and are stranded out at sea");
										//END
												
									}
									
								
								}
							}
							
						}
					}
				}
			// The bedroom
				else {
					c.println("You find the co-captain. Do you (a) go to the control room, or do you "
							+ "(b) go to the bedroom to search for clues");
					userInput = c.readChar();
					
					//With the loop
					if (userInput == 'a') {
						
						int [] passcode = {12, 21, 23, 32};
						int passcodeArrayNumber = (int)(Math.random()*4);
						
						int password = 1200 + passcode[passcodeArrayNumber];
						
						c.println("You go to the control room and find the pass lock. You know the first 2 "
								+ "digits are 1  and 2, but you don't know the last 2. You have to guess."
								+ " The captain can't remember if it is 12, 21, 23, or 32, but he knows one "
								+ "of them is right."
								+ " Enter in the 4 digits, you have 2 chances.");
						
						//password loop
						int passcodeEntered;
						int counter;
						for (counter = 1; counter >= 0; counter--) {
							
							passcodeEntered = c.readInt();
							
							if (passcodeEntered == password) {
								counter = 0;
								c.println("The co-captain takes control of the submarine and you both "
										+ "escape to safety.");
								//END
								
							}
							
				
							else {
								c.println("The passcode you entered was incorrect.");
								c.println("You have " + counter + " chance(s) left.");
								if (counter == 0) {
									c.println("You have exceeded your maximum entries. You are locked into the"
											+ " control room for an hour. The friend sneaks up on you as you spent"
											+ " all your time on the passcode. He subdues you and you die.");
									//END
							}
							
						}
						
						
							
							
						}
					
					}
					
					// Search around
					
					else {
						c.println("You search around for clues. You find the captain's notebook which contains the passcode."
								+ " Both you and the captain run to the control room and open the lock. Should you (a)"
								+ " lock the door? or (b) leave it?");
						
						userInput = c.readChar();
						c.readChar();
						if (userInput == 'a') {
							c.println("You live.");
							// END
						}
						else {
							c.println("You die.");
							// END
						}
						
					}
					
				}

			
			
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
