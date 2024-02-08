package javaBasics;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		String repeatProcess;
		
		do {

		int num1;
		int num2;
		String operator;
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");		
		num1 = scan.nextInt();
		System.out.println("Enter second number");
		num2 = scan.nextInt();
		System.out.println("Enter Operator : +, -, *, /");
		operator = scan.next();
		//System.out.println(operator);
		if (operator.equals("+")) {

			int Sum = num1 + num2;
			System.out.println("The sum is " + Sum);

		} else if (operator.equals("-")) {

			int Sub = num1 - num2;
			System.out.println("The subtraction is " + Sub);

		} else if (operator.equals("*")) {

			int Mul = num1 * num2;
			System.out.println("The multiplication is " + Mul);

		} else if (operator.equals("/")) {

			double Div = num1 / num2;
			System.out.println("The division is " + Div);

		}
		
		System.out.println("Do you want to continue? Yes or No");
		repeatProcess = scan.next();
			
		
		
		} while(repeatProcess.equalsIgnoreCase("yes"));
		
			
			
	}
	}


