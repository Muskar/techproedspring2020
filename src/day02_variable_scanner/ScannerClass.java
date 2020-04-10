package day02_variable_scanner;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		/*
		 * Get an odd integer from user
		 * Print it on the console
		 */
		
		Scanner number = new Scanner(System.in);
		
//		System.out.println("Please enter an odd integer");
//		int num1 = number.nextInt();
//		System.out.println(num1);
		
		/*
		 * Get user's full name
		 * Print it on the console
		 */
		
		System.out.println("Please enter your full name");
		String fullName = number.nextLine();
		System.out.println(fullName);
		
		
		
		
		
	}
}
