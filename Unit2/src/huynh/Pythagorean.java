package huynh;

import java.util.Scanner;

public class Pythagorean {

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		
		
		for (int number = 1; number > 100; number ++) {
			
			perfectSquare(number);
			
			
		}
		
		
		 

	}
	
	public static boolean perfectSquare (int n) {
		int x = (int) Math.sqrt(n);
		double check = Math.pow(x,2);
		
		if (check == n) 
			return true;
		
		return false;
	}

}
