package huynh;

import java.util.Scanner;

/** 
 * AmeriCanadian.java
 * Converts American spelling into Canadian spelling
 * April 11th, 2017
 * @author Jimmy, Mensimah, Elizabeth, Ethan
 */
public class AmeriCanadian {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String userInput;

		do {
			System.out.println("Please enter the word.");
			userInput= scan.nextLine();

			if (userInput.length() > 4 && userInput.length() < 65) {

				if(userInput.charAt(userInput.length()-2) == 'o' && userInput.charAt(userInput.length()-1) == 'r') {
					String output = userInput.replace("or", "our");
					System.out.println("The Canadian spelling is " + output);
				}
				
				else
					System.out.println("The Canadian spelling is " + userInput);
			}
			
			else 
				System.out.println("Please enter a word with more than 4 characters but less than 64.");

			System.out.println(""); // for spacing
			
		} while (!userInput.equals ("quit!"));
	}
}


