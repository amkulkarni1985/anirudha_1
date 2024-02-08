package javaBasics;
import java.util.Scanner;

/*
 * 
 * Write a Java program that takes a string as input and prints its reverse.
 */

public class Assignment13 {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = userInput.nextLine();

		System.out.println("You have entered: " + name);

		char arr[] = name.toCharArray();

		for (int i = arr.length - 1; i >= 0; i--) {
			
					
			System.out.print(arr[i]);
			
			}
		
		
	
	}



}
