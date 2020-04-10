package day02_variable_scanner;

import java.util.Scanner;

public class CubeOfANumber {
	public static void main(String[] args) {
		/*
		  Type a program which calculates the cube of a number which is entered by user. 
          Hint 1: Cube of a number is a x a x a
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to calculate its cube");
		int num = scan.nextInt();
		System.out.println("Cube of the number is " + num*num*num);
	}
}
