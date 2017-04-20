package huynh;

import java.util.Scanner;

public class ReversedSentence {

	public static void main(String[] args) {

		// Declaration
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter in the sentence that will be reversed");
		String [] sentence = scan.nextLine().split(" ");
		String[] newSentence = sentence[0].split("");

		for (int i = 0; i < sentence.length; i++) {
			for (int j = sentence[i].length()-1; j>=0; j--) {


				// Replaces first capital when needed
				if ((i == 0) && (j == sentence[i].length()-1) && (newSentence[0].equals(newSentence[0].toUpperCase()))) {
					System.out.print(newSentence[sentence[0].length()-1].toUpperCase());	
				}
				else if ((i == 0) && (j == 0) && (newSentence[sentence[0].length()-1]).equals(newSentence[sentence[0].length()-1].toLowerCase())) {
					System.out.print(newSentence[0].toLowerCase());
				}
				else
					System.out.print(sentence[i].charAt(j));

			}
			System.out.print(" ");

		}	
	}
}
