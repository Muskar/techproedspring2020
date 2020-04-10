package day05_if_logicals;

import java.util.Scanner;

public class IfElseIfQuestion1 {

	public static void main(String[] args) {
		/*
		 Type java code by using if-else if() statement, 
         if both of the two integers are positive, output will be the sum of them. 
         If both of the two integers are negative, output will be the multiplication of them.
         Otherwise; output will be “I cannot add or multiply different signed numbers”
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first integer");
		int num1 = scan.nextInt();
		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		
		if(num1>0 && num2>0) {
			System.out.println("Both are positive therefore I am adding " + (num1 + num2));
		}else if(num1<0 && num2<0) {
			System.out.println("Both are negative therefore I am multiplying " + (num1 * num2));
		}else {
			System.out.println("I cannot add or multiply that kind numbers");
		}

	}

}
