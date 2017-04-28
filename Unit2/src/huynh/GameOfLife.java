package huynh;

import java.util.Scanner;

/**
 * GameOfLife.java
 * A game where you can input creatures and see how many stay alive
 * April 27th, 2017
 * @author Jimmy Huynh
 *
 */
public class GameOfLife {

	public static void main(String[] args){

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String userInput = "";
		char[][] field = new char [20][20];
		boolean [][] change = new boolean [20][20]; // To allow for a constant array

		// Gives all places in the array the char 'o' or false in another array
		for(int i = 0; i < 20; i++){
			for(int n = 0; n < 20; n++){
				field[i][n] = 'o';
				change[i][n] = false;
			}
		} // End

		System.out.println("How many cells do you want?");
		int amount = scan.nextInt();

		for (int counter = 1; counter <= amount; counter++) {	

			System.out.println("Please enter the row and the column separated by a single space");

			int row = scan.nextInt()-1;
			int column = scan.nextInt()-1;

			field[row][column] = 'x'; // Replaces the chosen creatures in
			change[row][column] = true; // Mirrors the original array

		}

		// Prints out the values in the ORIGINAL array
		System.out.println("\nThis is the original");
		for(int i = 0; i < 20; i++){
			for(int n = 0; n < 20; n++){

				System.out.print(field[i][n] + " ");
			}
			System.out.println();
		} // End

		int generationNumber = 1;
		
		do {
			generationNumber++;
			int neighbour = 0;

			for(int i = 0; i <= 19; i++){
				for(int n = 0; n <= 19; n++){

					neighbour = 0;

					// above
					if (i > 0) {
						if (field[i-1][n] == 'x')
							neighbour++;
					}
					// up right
					if (i > 0 && n < 19) {
						if (field[i-1][n+1] == 'x')
							neighbour++;
					}
					// up left
					if (i > 0 && n > 0) {
						if (field[i-1][n-1] == 'x')
							neighbour++;
					}
					// left
					if (n > 0) {
						if (field[i][n-1] == 'x')
							neighbour++;
					}
					// right
					if (n < 19) {
						if (field[i][n+1] == 'x' )
							neighbour++;
					}
					// down left
					if (i < 19 && n > 0) {
						if (field[i+1][n-1] == 'x')
							neighbour++;
					}
					// down
					if (i < 19) {
						if (field[i+1][n] == 'x')
							neighbour++;
					}
					// down right
					if (i < 19 && n < 19) {
						if (field[i+1][n+1] == 'x')
							neighbour++;
					}

					// Compares neighbours and puts to boolean array to keep the original array constant
					if (field[i][n] == 'x') {

						if (neighbour == 2 || neighbour == 3)
							change[i][n] = true;
						else
							change[i][n] = false;
					}

					else if (field[i][n] == 'o') {

						if (neighbour == 3) 
							change[i][n] = true;
						else 
							change[i][n] = false;
					}
				}
			} // end of both for loops

			System.out.println("\nThis is generation " + generationNumber);

			// Prints out the values in the array
			for(int i = 0; i < 20; i++){
				for(int n = 0; n < 20; n++){

					if (change[i][n] == true) {
						field[i][n] = 'x'; // Puts all values that are true from change[][] to field[][]
						System.out.print(field[i][n] + " ");
					}
					else {
						field[i][n] = 'o';
						System.out.print(field[i][n] + " ");
					}
				}
				System.out.println();
			} // End of printing

			System.out.println("\nWould you like to create the next generation? (yes/no)");
			userInput = scan.next();

		} while (userInput.equalsIgnoreCase("yes"));

		System.out.println("\nThe program has ended");
	}
}