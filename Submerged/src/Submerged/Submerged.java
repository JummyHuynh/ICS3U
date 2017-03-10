package Submerged;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

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

		Console c = new Console(35, 80);

		// Input variables
	
		char userInput;
		char playAgain;
		// Resting code - Thread.sleep(milliseconds);

		//Image declarations

		BufferedImage submarine = null;
		BufferedImage controlRoom = null;
		BufferedImage axe = null;
		BufferedImage closetDoor = null;
		BufferedImage rope = null;
		BufferedImage gun = null;
		
		Clip stab = null;



		// Main Program
		do {

			// Introduction to the game and situation
			// Stuck in a submarine, no power

			// Array for weapons
			String[] weapons = {"Rope", "Pistol", "Axe"};
			// The weapon they acquire
			int acquiredWeapon = (int)(Math.random() * 3);

			try {
				submarine = ImageIO.read(new File("Images/Submarine.jpg"));
			} catch (IOException e) {
				// Should not have a catch
				c.println("There was an error loading the image");
				e.printStackTrace();
			}

			
			try {
				
				// *****************************
				// THESE LINES CREATE THE CLIP TO PLAY THE MUSIC. 
				// Cut and paste them into your program, and change "theme.wav"
				// to the sound you want to play. 
				stab = AudioSystem.getClip(); //create the clip object
				stab.open(AudioSystem.getAudioInputStream(new File("Audio/Stab.wav"))); //open the given file for the clip

				System.out.println("OK, here comes some music!");
				c.println("OK, here comes some music!");
				Thread.sleep(1000);

				// ************************
				// Include this line when you want the sound to start playing.
				stab.start();
				// Instead of using start you could alternatively use the loop function.
				// The following line will loop your music until stop is called.
				// theme.loop(Clip.LOOP_CONTINUOUSLY);
				// ************************

				// THE PROGRAM CONTINUES WHILE THE MUSIC PLAYS
				Thread.sleep(5000);
				System.out.println("Hope you like it!");
				Thread.sleep(500);
				
				
				// ************************
				// Include this line when you want the sound to stop playing.
				stab.stop();
				// ************************

				Thread.sleep(1000);
				System.out.println("Goodbye");  

			} catch (Exception e) {
				e.printStackTrace();
			}
			//************************
			
			c.drawImage(submarine, 0, 0, 800, 700, null);

			c.println("You are trapped in a submarine at the bottom of the ocean. As you were"
					+ " on your way to Tunisia, the lights suddently went"
					+ " out and you crashed.");
			c.println("You go to the kitchen to discover the captain of the ship dead. With multiple stab wounds, you assume he has been murdered.");
			c.println(); //for spacing


			// Decisions: find others or stay alone?
			c.println("There are 2 other members on the ship. Do you want to");
			c.println("(a): Stay alone in case one of them is the murderer?");
			c.println("(b): Find the other members?");
			c.println(); //for spacing


			userInput = c.readChar();
			c.readChar(); //read in enter at the end of the line

			c.clear(); // clears screen


			//Ensures they put in either a or b
			while (userInput != 'a' && userInput != 'b') {

				c.clear(); // clears screen

				c.println("You must choose either 'a' or 'b'");

				c.println();
				c.println("There are 2 other members on the ship. Do you want to");
				c.println("(a): Stay alone in case one of them is the murderer?");
				c.println("(b): Find the other members?");

				userInput = c.readChar();
				c.readChar(); //read in enter at the end of the line

				c.clear(); // clears screen

			}

			// Split up results
			if (userInput == 'a') {

				// Decision
				c.println("You decide to stay alone, just in case. You need to make your next move. Do you ");
				c.println("(a): Want to take a break and keep hiding?");
				c.println("(b): Go find a weapon");
				c.println(); //for spacing

				userInput = c.readChar();
				c.readChar(); //read in enter at the end of the line

				//Ensures they put in either a or b
				while (userInput != 'a' && userInput != 'b') {

					c.clear(); // clears screen

					c.println("You must choose either 'a' or 'b'");

					c.println();
					c.println("You decide to stay alone, just in case. You need to make your next move. Do you ");
					c.println("(a): Want to take a break and keep hiding");
					c.println("(b): Go find a weapon");
					c.println(); //for spacing

					userInput = c.readChar();
					c.readChar(); //read in enter at the end of the line

					c.clear(); // clears screen
				}
				
				c.clear(); // clears screen

				if (userInput == 'a') {
					c.println("You take a break. The door locks and you suffocate.");
					c.println(); //for spacing
					// END
				}
				else {

					//Easier way:
					c.println("You got the " + weapons[acquiredWeapon]);

					//Output the image of the acquired weapon
					if (acquiredWeapon == 0) {
						try {
							rope = ImageIO.read(new File("Images/Rope.jpeg"));
						} catch (IOException e) {
							// Should not have a catch
							c.println("There was an error loading the image");
							e.printStackTrace();
						}

						c.drawImage(rope, 100, 300, 200, 150, null);
					}

					else if (acquiredWeapon == 1) {
						try {
							gun = ImageIO.read(new File("Images/Gun.jpg"));
						} catch (IOException e) {
							// Should not have a catch
							c.println("There was an error loading the image");
							e.printStackTrace();
						}

						c.drawImage(gun, 100, 300, 200, 150, null);
					}

					else {
						try {
							axe = ImageIO.read(new File("Images/Axe.jpg"));
						} catch (IOException e) {
							// Should not have a catch
							c.println("There was an error loading the image");
							e.printStackTrace();
						}

						c.drawImage(axe, 100, 300, 200, 150, null);
					}


					// Random Number Generator - not working
					int randomPersonNumber = 0;
					randomPersonNumber = (int)(Math.random() * 2);

					// Meet the co-captain
					if (randomPersonNumber == 0) {

						c.println("You meet the co-captain. You don't know whether to trust him. Do you");
						c.println("(a): Attack");
						c.println("(b): Help him");
						c.println(); //for spacing

						userInput = c.readChar();
						c.readChar(); //read in enter at the end of the line

						//Ensures they put in either a or b
						while (userInput != 'a' && userInput != 'b') {

							c.clear(); // clears screen

							c.println("You must choose either 'a' or 'b'");

							c.println();
							c.println("You meet the co-captain. You don't know whether to trust him. Do you");
							c.println("(a): Attack");
							c.println("(b): Help him");

							c.println(); //for spacing
							userInput = c.readChar();
							c.readChar();

							//Output the image of the acquired weapon

						}


						//Attack the CC
						if (userInput == 'a') {


							//weapon is rope
							if (acquiredWeapon == 0) {
								c.println("You attack him with a rope. He manages to free himeself"
										+ " and, feeling threatened, he subdues you and handcuffs "
										+ "you to the desk.");
								c.println("When he finally gets everyone out, you are arrested and blamed for the murder.");
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

						c.println("You see the friend. You don't know whether to trust him. He doesn't see you, so you have the advantage.");
						c.println("Do you");
						c.println("(a): Attack");
						c.println("(b): Help him?");
						c.println(); //for spacing

						userInput = c.readChar();
						c.readChar();

						c.clear(); // clears screen

						//Ensures they put in either a or b
						while (userInput != 'a' && userInput != 'b') {

							c.clear(); // clears screen

							c.println("You must choose either 'a' or 'b'");

							c.println();
							c.println("You see the friend. You don't know whether to trust him. He doesn't see you, so you have the advantage.");
							c.println("Do you");
							c.println("(a): Attack");
							c.println("(b): Help him?");
							c.println(); //for spacing

							userInput = c.readChar();
							c.readChar(); //read in enter at the end of the line

							c.clear(); // clears screen

						}

						// Attack the friend
						if(userInput == 'a') {

							String weaponAttack; 

							if (acquiredWeapon == 0) {
								weaponAttack = "strangle";
							}
							else if (acquiredWeapon == 1) {
								weaponAttack = "shoot";
							}
							else {
								weaponAttack = "bash";
							}

							c.println("You sneak up on him and " + weaponAttack + " him with" 
									+ " the " + weapons[acquiredWeapon]);
							c.println("He gets knocked out and you handcuff him to prevent him"
									+ " from doing anything else. You find the murder weapon on him, "
									+ "and you go find the co-captain, knowing he is innocent. "
									+ "You work together to get help. You are saved.");

							c.println(); // for spacing

							// END

						}

						//help the friend
						else {
							c.println("He attacks you and ties you up. "
									+ "He blames you for the murder, even though you didn't do anything."
									+ " You get arrested and you never get to clear your name.");

							c.println(); // for spacing

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
							+ " Do you go to");
					c.println("(a) The lounge");
					c.println("(b) The bedroom?");

					c.println(); //for spacing
					userInput = c.readChar();
					c.readChar();

					c.clear(); // clears screen


					//Ensures they put in either a or b
					while (userInput != 'a' && userInput != 'b') {

						c.clear(); // clears screen

						c.println("You must choose either 'a' or 'b'");

						c.println();
						c.println("You decide to go find help. You head towards the main hallway."
								+ " Do you go to");
						c.println("(a) The lounge");
						c.println("(b) The bedroom?");
						c.println(); //for spacing
						userInput = c.readChar();
						c.readChar(); //read in enter at the end of the line

						c.clear(); // clears screen

					}

					//You go to lounge

					if (userInput == 'a') {
						c.println("You find the friend in the lounge. You don't know why he's there. Are you going to");
						c.println("(a) Trust him");
						c.println("(b) Go back to the hallway?");
						finalAnswer = c.readChar();
						c.readChar();

						c.clear(); // clears screen

						//Ensures they put in either a or b
						while (finalAnswer != 'a' && finalAnswer != 'b') {

							c.clear(); // clears screen

							c.println("You must choose either 'a' or 'b'");
							c.println();

							c.println("You find the friend in the lounge. You don't know why he's there. Are you going to");
							c.println("(a) Trust him");
							c.println("(b) Go back to the hallway?");
							c.println(); //for spacing
							finalAnswer = c.readChar();
							c.readChar(); //read in enter at the end of the line

							c.clear(); // clears screen

						}

					}
					// go to bedroom
					else {
						c.println("You find the co-captain in the lounge. You don't know why he's there. Are you going to");
						c.println("(a) Trust him");
						c.println("(b) Go back to the hallway?");
						finalAnswer = c.readChar();
						c.readChar();

						while (finalAnswer != 'a' && finalAnswer != 'b') {

							c.clear(); // clears screen

							c.println("You must choose either 'a' or 'b'");

							c.println();
							c.println("You find the co-captain in the lounge. You don't know why he's there. Are you going to");
							c.println("(a) Trust him");
							c.println("(b) Go back to the hallway?");
							c.println(); //for spacing
							finalAnswer = c.readChar();
							c.readChar(); //read in enter at the end of the line

							c.clear(); // clears screen

						}

						c.clear(); // clears screen

					}



				} while (finalAnswer != 'a');

				//the lounge
				if (userInput == 'a') {
					c.println("You trusted the friend. They tell you that they need to go "
							+ "to the control room. He offers you to go first. Do you"
							+ " (a) accept and go first? or (b) tell him to go first?");

					userInput = c.readChar();
					c.readChar();

					c.clear(); // clears screen

					//ensures they input a or b
					while (userInput != 'a' && userInput != 'b') {

						c.clear(); // clears screen

						c.println("You must choose either 'a' or 'b'");

						c.println();
						c.println("You trusted the friend. They tell you that they need to go "
								+ "to the control room. He offers you to go first. Do you"
								+ " (a) accept and go first? or (b) tell him to go first?");
						c.println(); //for spacing
						userInput = c.readChar();
						c.readChar(); //read in enter at the end of the line

						c.clear(); // clears screen

					}

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

						c.clear(); // clears screen

						while (userInput != 'a' && userInput != 'b') {

							c.clear(); // clears screen

							c.println("You must choose either 'a' or 'b'");

							c.println();
							c.println("You say you'd feel more comfortable if you walked behind. "
									+ "he accepts. You notice something stained his shirt. Do you"
									+ " (a) ask him about it? or (b) try to get away?");
							c.println(); //for spacing
							userInput = c.readChar();
							c.readChar(); //read in enter at the end of the line

							c.clear(); // clears screen

						}


						//asked him
						if (userInput == 'a') {
							c.println("Your questioning threatens him. You don't notice him pulling out his"
									+ "dagger and ending your life.");
							c.println(); // for spacing

							// END

						}
						else {
							c.println("You need to get away. Do you (a) run or do you (b) sneak away and"
									+ " hope he doesn't notice?");

							userInput = c.readChar();
							c.readChar();

							c.clear(); // clears screen

							while (userInput != 'a' && userInput != 'b') {

								c.clear(); // clears screen

								c.println("You must choose either 'a' or 'b'");

								c.println();
								c.println("You need to get away. Do you (a) run or do you (b) sneak away and"
										+ " hope he doesn't notice?");
								c.println(); //for spacing
								userInput = c.readChar();
								c.readChar(); //read in enter at the end of the line

								c.clear(); // clears screen

							}

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

								c.clear(); // clears screen

								while (userInput != 'a' && userInput != 'b') {

									c.clear(); // clears screen

									c.println("You must choose either 'a' or 'b'");

									c.println();
									c.println("You find scuba-gear and you leave the submarine. On the surface of the water,"
											+ " you see an island and a boat. You don't know if the boat is going towards or away"
											+ " from you. Do you (a) got to the island? or (b) risk going to the boat?");
									c.println(); //for spacing
									userInput = c.readChar();
									c.readChar(); //read in enter at the end of the line

									c.clear(); // clears screen

								}


								//Swim to island
								if (userInput == 'a') {
									c.println("You are safe, but you are stranded on the island.");

									c.println(); // for spacing

									//END
								}


								else {
									int randomBoatDestiny = (int)(Math.random() * 2);

									if (randomBoatDestiny == 0) {
										c.println("The boat heads in your direction and you are"
												+ " saved and brought back to Malta.");

										c.println(); // for spacing

										//END
									}
									else {
										c.println("The boat was heading away from you. You get lost "
												+ "and are stranded out at sea");

										c.println(); // for spacing

										//END
									}
								}
							}
						}
					}
				}

				
				// whiles are good until here
				
				
				
				// The bedroom
				else {
					c.println("You find the co-captain. Do you (a) go to the control room, or do you "
							+ "(b) go to the bedroom to search for clues");

					userInput = c.readChar();
					c.readChar();

					c.clear(); // clears screen

					while (userInput != 'a' && userInput != 'b') {

						c.clear(); // clears screen

						c.println("You must choose either 'a' or 'b'");

						c.println();
						c.println("You find the co-captain. Do you (a) go to the control room, or do you "
								+ "(b) go to the bedroom to search for clues");
						c.println(); //for spacing
						userInput = c.readChar();
						c.readChar(); //read in enter at the end of the line

						c.clear(); // clears screen

					}

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

						//password loop -- ERROR TO FIX
						int passcodeEntered = 0;
						int counter;
						for (counter = 1; counter >= 0; counter--) {

							// Loop for numbers, ensures it is a number
							boolean flag = false;
							do {
								flag = false;
								try {
									passcodeEntered = Integer.parseInt(c.readLine());
								} catch (Exception e) {
									c.println("Please enter numbers.");
									flag = true;
								}
							}while(flag);

							if (passcodeEntered == password) {
								counter = 0;
								c.println("The co-captain takes control of the submarine and you both "
										+ "escape to safety.");

								c.println(); // for spacing

								//END

							}

							else {
								c.println("The passcode you entered was incorrect.");
								c.println("You have " + counter + " chance(s) left.");
								if (counter == 0) {
									c.println("You have exceeded your maximum entries. You are locked into the"
											+ " control room for an hour. The friend sneaks up on you as you spent"
											+ " all your time on the passcode. He subdues you and you die.");

									c.println(); // for spacing

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

						c.clear(); // clears screen

						while (userInput != 'a' && userInput != 'b') {

							c.clear(); // clears screen

							c.println("You must choose either 'a' or 'b'");

							c.println();
							c.println("You search around for clues. You find the captain's notebook which contains the passcode."
									+ " Both you and the captain run to the control room and open the lock. Should you (a)"
									+ " lock the door? or (b) leave it?");
							c.println(); //for spacing
							userInput = c.readChar();
							c.readChar(); //read in enter at the end of the line

							c.clear(); // clears screen

						}


						// Lock the door
						if (userInput == 'a') {
							c.println("You lock the door, just to be sure. You hear a loud, threatening bang, but you"
									+ " ignore it to work on the task at hand. You both work together and get to safety.");

							c.println(); // for spacing

							// END
						}

						// Leave the lock
						else {
							c.println("You leave it unlocked. You both work together to get out. Halfway through"
									+ " someone barges into the room with a knife. It is the friend; he is holding"
									+ " you hostage. You never make it out.");

							c.println(); // for spacing

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

			c.clear(); // clears screen

		} while (playAgain != 'n');

		c.println("The game has ended.");
	}
}
