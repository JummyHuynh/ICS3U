package huynh;

import java.util.Scanner;

/** Sum	
 * Finds the sum of the inputed number
 * April 3rd, 2017
 * @author Jimmy Huynh
 */
public class Sum {

	public static void main(String[] args) {

		// Declarations
		Scanner scan = new Scanner(System.in);
		String playAgain;

		// Main code
		do {
			System.out.println("Please enter a digit, the program will calculate the sum of all the digits in the number.");
			int digit = scan.nextInt();

			if (digit < 0)
				System.out.println("Please enter in positive numbers");
			else 
			System.out.println("The sum of the digits is " + sumOfDigits(digit) + "\n");

			// Asks to play again
			System.out.println("Would you like to enter another number? (yes/no)");
			playAgain = scan.next();
			System.out.print("\n"); // for spacing/neatness
			
			
		} while (playAgain.equalsIgnoreCase("yes"));

		System.out.println("The program has ended.");

	}


	/**
	 * Finds the sum of each digit from a given number
	 * @param x the number that will be split up to find the sum of all the digits
	 * @return total, the sum of all the numbers separated
	 */
	public static int sumOfDigits(int x) {
		int total = 0;
		while (x > 0) {
			total = total + x%10;
			x = x/10;
		}
		return total;
	}

}