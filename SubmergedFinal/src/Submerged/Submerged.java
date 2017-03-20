package Submerged;

import java.awt.Color;
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
		
		/** String text = "";
		slowPrint(text, 30);
		
		public static void slowPrint(String text, long millisPerChar) {
		for (int i = 0; i > text.length(); i++) {
			
			c.print(text.charAt(i));
			
			try {
				Thread.sleep(millisPerChar);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	*/

		Console c = new Console(30, 80);

		// Input variables
		char userInput;
		char playAgain = 0;

		//Image declarations
		BufferedImage submarine = null;
		BufferedImage controlRoom = null;
		BufferedImage axe = null;
		BufferedImage closetDoor = null;
		BufferedImage rope = null;
		BufferedImage gun = null;
		BufferedImage friend = null;
		BufferedImage coCaptain = null;
		BufferedImage lounge = null;
		BufferedImage bedroom = null;
		BufferedImage notebook = null;
		BufferedImage theEnd = null;
		BufferedImage hallway = null;
		BufferedImage arrested = null;
		BufferedImage sunkenSub = null;
		BufferedImage land = null;
		BufferedImage land2 = null;
		BufferedImage passcodeLock = null;
		BufferedImage stabbedDead = null;
		BufferedImage bloodStain = null;
		BufferedImage friendWalking = null;
		BufferedImage hostage = null;
		BufferedImage boatOrLand = null;
		BufferedImage boat = null;
		BufferedImage docks = null;
		BufferedImage extraRoom = null;

		// Sound Declarations
		Clip stab = null;
		Clip doorLocking = null;
		Clip foghorn = null;
		Clip ocean = null;
		Clip whack = null;
		Clip gunshot = null;
		Clip ropeStrangle = null;
		Clip shuffling = null;
		Clip surfacingWater = null;
		Clip emptyGunshot = null;
		Clip computer = null;
		Clip ding = null;
		Clip eerieBackgroundMusic = null;

		// Main Program
		do {

			c.setTextBackgroundColor(Color.white);
			c.setTextColor(Color.black); 
			c.setBackground(Color.white);

			// background music clip
			try {
				eerieBackgroundMusic = AudioSystem.getClip(); //create the clip object
				eerieBackgroundMusic.open(AudioSystem.getAudioInputStream(new File("Audio/EerieBackgroundMusic.wav")));
				eerieBackgroundMusic.loop(Clip.LOOP_CONTINUOUSLY);
			} catch (Exception e) {
				e.printStackTrace();
			}

			c.clear(); // makes sure everything is gone when it loops

			// Array for weapons
			String[] weapons = {"rope", "revolver", "axe"};
			// Randomizes the weapon they acquire
			int acquiredWeapon = (int)(Math.random() * 3);

			// Outputs submarine image
			try {
				submarine = ImageIO.read(new File("Images/Submarine.jpg"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			c.drawImage(submarine, 0, 0, 800, 700, null);

			// Extra - may use later?
			/**c.setTextBackgroundColor(Color.BLACK);
			c.setTextColor(Color.white); */

			/**
			 * for(int i=0; i<text.length();i++){
   System.out.print(""+text.characterAt(i));
    try {
       Thread.sleep(100); 
    } catch (Exception e) {
       e.printStackTrace();
    }
}
			 */

			
			// Introduction to the game and situation
			c.println("You are trapped in a submarine at the bottom of the ocean. As you were on your" + "\n" + "way to Tunisia, the lights suddenly went out and you crashed.");
			c.println("You go to the kitchen to discover the captain of the ship dead. With multiple" + "\n" + "stab wounds, you assume he has been murdered.");
			c.println(); //for spacing

			// Decision- find others or stay alone?
			c.println("There are 2 other members on the ship. You");
			c.println("(a): Stay alone in case one of them is the murderer");
			c.println("(b): Find the other members");
			c.println(); //for spacing

			userInput = c.getChar();

			c.clear(); // clears screen

			//Ensures they put in either a or b
			while (userInput != 'a' && userInput != 'b') {

				c.clear(); // clears screen

				// Submarine image
				c.drawImage(submarine, 0, 0, 800, 700, null);

				c.println("You must choose either 'a' or 'b'");
				c.println(); // for spacing
				c.println("There are 2 other members on the ship. You");
				c.println("(a): Stay alone in case one of them is the murderer");
				c.println("(b): Find the other members");
				c.println(); // for spacing				

				userInput = c.getChar();

				c.clear(); // clears screen
			}

			// Split up
			if (userInput == 'a') {

				// Closet door image
				try {
					closetDoor = ImageIO.read(new File("Images/ClosetDoor.jpg"));
				} catch (IOException e) {
					e.printStackTrace();
				}

				c.drawImage(closetDoor, 0, 0, 700, 800, null);

				c.println("You decide to stay alone, just in case. You need to make your next move. You ");
				c.println("(a): Want to take a break and keep hiding");
				c.println("(b): Go find a weapon");
				c.println(); //for spacing

				userInput = c.getChar();

				c.clear();

				// Ensures they put in either a or b
				while (userInput != 'a' && userInput != 'b') {

					c.clear(); // clears screen

					// Closet door image
					c.drawImage(closetDoor, 0, 0, 700, 800, null);

					c.println("You must choose either 'a' or 'b'");

					c.println();
					c.println("You decide to stay alone, just in case. You need to make your next move. You ");
					c.println("(a): Want to take a break and keep hiding");
					c.println("(b): Go find a weapon");
					c.println(); //for spacing


					userInput = c.getChar();

					c.clear(); // clears screen
				}

				c.clear(); // clears screen

				//take a break
				if (userInput == 'a') {

					// Closet door image
					c.drawImage(closetDoor, 0, 0, 700, 800, null);

					// Door locking sound
					try {
						doorLocking = AudioSystem.getClip(); //create the clip object
						doorLocking.open(AudioSystem.getAudioInputStream(new File("Audio/DoorLocking.wav"))); //open the given file for the clip

						doorLocking.start();
						//stab.stop();
					} catch (Exception e) {
						e.printStackTrace();
					}

					c.setTextBackgroundColor(Color.BLACK);
					c.setTextColor(Color.white);
					c.setBackground(Color.black);
					c.println("You take a break. The door locks and you suffocate.");
					c.println(); //for spacing

					// END**********************************
				}

				//find a weapon
				else {

					//Easier way:
					c.println("You got the " + weapons[acquiredWeapon]);

					// Ding sound
					try {
						ding = AudioSystem.getClip(); //create the clip object
						ding.open(AudioSystem.getAudioInputStream(new File("Audio/ding.wav"))); //open the given file for the clip

						ding.start();

					} catch (Exception e) {
						e.printStackTrace();
					}

					if (acquiredWeapon == 0) {
						//Output the image of the acquired weapon
						try {
							rope = ImageIO.read(new File("Images/Rope.png"));
						} catch (IOException e) {
							e.printStackTrace();
						}
						c.drawImage(rope, 25, 30, 600, 450, null);
					}

					else if (acquiredWeapon == 1) {
						try {
							gun = ImageIO.read(new File("Images/Gun.png"));
						} catch (IOException e) {
							e.printStackTrace();
						}
						c.drawImage(gun, 20, 40, 575, 300, null);
					}

					else {
						try {
							axe = ImageIO.read(new File("Images/Axe.png"));
						} catch (IOException e) {
							e.printStackTrace();
						}
						c.drawImage(axe, 60, 40, 500, 450, null);
					}

					// Takes a rest to let player know what item they acquired
					try {
						Thread.sleep(2500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					c.clear();

					// Random Number Generator
					int randomPersonNumber = 0;
					randomPersonNumber = (int)(Math.random() * 2);

					// Meet the co-captain
					if (randomPersonNumber == 0) {

						// Co-captain image
						try {
							coCaptain = ImageIO.read(new File("Images/Captain.jpg"));
						} catch (IOException e) {
							e.printStackTrace();
						}
						c.drawImage(coCaptain, 20, -10, 600, 800, null);

						c.println("You meet the co-captain. You don't know whether to trust him." + "\n" + "You decide you want to");
						c.println("(a): Attack him");
						c.println("(b): Help him");
						c.println(); //for spacing

						userInput = c.getChar();

						c.clear(); // clears screen

						//Ensures they put in either a or b
						while (userInput != 'a' && userInput != 'b') {

							c.clear(); // clears screen

							// Co-captain image
							c.drawImage(coCaptain, 20, -10, 600, 800, null);

							c.println("You must choose either 'a' or 'b'");

							c.println();
							c.println("You meet the co-captain. You don't know whether to trust him." + "\n" + "You eventually decide to");
							c.println("(a): Attack him");
							c.println("(b): Help him");

							c.println(); //for spacing
							userInput = c.getChar();

							c.clear(); // clears screen
						}

						//Attack the CC
						if (userInput == 'a') {

							//weapon is rope
							if (acquiredWeapon == 0) {

								// Rope sound
								try {
									ropeStrangle = AudioSystem.getClip(); //create the clip object
									ropeStrangle.open(AudioSystem.getAudioInputStream(new File("Audio/RopeStrangle.wav"))); //open the given file for the clip

									ropeStrangle.start();
									//stab.stop();
								} catch (Exception e) {
									e.printStackTrace();
								}

								// Outputs arrested image
								try {
									arrested = ImageIO.read(new File("Images/Arrested.jpg"));
								} catch (IOException e) {
									e.printStackTrace();
								}
								c.drawImage(arrested, 0, 0, 750, 450, null);

								c.setTextBackgroundColor(Color.BLACK);
								c.setTextColor(Color.white); 
								c.setBackground(Color.black);
								c.println("You attack him with a rope. He manages to free himeself"
										+ " and, feeling threatened," + "\n" + "he subdues you and handcuffs you to the desk.");
								c.println("When he finally gets everyone out, you are arrested and blamed for the murder.");
								c.println(); // For spacing
								// END**********************************

							}
							// weapon is revolver
							else if (acquiredWeapon == 1){
								// Random amount of bullets
								int randomBullets = (int)(Math.random() * 2);

								//If there are no bullets
								if (randomBullets == 0) {

									// Outputs arrested image
									try {
										arrested = ImageIO.read(new File("Images/Arrested.jpg"));
									} catch (IOException e) {
										e.printStackTrace();
									}
									c.drawImage(arrested, 0, 0, 750, 450, null);

									// Empty gun shot sound
									try {
										emptyGunshot = AudioSystem.getClip(); //create the clip object
										emptyGunshot.open(AudioSystem.getAudioInputStream(new File("Audio/EmptyGun.wav"))); //open the given file for the clip

										emptyGunshot.start();
									} catch (Exception e) {
										e.printStackTrace();
									}

									c.setTextBackgroundColor(Color.BLACK);
									c.setTextColor(Color.white); 
									c.setBackground(Color.black);
									c.println("You shoot, but nothing comes out of the barrel. The co-captain"
											+ " feels threatened and attacks you while you are distracted. You eventually get arrested and" + "\n" + "charged for the"
											+ " murder of the captain.");
									c.println(); //for spacing
									//END**********************************
								}

								//If there is a bullet
								else {

									// Gun shot sound
									try {
										gunshot = AudioSystem.getClip(); //create the clip object
										gunshot.open(AudioSystem.getAudioInputStream(new File("Audio/Gunshot.wav"))); //open the given file for the clip

										gunshot.start();
										//stab.stop();
									} catch (Exception e) {
										e.printStackTrace();
									}

									// Outputs sunken submarine image
									try {
										sunkenSub = ImageIO.read(new File("Images/SunkenSub.jpg"));
									} catch (IOException e) {
										e.printStackTrace();
									}
									c.drawImage(sunkenSub, -20, 0, 750, 700, null);

									c.setTextBackgroundColor(Color.BLACK);
									c.setTextColor(Color.white); 
									c.setBackground(Color.black);
									c.println("You try to aim for his leg, but without proper training, you "
											+ "accidentally shoot him in the chest, and he dies. You have killed"
											+ " your only way out. You try to get yourself out but you run out "
											+ "of oxygen and die.");
									c.println(); //for spacing
									// END**********************************
								}
							}
							// weapon is axe
							else {

								// Axe bashing sound
								try {
									whack = AudioSystem.getClip(); //create the clip object
									whack.open(AudioSystem.getAudioInputStream(new File("Audio/Whack.wav"))); //open the given file for the clip

									whack.start();
									//stab.stop();
								} catch (Exception e) {
									e.printStackTrace();
								}

								// Outputs sunken submarine image
								try {
									sunkenSub = ImageIO.read(new File("Images/SunkenSub.jpg"));
								} catch (IOException e) {
									e.printStackTrace();
								}
								c.drawImage(sunkenSub, -20, 0, 750, 700, null);

								c.setTextBackgroundColor(Color.BLACK);
								c.setTextColor(Color.white); 
								c.setBackground(Color.black);
								c.println("You attack the captain. Not meaning to kill him, you aim for"
										+ " his back, but he" + "\n" + "ducks and you bash his head. You have "
										+ "killed your only way out. Struggling with the controls yourself, "
										+ "you eventually run out of oxygen and die.");

								c.println(); //for spacing
								// END**********************************
							}
						}

						//Help the captain
						else {


							// Image of control room
							try {
								controlRoom = ImageIO.read(new File("Images/ControlRoom.jpg"));
							} catch (IOException e) {
								e.printStackTrace();
							}

							c.drawImage(controlRoom, 0, 0, 750, 700, null);

							c.setTextBackgroundColor(Color.BLACK);
							c.setTextColor(Color.white); 
							c.setBackground(Color.black);
							c.println("You help the captain. You both work together to fix the wiring and reboot" + "\n" +  "the sub. The friend gets arrested for murder.");

							c.println(); //spacing

							// computer sound
							try {
								computer = AudioSystem.getClip(); //create the clip object
								computer.open(AudioSystem.getAudioInputStream(new File("Audio/Computer.wav"))); //open the given file for the clip

								computer.start();
								Thread.sleep(2000);
								computer.stop();
							} catch (Exception e) {
								e.printStackTrace();
							}

							// END**********************************
						}
					}

					// Meet the "friend"
					else {

						// friend image
						try {
							friend = ImageIO.read(new File("Images/Friend.jpg"));
						} catch (IOException e) {
							e.printStackTrace();
						}

						c.drawImage(friend, 200, 90, 200, 500, null);

						c.println("You see the friend. You don't know whether to trust him. He doesn't see you, so you have the advantage. You decide"
								+ " you want to");
						c.println("(a): Attack him");
						c.println("(b): Help him");
						c.println(); //for spacing

						userInput = c.getChar();

						c.clear(); // clears screen

						//Ensures they put in either a or b
						while (userInput != 'a' && userInput != 'b') {

							c.clear(); // clears screen

							// Image of friend
							c.drawImage(friend, 200, 150, 200, 500, null);

							c.println("You must choose either 'a' or 'b'");

							c.println();
							c.println("You see the friend. You don't know whether to trust him. He doesn't see you, so you have the advantage. You decide"
									+ " you want to");
							c.println("(a): Attack him");
							c.println("(b): Help him");
							c.println(); //for spacing

							userInput = c.getChar();

							c.clear(); // clears screen
						}

						c.clear(); // clears screen

						// Attack the friend
						if(userInput == 'a') {

							String weaponAttack; 

							if (acquiredWeapon == 0) {
								weaponAttack = "strangle";

								// Rope sound
								try {
									ropeStrangle = AudioSystem.getClip(); //create the clip object
									ropeStrangle.open(AudioSystem.getAudioInputStream(new File("Audio/RopeStrangle.wav"))); //open the given file for the clip

									ropeStrangle.start();
									//stab.stop();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
							else if (acquiredWeapon == 1) {
								weaponAttack = "shoot";

								// Gun shot sound
								try {
									gunshot = AudioSystem.getClip(); //create the clip object
									gunshot.open(AudioSystem.getAudioInputStream(new File("Audio/Gunshot.wav"))); //open the given file for the clip

									gunshot.start();
									//stab.stop();
								} catch (Exception e) {
									e.printStackTrace();
								}

							}
							else {
								weaponAttack = "bash";
							}


							// ocean sound
							try {
								ocean = AudioSystem.getClip(); //create the clip object
								ocean.open(AudioSystem.getAudioInputStream(new File("Audio/Ocean.wav")));

							} catch (Exception e) {
								e.printStackTrace();
							}
							ocean.start();


							// Land on Horizon Image
							try {
								land = ImageIO.read(new File("Images/Land.jpg"));
							} catch (IOException e) {
								e.printStackTrace();
							}
							c.drawImage(land, 0, 0, 800, 800, null);

							try {
								Thread.sleep(2500);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
							ocean.stop();

							c.setTextBackgroundColor(Color.BLACK);
							c.setTextColor(Color.white); 
							c.setBackground(Color.black);
							c.println("You sneak up on him and " + weaponAttack + " him with the " + weapons[acquiredWeapon] + ".");
							c.println("He gets knocked out and you handcuff him to prevent him"
									+ " from doing anything" + "\n" + "else. You find the murder weapon on him, and you go find the co-captain." + "\n" + "Knowing he is innocent,"
									+ " you work together to get help. You are saved.");

							c.println(); // for spacing

							// END**********************************
						}
						// Help the friend
						else {

							// Rope sound
							try {
								ropeStrangle = AudioSystem.getClip(); //create the clip object
								ropeStrangle.open(AudioSystem.getAudioInputStream(new File("Audio/RopeStrangle.wav"))); //open the given file for the clip

								ropeStrangle.start();
								//stab.stop();
							} catch (Exception e) {
								e.printStackTrace();
							}

							// Outputs arrested image
							try {
								arrested = ImageIO.read(new File("Images/Arrested.jpg"));
							} catch (IOException e) {
								e.printStackTrace();
							}
							c.drawImage(arrested, 0, 0, 750, 450, null);

							c.setTextBackgroundColor(Color.BLACK);
							c.setTextColor(Color.white); 
							c.setBackground(Color.black);
							c.println("He attacks you and ties you up. "
									+ "He blames you for the murder, even though you" + "\n" + "didn't do anything. You get arrested and you never get to clear your name.");

							c.println(); // for spacing

							// END**********************************
						}
					}
				}
			}

			else {

				// Decision (loop) declaration
				char finalAnswer;

				// Decision loop
				do {
					finalAnswer = 0;

					//Hallway
					try {
						hallway = ImageIO.read(new File("Images/Hallway.jpg"));
					} catch (IOException e) {
						e.printStackTrace();
					}

					c.drawImage(hallway, 0, 80, 850, 600, null);


					// Decision
					c.println("You decide to go find help. You head towards the main hallway. You go to");
					c.println("(a) The lounge");
					c.println("(b) The bedroom");

					c.println(); //for spacing

					userInput = c.getChar();

					c.clear(); // clears screen


					//Ensures they put in either a or b
					while (userInput != 'a' && userInput != 'b') {

						c.clear(); // clears screen

						c.drawImage(hallway, 0, 80, 850, 600, null);

						c.println("You must choose either 'a' or 'b'");

						c.println();
						c.println("You decide to go find help. You head towards the main hallway."
								+ " You go to");
						c.println("(a) The lounge");
						c.println("(b) The bedroom");
						c.println(); //for spacing
						userInput = c.getChar();

						c.clear(); // clears screen

					}

					//You go to lounge

					if (userInput == 'a') {

						// Image of lounge - add human silhouette?
						try {
							lounge = ImageIO.read(new File("Images/Lounge.jpg"));
						} catch (IOException e) {
							e.printStackTrace();
						}

						c.drawImage(lounge, 0, 100, 720, 500, null);

						c.println("You find the friend in the lounge. You don't know why he's there." + "\n" + "You are going to");
						c.println("(a) Trust him");
						c.println("(b) Go back to the hallway");

						c.println(); // Aesthetics - for spacing
						finalAnswer = c.getChar();

						c.clear(); // clears screen

						//Ensures they put in either a or b
						while (finalAnswer != 'a' && finalAnswer != 'b') {

							c.clear(); // clears screen

							c.drawImage(lounge, 0, 100, 720, 500, null);

							c.println("You must choose either 'a' or 'b'");
							c.println();

							c.println("You find the friend in the lounge. You don't know why he's there." + "\n" + "You are going to");
							c.println("(a) Trust him");
							c.println("(b) Go back to the hallway");
							c.println(); //for spacing
							finalAnswer = c.getChar();

							c.clear(); // clears screen

						}

					}

					// go to bedroom
					else {

						// Image of bedroom - add human silhouette?
						try {
							bedroom = ImageIO.read(new File("Images/Bedroom.jpg"));
						} catch (IOException e) {
							e.printStackTrace();
						}

						c.drawImage(bedroom, 0, 100, 925, 500, null);

						c.println("You find the co-captain in the bedroom. You don't know why he's there." + "\n" + "You are going to");
						c.println("(a) Trust him");
						c.println("(b) Go back to the hallway");

						c.println(); // for spacing + neatness

						finalAnswer = c.getChar();

						c.clear();

						while (finalAnswer != 'a' && finalAnswer != 'b') {

							c.clear(); // clears screen

							// Image of bedroom - add human silhouette?
							try {
								bedroom = ImageIO.read(new File("Images/Bedroom.jpg"));
							} catch (IOException e) {
								e.printStackTrace();
							}

							c.drawImage(bedroom, 0, 100, 925, 500, null);

							c.println("You must choose either 'a' or 'b'");

							c.println();
							c.println("You find the co-captain in the bedroom. You don't know why he's there." + "\n" + "You are going to");
							c.println("(a) Trust him");
							c.println("(b) Go back to the hallway");
							c.println(); //for spacing
							finalAnswer = c.getChar();

							c.clear(); // clears screen

						}

						c.clear(); // clears screen
					}

				} while (finalAnswer != 'a');

				//the lounge
				if (userInput == 'a') {

					// Image of lounge - add human silhouette?
					try {
						lounge = ImageIO.read(new File("Images/Lounge.jpg"));
					} catch (IOException e) {
						e.printStackTrace();
					}

					c.drawImage(lounge, 0, 100, 720, 500, null);

					c.println("You trusted the friend. They tell you that they need to go "
							+ "to the control room. He offers you to go first. You");
					c.println("(a) Accept and go first");
					c.println("(b) Tell him to go first");
					c.println();

					userInput = c.getChar();

					c.clear(); // clears screen

					//ensures they input a or b
					while (userInput != 'a' && userInput != 'b') {

						c.clear(); // clears screen

						c.drawImage(lounge, 0, 100, 720, 500, null);

						c.println("You must choose either 'a' or 'b'");
						c.println();
						c.println("You trusted the friend. They tell you that they need to go to the control room. He offers you to go first. You");
						c.println("(a) Accept and go first");
						c.println("(b) Tell him to go first");

						c.println(); //for spacing
						userInput = c.getChar();

						c.clear(); // clears screen

					}

					//You go first
					if (userInput == 'a') {

						// Image stabbing
						try {
							stabbedDead = ImageIO.read(new File("Images/Stabbed.jpg"));
						} catch (IOException e) {
							e.printStackTrace();
						}

						c.drawImage(stabbedDead, 0, 0, 650, 650, null);

						c.setTextBackgroundColor(Color.BLACK);
						c.setTextColor(Color.white); 
						c.setBackground(Color.black);
						c.println("He stabs you and you bleed to death. The fate of everyone else on the ship is unknown.");
						c.println(); // for spacing

						//stabbing sound
						try {
							stab = AudioSystem.getClip(); //create the clip object
							stab.open(AudioSystem.getAudioInputStream(new File("Audio/Stab.wav"))); //open the given file for the clip

							stab.start();
							//stab.stop();
						} catch (Exception e) {
							e.printStackTrace();
						}
						// END**********************************

					}

					//you go second
					else {

						// Image subtle blood stain
						try {
							bloodStain = ImageIO.read(new File("Images/BloodStain.jpg"));
						} catch (IOException e) {
							e.printStackTrace();
						}

						c.drawImage(bloodStain, 0, 0, 700, 600, null);

						c.println("You say you'd feel more comfortable if you walked behind. "
								+ "He accepts. You notice something stained his shirt. You");

						c.println("(a) Ask him about it");
						c.println("(b) Try to get away");
						c.println(); // for spacing

						userInput = c.getChar();

						c.clear(); // clears screen

						while (userInput != 'a' && userInput != 'b') {

							c.clear(); // clears screen

							// Blood Stain image
							c.drawImage(bloodStain, 0, 0, 700, 600, null);

							c.println("You must choose either 'a' or 'b'");
							c.println(); // spacing
							c.println("You say you'd feel more comfortable if you walked behind. "
									+ "he accepts. You notice something stained his shirt. You");
							c.println("(a) Ask him about it");
							c.println("(b) Try to get away");

							c.println(); //for spacing
							userInput = c.getChar();

							c.clear(); // clears screen
						}

						// Asked him
						if (userInput == 'a') {

							// Image stabbing
							try {
								stabbedDead = ImageIO.read(new File("Images/Stabbed.jpg"));
							} catch (IOException e) {
								e.printStackTrace();
							}

							c.drawImage(stabbedDead, 0, 0, 650, 650, null);

							c.setTextBackgroundColor(Color.BLACK);
							c.setTextColor(Color.white); 
							c.setBackground(Color.black);
							c.println("Your questioning threatens him. You don't notice him pulling out his"
									+ " dagger and he stabs you. You bleed to death.");
							c.println(); // for spacing

							//stabbing sound
							try {
								stab = AudioSystem.getClip(); //create the clip object
								stab.open(AudioSystem.getAudioInputStream(new File("Audio/Stab.wav"))); //open the given file for the clip

								stab.start();
								//stab.stop();
							} catch (Exception e) {
								e.printStackTrace();
							}
							// END**********************************

						}
						else {

							// Image of friend walking away
							try {
								friendWalking = ImageIO.read(new File("Images/FriendWalkingAway.jpg"));
							} catch (IOException e) {
								e.printStackTrace();
							}

							c.drawImage(friendWalking, 0, 30, 850, 575, null);

							c.println("You need to get away. You decide that you are going to");
							c.println("(a) Try to outrun him");
							c.println("(b) Sneak away and hope he doesn't notice");
							c.println();

							userInput = c.getChar();

							c.clear(); // clears screen

							while (userInput != 'a' && userInput != 'b') {

								c.clear(); // clears screen

								c.drawImage(friendWalking, 0, 40, 850, 575, null);

								c.println("You must choose either 'a' or 'b'");
								c.println();
								c.println("You need to get away. You decide that you are going to");
								c.println("(a) Try to outrun him");
								c.println("(b) Sneak away and hope he doesn't notice");

								c.println(); //for spacing
								userInput = c.getChar();

								c.clear(); // clears screen

							}

							//Run and notices
							if (userInput == 'a') {

								// Held Hostage Image
								try {
									hostage = ImageIO.read(new File("Images/Hostage.jpg"));
								} catch (IOException e) {
									e.printStackTrace();
								}

								c.drawImage(hostage, 0, 0, 700, 600, null);

								c.setTextBackgroundColor(Color.BLACK);
								c.setTextColor(Color.white); 
								c.setBackground(Color.black);
								c.println("He notices you and chases after. He gets to you, ties you up. You lose.");

								c.println(); // for spacing

								// END**********************************
							}

							// Sneak away
							else {

								// boat destiny image
								try {
									boatOrLand = ImageIO.read(new File("Images/BoatOrLand.jpg"));
								} catch (IOException e) {
									e.printStackTrace();
								}

								c.drawImage(boatOrLand, 0, 10, 700, 550, null);

								// Surfacing water
								try {
									surfacingWater = AudioSystem.getClip(); //create the clip object
									surfacingWater.open(AudioSystem.getAudioInputStream(new File("Audio/SurfacingWater.wav")));

									surfacingWater.start();
								} catch (Exception e) {
									e.printStackTrace();
								}

								c.println("You find scuba-gear and you leave the submarine. On the surface of the water,"
										+ "\n" + "you see an island and a boat. You don't know if the boat is going towards or"
										+ "\n" + "away from you. You will");
								c.println("(a) Swim to the island");
								c.println("(b) Risk going to the boat");
								c.println(); // spacing

								userInput = c.getChar();

								c.clear(); // clears screen

								while (userInput != 'a' && userInput != 'b') {

									c.clear(); // clears screen

									c.drawImage(boatOrLand, 0, 30, 700, 550, null);

									c.println("You must choose either 'a' or 'b'");

									c.println();
									c.println("You find scuba-gear and you leave the submarine. On the surface of the water,"
											+ "\n" + "you see an island and a boat. You don't know if the boat is going towards or"
											+ "\n" + "away from you. You will");
									c.println("(a) Swim to the island");
									c.println("(b) Risk going to the boat");

									c.println(); //for spacing
									userInput = c.getChar();

									c.clear(); // clears screen

								}

								//Swim to island
								if (userInput == 'a') {

									//Island Image
									try {
										land = ImageIO.read(new File("Images/Land.jpg"));
									} catch (IOException e) {
										e.printStackTrace();
									}

									c.drawImage(land, 0, 0, 800, 600, null);

									// ocean sound
									try {
										ocean = AudioSystem.getClip(); //create the clip object
										ocean.open(AudioSystem.getAudioInputStream(new File("Audio/Ocean.wav")));

									} catch (Exception e) {
										e.printStackTrace();
									}

									c.setTextBackgroundColor(Color.BLACK);
									c.setTextColor(Color.white); 
									c.setBackground(Color.black);
									c.println("You are safe, but you are stranded on the island.");

									c.println(); // for spacing

									// END**********************************
								}

								else {
									int randomBoatDestiny = (int)(Math.random() * 2);

									if (randomBoatDestiny == 0) {

										// Boat sound
										try {
											foghorn = AudioSystem.getClip(); //create the clip object
											foghorn.open(AudioSystem.getAudioInputStream(new File("Audio/Foghorn.wav"))); //open the given file for the clip

											foghorn.start();
											//stab.stop();
										} catch (Exception e) {
											e.printStackTrace();
										}

										// Boat image
										try {
											boat = ImageIO.read(new File("Images/Ship.jpg"));
										} catch (IOException e) {
											e.printStackTrace();
										}

										c.drawImage(boat, 0, 20, 700, 550, null);

										c.setTextBackgroundColor(Color.BLACK);
										c.setTextColor(Color.white);
										c.setBackground(Color.black);
										c.println("The boat heads in your direction and you are"
												+ " saved and brought back to Malta.");

										c.println(); // for spacing

										// END**********************************
									}
									else {
										// Image of island
										try {
											land = ImageIO.read(new File("Images/Land.jpg"));
										} catch (IOException e) {
											e.printStackTrace();
										}
										c.drawImage(land, 0, 0, 800, 600, null);

										c.setTextBackgroundColor(Color.BLACK);
										c.setTextColor(Color.white); 
										c.setBackground(Color.black);
										c.println("The boat was heading away from you. You get lost and are stranded out at sea. You swim back to the island with nothing to help you.");

										c.println(); // for spacing

										// END**********************************
									}
								}
							}
						}
					}
				}

				// The bedroom
				else {

					// Image of bedroom
					try {
						bedroom = ImageIO.read(new File("Images/Bedroom.jpg"));
					} catch (IOException e) {
						e.printStackTrace();
					}

					c.drawImage(bedroom, 0, 50, 925, 500, null);

					c.println("Alongside the co-captain, you want to");
					c.println("(a) Go to the control room");
					c.println("(b) Sleuth in the bedroom");

					c.println(); // for spacing

					userInput = c.getChar();

					c.clear(); // clears screen

					while (userInput != 'a' && userInput != 'b') {

						c.clear(); // clears screen

						// Image of bedroom
						try {
							bedroom = ImageIO.read(new File("Images/Bedroom.jpg"));
						} catch (IOException e) {
							e.printStackTrace();
						}

						c.drawImage(bedroom, 0, 100, 925, 500, null);

						c.println("You must choose either 'a' or 'b'");

						c.println();
						c.println("Alongside the co-captain, you want to");
						c.println("(a) Go to the control room");
						c.println("(b) Sleuth in the bedroom");

						c.println(); //for spacing
						userInput = c.getChar();

						c.clear(); // clears screen

					}

					//With the loop
					if (userInput == 'a') {

						int [] passcode = {12, 21, 23, 32};
						int passcodeArrayNumber = (int)(Math.random()*4);

						int password = 1200 + passcode[passcodeArrayNumber];

						// Pass code lock image
						try {
							passcodeLock = ImageIO.read(new File("Images/Passcode.jpg"));
						} catch (IOException e) {
							e.printStackTrace();
						}
						c.drawImage(passcodeLock, 0, 50, 700, 700, null);


						c.println("You go to the control room and find the pass lock." + "\n" + "You know the first 2 digits are 1 and 2, "
								+ "but you don't know the last 2;" + "\n" + "you have to guess.");
						c.println("The captain can't remember if it is 12, 21, 23, or 32," + "\n" + "but he knows one of them is right.");

						c.println();

						c.println("Enter in the 4 digits, you have 2 chances.");

						c.println(); // for spacing

						//password loop
						int passcodeEntered = 0;
						int counter;
						int reset = 0;
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

									reset = reset + 1;
									if (reset > 3) {
										c.clear();
										c.println("You go to the control room and find the pass lock." + "\n" + "You know the first 2 digits are 1 and 2, "
												+ "but you don't know the last 2;" + "\n" + "you have to guess.");
										c.println("The captain can't remember if it is 12, 21, 23, or 32," + "\n" + "but he knows one of them is right.");

										c.println();

										c.println("Enter in the 4 digits, you have 2 chances.");

										reset = 0;
									}
								}
							} while(flag);

							if (passcodeEntered == password) {
								counter = 0;

								c.clear();

								// ocean sound
								try {
									ocean = AudioSystem.getClip(); //create the clip object
									ocean.open(AudioSystem.getAudioInputStream(new File("Audio/Ocean.wav")));

								} catch (Exception e) {
									e.printStackTrace();
								}

								// Land on Horizon Image
								try {
									land2 = ImageIO.read(new File("Images/Land2.jpg"));
								} catch (IOException e) {
									e.printStackTrace();
								}
								c.drawImage(land2, -40, 0, 900, 700, null);

								c.setTextBackgroundColor(Color.BLACK);
								c.setTextColor(Color.white); 
								c.setBackground(Color.black);
								c.println("The co-captain takes control of the submarine and you both "
										+ "escape to safety.");

								// Actual sound
								ocean.start();
								try {
									Thread.sleep(2000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								ocean.stop();

								c.println(); // for spacing

								// END**********************************
							}

							else {
								c.println(); // for spacing - unneeded?
								if (counter == 0) { 
									c.setTextBackgroundColor(Color.BLACK);
									c.setTextColor(Color.white); 
									c.setBackground(Color.black);
									c.println("That is incorrect. You have exceeded your maximum entries. You are locked into" + "\n" + "the control room for an hour. The friend sneaks up on you as you spent"
											+ " all your time on the passcode.");
									c.println("He subdues you and you keeps you hostage; you never make it out.");
									c.println();
									// END**********************************
								}
								else{
									c.println("The passcode you entered was incorrect.");
									c.println("You have " + counter + " chance left.");
									c.println(); // for spacing
								}
							}
						}
					}

					// Search around

					else {

						// Image of notebook
						try {
							notebook = ImageIO.read(new File("Images/Notebook.jpg"));
						} catch (IOException e) {
							e.printStackTrace();
						}
						c.drawImage(notebook, 0, 0, 800, 800, null);

						// shuffling sound
						try {
							shuffling = AudioSystem.getClip(); //create the clip object
							shuffling.open(AudioSystem.getAudioInputStream(new File("Audio/Shuffling.wav"))); //open the given file for the clip

							shuffling.start();
						} catch (Exception e) {
							e.printStackTrace();
						}

						c.println("You search around for clues. You find the captain's notebook which contains the passcode."
								+ " Both you and the captain run to the control room and open the lock." + "\n" + "You should");
						c.println("(a) Lock the door just in case"); 
						c.println("(b) Not waste any time and leave it");
						c.println(); // spacing

						userInput = c.getChar();

						c.clear(); // clears screen

						while (userInput != 'a' && userInput != 'b') {

							c.clear(); // clears screen

							// Image of notebook
							try {
								notebook = ImageIO.read(new File("Images/Notebook.jpg"));
							} catch (IOException e) {
								e.printStackTrace();
							}
							c.drawImage(notebook, 0, 0, 800, 800, null);

							c.println("You must choose either 'a' or 'b'");

							c.println();
							c.println("You search around for clues. You find the captain's notebook which contains the passcode."
									+ " Both you and the captain run to the control room and open the lock." + "\n" + "You should");
							c.println("(a) Lock the door just in case"); 
							c.println("(b) Not waste any time and leave it");
							c.println(); //for spacing

							userInput = c.getChar();

							c.clear(); // clears screen

						}

						// Lock the door
						if (userInput == 'a') {

							// Malta docks Image
							try {
								docks = ImageIO.read(new File("Images/Docks.jpg"));
							} catch (IOException e) {
								e.printStackTrace();
							}
							c.drawImage(docks, -40, 0, 950, 750, null);

							c.setTextBackgroundColor(Color.BLACK);
							c.setTextColor(Color.white); 
							c.setBackground(Color.BLACK);

							c.println("You lock the door, just to be sure. You hear a loud, threatening bang, but you"
									+ "\n" + "ignore it to work on the task at hand. You both work together and get to safety.");
							c.println(); // for spacing

							// fog horn sound
							try {
								foghorn = AudioSystem.getClip(); //create the clip object
								foghorn.open(AudioSystem.getAudioInputStream(new File("Audio/Foghorn.wav"))); //open the given file for the clip

								foghorn.start();
							} catch (Exception e) {
								e.printStackTrace();
							}
							// END**********************************
						}

						// Leave the lock
						else {

							// Holding hostage
							try {
								extraRoom = ImageIO.read(new File("Images/ExtraRoom.jpg"));
							} catch (IOException e) {
								e.printStackTrace();
							}
							c.drawImage(extraRoom, 0, 80, 800, 500, null);

							c.setTextBackgroundColor(Color.BLACK);
							c.setTextColor(Color.white); 
							c.setBackground(Color.black);
							c.println("You leave it unlocked. You both work together to get out. Halfway through" + "\n" + "someone barges into the room with a knife. It is the friend; he is holding you "
									+ "\n" + "hostage. You never make it out.");

							c.println(); // for spacing

							// END**********************************
						}
					}
				}
			} 

			// Gets input - play again?
			c.println("Would you like to play again? (y/n)");
			c.println(); // for spacing

			playAgain = c.getChar();

			while (playAgain != 'n' && playAgain != 'y') {

				c.clear();

				c.println("You must choose either 'y' or 'n'");

				c.println();
				c.println("Would you like to play again?");

				c.println(); //for spacing
				playAgain = c.getChar();

				c.clear(); // clears screen

			}
			c.clear(); // clears screen before ending

			// stops background music
			eerieBackgroundMusic.stop();

		} while (playAgain != 'n');

		// The End image
		try {
			theEnd = ImageIO.read(new File("Images/TheEnd.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		c.drawImage(theEnd, 0, 50, 650, 450, null);

		c.println("The game has ended.");
		c.println("Thank you for playing. The game will automatically close.");

		// Takes a small rest before automatic close
		try {
			Thread.sleep(4500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		c.close(); //closes entire program

	}
}