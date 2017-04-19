package huynh;

import java.util.Scanner;

public class OrphanBlack {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String userInput = scan.nextLine();
		String binary = "";
		String binary1 = "";
		String binaryFinal = "";



		for (int i = 0; i < userInput.length(); i++) {

			if (userInput.charAt(i) == 'a' || userInput.charAt(i) == 't' ) {
				//binary1 = "";
				binary = "0";

			}

			else if (userInput.charAt(i) == 'c' || userInput.charAt(i) == 'g' ) {
				//binary1="";
				binary = "1";

			}

			//binaryFinal = binary1 + binary;
			//binaryFinal = binary1 + binary;

			System.out.print(binary1);

		}

		System.out.println("");
		//System.out.println(charAtIndex(binary));
	}

	public static int charAtIndex (String a) {

		for(int i = 0; i < a.length(); i++) {
			//char c = a.charAt(i);

			if((a.charAt(i) == '0') && (a.charAt(i+1) == '1') && (a.charAt(i +2) == '0')) {
				return i;
			}

			Integer.parseInt(a);

		}
		return -1;
	}
}
