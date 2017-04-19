package huynh;

import java.util.Scanner;

/** Factorial
 * Finds the factorial of the inputed number
 * April 3rd, 2017
 * @author Jimmy Huynh
 */

public class Factorial {

	public static void main(String[] args) {

		// Declarations
		Scanner scan = new Scanner(System.in);
		String playAgain;

		do {
			System.out.println("Please enter the number and the program will calculate the factorial.");
			int input = scan.nextInt();

			// Ensures user inputs proper values
			if (input < 0) 
				System.out.println("Please enter positive numbers\n");
			else if (input > 16) 
				System.out.println("This program cannot compute the factorials for such large numbers\n");
			else
				System.out.println("The factorial is " + factorial(input) + "\n");

			// Asks to play again
			System.out.println("Would you like to enter another number? (yes/no)");
			playAgain = scan.next();
			System.out.print("\n"); // for spacing/neatness

		} while (playAgain.equals("yes"));
		System.out.print("The program has ended.");

	}

	/**
	 * Calculates the factorial
	 * @param x a number the user will input to be used in the calculations
	 * @return the factorial of the number inputed --
	 */
	public static int factorial(int x) {
		if (x == 0) {
			return 1;
		}
		else {

			int product = x;
			while (x > 1) {
				product = product * (x-1);
				x--;
			}
			return product;

		}
	}
}