package javaBasics;

/*
 * Write a Java program that takes a sentence as input and counts the number of words in it.
 

Input :

String str = "Hello,World.";

Output :

Number of words = 2
 */

public class Assignment14 {

	public static void main(String[] args) {
		
		String str = "Hello,World.";
		
		String arr [] = str.split(",");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		int count = arr.length;
		System.out.println("Total number of words: "+count);
	}

}
