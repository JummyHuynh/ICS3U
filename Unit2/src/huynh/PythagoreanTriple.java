package huynh;

/**
 * PythagoreanTriple.java
 * Finds all the pythagorean triples between 1 and 100
 * April 20, 2017
 * @author Jimmy Huynh
 */
public class PythagoreanTriple {

	public static void main(String[] args) {

		System.out.println("Here are the Pythagorean Triples");

		// Main code
		for (int numberA = 1; numberA < 100; numberA ++) {
			for (int numberB = 1; numberB < 100; numberB ++) {

				int numberC = (int) (Math.pow(numberA, 2) + Math.pow(numberB, 2));
				int rootC = (int) Math.sqrt(numberC);

				if (perfectSquare(numberC)) {
					if (Math.pow(numberA, 2) + (Math.pow(numberB, 2)) == (Math.pow(rootC, 2))) 
						System.out.println(numberA + " " + numberB + " " + rootC);
				}

			}
		}
	}


	/**
	 * Determines if c (in a^2 + b^2 = c^2) is a perfect square
	 * @param n
	 * @return true or false
	 */
	public static boolean perfectSquare (int n) {
		int x = (int) Math.sqrt(n);
		double check = Math.pow(x,2);

		if (check == n) 
			return true;

		return false;
	}

}
