package huynh;

import java.util.Scanner;

/** Palindrome
 * Determines if the word inputed is a palindrome or not
 * @author Jimmy Huynh
 * April 16th, 2017
 */

public class Palindrome {

	public static void main(String[] args) {

		// Declarations
		Scanner scan = new Scanner(System.in);
		String palindrome;
		String playAgain;

		// Main code
		do {
			System.out.println("Please enter a word, this program will determine if the word is a palindrome or not");

			palindrome =  scan.nextLine();

			System.out.println(isPalindrome(palindrome)); // states if it is true or false

			System.out.println("Would you like to play again? (yes/no)");
			playAgain = scan.nextLine();

		} while (!playAgain.equalsIgnoreCase("no"));

		System.out.println("The game has ended");
	}

	/**
	 * Determines if the word is a palindrome or not
	 * @param x the string that is compared for palindrome
	 * @return true or false
	 */
	public static boolean isPalindrome (String x) {

		int length = x.length()-1; // keep it constant

		for (int i = 0; i < x.length()-1; i++) { 

			if (x.charAt(i) != x.charAt(length))
				return false;

			length--;
		}
		return true;
	}
}
