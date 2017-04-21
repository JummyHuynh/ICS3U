package huynh;

import java.util.Scanner;

/** 
 * LargestInArray.java
 * Sees what number in the array is the largest
 * @author Jimmy Huynh
 * April 4th, 2017
 */


public class LargestInArray {

	public static void main(String[] args) {

		// Declarations
		Scanner scan = new Scanner(System.in);
		String playAgain;

		do {
			System.out.println("How many numbers do you want in the array?");
			int amountOfNumbers = scan.nextInt();

			// Main code
			if (amountOfNumbers < 1) 
				System.out.println("Please enter positive value numbers\n");
			else {
				System.out.println("Enter in the " + amountOfNumbers + " numbers one at a time");

				int[] numbers = new int [amountOfNumbers]; // creates an array with the amount of numbers the user wants

				for (int i = 0 ; i < numbers.length; i++ ) {
					numbers[i] = scan.nextInt(); // places the numbers in each slot of the array
				}

				// calls for the method and then prints the value returned
				System.out.println("The largest number in the array is " + largestNum(numbers) + "\n");
			}

			// Asks to play again
			System.out.println("Would you like to enter another number? (yes/no)");
			playAgain = scan.next();
			System.out.print("\n"); // for spacing/neatness

		} while (playAgain.equals("yes"));

		System.out.print("The program has ended.");

	}

	/**
	 * Finds the largest number in the array
	 * @param array the array will be searched through for the largest numbers
	 * @return the largest number
	 */
	public static int largestNum (int[] array) {
		int largestNumber = array [0];

		for (int i = 1; i < array.length; i++) { 

			// goes through each number one by one and compares to the largest number
			if (array [i] > largestNumber) { 
				largestNumber = array [i];
			}
		}
		return largestNumber;
	}
}

