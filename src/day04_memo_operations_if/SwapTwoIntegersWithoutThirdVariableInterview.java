package day04_memo_operations_if;

import java.util.Scanner;

public class SwapTwoIntegersWithoutThirdVariableInterview {

	public static void main(String[] args) {
		/*
		 Ask user to enter two integer values. Write a Java Program to swap 
         two numbers without using the third variable.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers to swap");
		int numA = scan.nextInt();
		int numB = scan.nextInt();
		
		System.out.println("Before swapping: " + numA + " <===> " + numB);
		
		numA = numA - numB;
		numB = numA + numB;
		numA = numB - numA;
		
		System.out.println("After swapping: " + numA + " <===> " + numB);
		

	}

}
