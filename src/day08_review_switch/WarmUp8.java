package day08_review_switch;

import java.util.Scanner;

public class WarmUp8 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a number. If the number is less than 10 and greater 
         than or equal to 0, calculate its cube. Otherwise, calculate its square.
         Cube of a = a*a*a           Square of a = a*a 
         Use ternary operator
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int x = scan.nextInt();
		
		int result = x<10 && x>=0 ? x*x*x : x*x;
		System.out.println(result);
	}

}
