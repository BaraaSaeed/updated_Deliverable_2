
/*
 * Unit 1 Lab - Deliverable 2
 * @Author: Baraa S. Ali
 */

import java.util.Scanner;

//class dataConversion {

//}

public class Unicode {

	public static void main(String[] args) {

		/* Variables Definitions */
		String firstWord;
		String secondWord;
		int firstWordSum = 0, secondWordSum = 0;
		Scanner sc = new Scanner(System.in); /* open Scanner */

		/* Get the input */
		System.out.println("Please enter the 1st word:");
		firstWord = sc.nextLine();
		System.out.println("Please enter the 2nd word:");
		secondWord = sc.nextLine();
		sc.close(); /* close Scanner */

		firstWordSum = strToUinicode(firstWord);
		secondWordSum = strToUinicode(secondWord);

		/*
		 * Find the difference between the unicode of the two words, make sure it is
		 * printed as a positive number.
		 */
		if (secondWordSum > firstWordSum)
			System.out.println(secondWordSum - firstWordSum);
		else
			System.out.println(firstWordSum - secondWordSum);
	}

	/*
	 * This method will parse the passed string, get the Unicode of each character,
	 * and calculate and return the sum of the all unicodes.
	 */
	public static int strToUinicode(String str) {
		int UnicodeSum = 0;
		char letter = 0;

		for (int index = 0; index < str.length(); index++) {
			letter = str.charAt(index);
			UnicodeSum = UnicodeSum + (int) letter;
		}
		return UnicodeSum;
	}
}
