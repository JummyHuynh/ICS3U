package huynh;

/**
 * 
 * Hello Console
 * Determines if someone is old or not
 * FEB.24.2017
 * @author Jimmy Huynh
 * 
 */

import hsa_new.Console;

public class HelloConsole {

	public static void main(String[] args) {
		Console c = new Console();
		c.println("Hello.");
		c.println("How old are you?");
		
		int age = c.readInt();
		
		if (age > 0 && age < 11) {
			c.println("You a youngling.");
		}
		else if (age >= 11 && age <=50) {
			c.println("You kinda old.");
		}
		else if (age > 50 && age <= 150) {
			c.println("You basically dead.");
		}
		else {
			c.println("That is impossible.");
		}
		
		c.drawStar(250, 20, 250, 220);
		c.drawMapleLeaf(250,250,250,250);
	
	}

}
