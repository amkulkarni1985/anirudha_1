package javaBasics;

/*
* WAP to check score card with below conditions
* score<50 - fail
* score>=50 and score<60 - D
* score>=60 and score<70- C
* score>=70 and score<80- B
* score>=80 and score<90- A
* score>=90 and score<100 - A++
* score =100 - Price
* if score is less <0 or above 100 then output Please enter valid score
*
*
*/

public class Assignment2 {

	public static void main(String[] args) {

		System.out.println("START");
		int score = 100;

		if (score > 50) {
			if (score >= 50 && score < 60) {
				System.out.println("Rating is D");
			}
			if (score >= 60 && score < 70) {
				System.out.println("Rating is C");
			}
			if (score >= 70 && score < 80) {
				System.out.println("Rating is B");
			}
			if (score >= 80 && score < 90) {
				System.out.println("Rating is A");
			}
			if (score >= 90 && score < 100) {
				System.out.println("Rating is A++");
			}
			if (score == 100) {
				System.out.println("You are getting a PRICE");
			}
			if (score < 0 || score > 100) {

				System.out.println("INVALID INPUT");
			}

		} else {
			System.out.println("You are failed");
		}
		System.out.println("END");
	}
	
}
