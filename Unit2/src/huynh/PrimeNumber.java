package huynh;

import java.util.Scanner;

/** PrimeNumber
 * Determines if the number inputed is a prime number
 * April 3rd, 2017
 * @author Jimmy Huynh
 */
public class PrimeNumber {

	public static void main(String[] args) {

		// Declarations
		Scanner scan = new Scanner(System.in);
		String playAgain;

		do {
			System.out.println("Please enter a digit, the program will determine if it is prime or not.");
			int primeNum = scan.nextInt();

			// calls method and states in system if prime or not
			if (isPrime(primeNum)) {
				System.out.println("It is prime\n");
			}
			else {
				System.out.println("It is not prime\n");
			}

			// Asks to play again
			System.out.println("Would you like to enter another number? (yes/no)");
			playAgain = scan.next();
			System.out.print("\n"); // for spacing/neatness

		} while (playAgain.equalsIgnoreCase("yes"));

		System.out.print("The program has ended.");

	}


	/**
	 * Determines if the number inputed is a prime number or not
	 * @param x the number that will be inputed
	 * @return whether the number is prime or not (true or false)
	 */
	public static boolean isPrime(int x) {
		if (x<1) {
			return false;
		}
		else {
			int prime = x;
			return isDivisible(prime, x);
		}

	}

	/**
	 * Finds out if a number can be divided by ano9ther number other than itself and one
	 * @param a the first number to be divided
	 * @param b the main number that remains constant
	 * @return true or false
	 */

	public static boolean isDivisible(int incrementedVariable, int originalValue) {

		for (int i = 2; i < (incrementedVariable-1); i++) {
			originalValue = incrementedVariable % i;

			if (originalValue == 0) {
				return false;
			}
		}
		return true;

	}

}