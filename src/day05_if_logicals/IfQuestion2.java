package day05_if_logicals;

import java.util.Scanner;

public class IfQuestion2 {

	public static void main(String[] args) {
	/*
	 * Ask user to enter the values of length and width of a rectangle, then check if it is square or not.
	 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length and width");
		float length = scan.nextFloat();
		float width = scan.nextFloat();
		
		if(length==width) {
			System.out.println("This rectangle is a square");
		}
		if(length!=width) {
			System.out.println("This rectangle is not a square");
		}

	}

}
