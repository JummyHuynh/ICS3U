package huynh;

import java.util.Scanner;


/** 
 * TakeANumber.java
 * Inputs and calculates the serves, lates per day
 * April 11th, 2017
 * @author Jimmy, Mensimah, Elizabeth, Ethan
 */
public class TakeANumber {

	public static void main(String[] args) {

		//String terminate = null;
		Scanner scan = new Scanner(System.in);

		String userInput;
		int lateSlipCounter = 1;
		int dailyLateCounter = 0;
		int serveCounter = 0;

		System.out.println("Please enter in take, serve, or close");

		do {

			userInput = scan.nextLine();
			if (userInput.equalsIgnoreCase("TAKE")) {
				dailyLateCounter = dailyLateCounter + 1; 
				lateSlipCounter = lateSlipCounter + 1;
			}
			else if (userInput.equalsIgnoreCase("SERVE")) {
				serveCounter = serveCounter + 1;
			}
			else if (userInput.equalsIgnoreCase("CLOSE")) {
				System.out.print(dailyLateCounter + " ");
				System.out.print(dailyLateCounter - serveCounter + " ");
				System.out.println(lateSlipCounter);

				dailyLateCounter = 0;
				serveCounter = 0;
			}
			else {
				System.out.println("That is not a valid answer");
			}
			
			if (lateSlipCounter > 999) {
				lateSlipCounter = 1;  
			}
			
		} while (!userInput.equalsIgnoreCase("EOF"));

		//System.out.println("The program has finished");
	}
}
