package day06_nested_if;

import java.util.Scanner;

public class HowToCheckANumberIsInteger {

	public static void main(String[] args) {
		/*
		 * Type a program to check if a number is integer or not
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number to check if it is integer or not");
		double num = scan.nextDouble();
		
		if(num == (int)num) {
			System.out.println("The number is integer");
		}else {
			System.out.println("The number is not integer");
		}

	}

}
