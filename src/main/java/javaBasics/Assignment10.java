package javaBasics;

import java.util.Scanner;

/*
 * Write a Java program that searches for a specific element in an integer array. The program should have the following features:

Create an integer array with elements of your choice.
Prompt the user to enter a value to search for.
Check if the entered value exists in the array.
Print a message indicating whether the value is found or not.

 */

public class Assignment10 {

	public static void main(String[] args) {

		int arr1[] = new int[5];

		arr1[0] = 11;
		arr1[1] = 21;
		arr1[2] = 31;
		arr1[3] = 41;
		arr1[4] = 51;

		Scanner findNumInArray = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = findNumInArray.nextInt();

		for (int i = 0; i < arr1.length; i++) {
			
			int num2 = arr1[i];

			if (num1 == num2) {

				System.out.println("Your number is found in array");
				break;

			} else {
				System.out.println("Your number is not found in array");

			}

		}

	}

}
