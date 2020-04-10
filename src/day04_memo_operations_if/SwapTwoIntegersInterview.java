package day04_memo_operations_if;

import java.util.Scanner;

public class SwapTwoIntegersInterview {

	public static void main(String[] args) {
		/*
		 Ask user to enter two integer values. Write a Java Program to swap
         two numbers by using the third variable.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two integers to swap");
		int numA = scan.nextInt();
		int numB = scan.nextInt();
		
		System.out.println("Before swapping: " +numA + " <=====> " + numB);
		
		int numNew = 0;
		numNew = numA;
		numA = numB;
		numB = numNew;
		
		System.out.println("After swapping: " + numA + " <=====> " + numB);
	}

}
