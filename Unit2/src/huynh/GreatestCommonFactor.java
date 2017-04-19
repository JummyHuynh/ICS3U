package huynh;

import java.util.Scanner;

/** GreatestCommonFactor
 * Finds the greatest common factor of 2 numbers
 * April 3rd, 2017
 * @author Jimmy Huynh
 */
public class GreatestCommonFactor {

	public static void main(String[] args) {

		//Declarations
		Scanner scan = new Scanner(System.in);
		String playAgain;

		do {
			System.out.println("Please enter the 2 numbers (for the greatest common factor).");
			int input = scan.nextInt();
			int input2 = scan.nextInt();

			if (input <= 0 || input2 <= 0){
				System.out.println("That is an invalid answer. You cannot input 0 as one of the numbers nor any negative numbers \n");
			}
			else {
				System.out.println("The greatest common factor is " + gcf(input, input2) + "\n");
			}

			// Asks to play again
			System.out.println("Would you like to enter another number? (yes/no)");
			playAgain = scan.next();
			System.out.print("\n"); // for spacing/neatness

		}while (playAgain.equalsIgnoreCase("yes"));

		System.out.print("The program has ended.");

	}

	/**
	 * Finds the greatest common factor between 2 numbers
	 * @param a the first number to be compared to fine the gcf
	 * @param b the second number to be compared to find the gcf
	 * @return the greatest common factor
	 */

	public static int gcf(int a, int b) {

		int big = Math.max(a, b);
		int small = Math.min(a, b);
		int counter = small;

		while (isDivisible(big , counter) == false || isDivisible(small , counter) == false) {
			counter --;
		}
		return counter;
	}

	/**
	 * Determines if the number is divisible or not
	 * @param x the big or small value that will be used to divide the counter into
	 * @param y the counter that will be used to divide into
	 * @return true or false, whether it is divisible or not
	 */
	public static boolean isDivisible(int bigOrSmallValue, int counterVariable) {

		if (bigOrSmallValue % counterVariable == 0) {
			return true;
		}
		return false;
	}

}