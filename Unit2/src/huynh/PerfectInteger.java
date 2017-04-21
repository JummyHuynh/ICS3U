package huynh;

import java.util.Scanner;

public class PerfectInteger {
 
	/**
	 * PerfectInteger.java
	 * Finds all the numbers that are perfect integers
	 * April 21, 2017
	 * @author Jimmy Huynh
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// Asks how many numbers they want (the range)
			System.out.println("How many numbers do you want (to find the perfect numbers)?");
			int numbers = scan.nextInt();

			if (numbers <= 0) {
				System.out.println("Please enter a number more than 0");
			}
			else {
				System.out.println("Here are the perfect numbers between 1 and " + numbers);

				for (int i = 1; i <= numbers; i++) {
					if (isPerfect(i)){           
						System.out.println(i);
					} 
				}    
			}
	}
	
	/**
	 * Finds the factors
	 * @param a the number that will be divided to find the factors
	 * @return true or false
	 */
	public static boolean isPerfect (int a) {
		
		int sum = 0;

		for (int j = 1; j < a; j++) {

			// Finds whether it can be divided (whole number factors)
			if (a%j == 0) {
				sum = sum + j; 
			}
		} 
		if (sum == a) {
				return true;
			}
			return false;
	}
}
