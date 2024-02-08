package javaBasics;

/*
 * Count and print the number of uppercase letters, lowercase letters, digits, and special characters (non-alphanumeric) present in the char array.

Input :
  char[] arr = {'H', 'e', 'l', 'l', 'o', '1', ' ', 'W', 'o', 'r', 'l', 'd', '!', '@', '#'}

Output :

Uppercase Letters: 2
Lowercase Letters: 9
Digits: 1
Special Characters: 3
 * 
 */

public class Assignment12 {

	public static void main(String[] args) {

		char[] arr = { 'H', 'e', 'l', 'l', 'o', '1', ' ', 'W', 'o', 'r', 'l', 'd', '!', '@', '#' };

		int Ucount = 0;
		int Lcount = 0;
		int Dcount = 0;
		int Scount = 0;
		int SPcount = 0;

		for (int i = 0; i < arr.length; i++) {

			// char uCase = arr[i];

			// System.out.println(uCase);

			if (Character.isUpperCase(arr[i])) {

				Ucount = Ucount + 1;

			}

			if (Character.isLowerCase(arr[i])) {

				Lcount = Lcount + 1;
			}

			if (Character.isDigit(arr[i])) {

				Dcount = Dcount + 1;
			}

			if (Character.isWhitespace(arr[i])) {

				Scount = Scount + 1;
			}

			SPcount = arr.length - Ucount - Lcount - Dcount - Scount;

		}

		System.out.println("Total number of uppercase letters: " + Ucount);
		System.out.println("Total number of lowercase letters: " + Lcount);
		System.out.println("Total number of digits: " + Dcount);
		System.out.println("Total number of spaces: " + Scount);
		System.out.println("Total number of special chars: " + SPcount);
	}

}
