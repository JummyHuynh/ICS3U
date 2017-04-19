package huynh;

import java.util.Scanner;

public class ReversedSentence {

	public static void main(String[] args) {

		// Declarations
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter in the sentence that will be reversed");
		String [] sentence = scan.nextLine().split(" ");
		
		for (int i = 0; i < sentence.length; i++) {
			for (int j = sentence[i].length()-1; j>=0; j--) {
				System.out.print(sentence[i].charAt(j));
				
				
				
				//String theSentence = changeCase.toUpperCase(sentence[i].charAt(j));
			}
			System.out.print(" ");
			
		}
		

	}

}
