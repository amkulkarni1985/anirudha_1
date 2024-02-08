package javaBasics;

import java.util.Iterator;

/*
 * Write a Java program that takes an integer array as input and find the duplicates in the array.

Input : a[] = { 2,3,4,5,2,4,5,7,8}
Output : 2,4,5

The occurrence of 2 ,4 and 5 is more than 1 time.
 * 
 */

public class Assignment11 {

	public static void main(String[] args) {

		int a[] = { 2, 3, 4, 5, 2, 4, 5, 7, 8 };

		for (int i = 0; i < a.length; i++) {

			//System.out.println(a[i]);

			for (int j = i + 1; j < a.length; j++) {

				//System.out.println(a[j]);

				if (a[i] == a[j]) {

					System.out.println(a[j]);

				}
			}

		}

	}

}
