package day04_memo_operations_if;

import java.util.Scanner;

public class AreaModulus {

	public static void main(String[] args) {
		/*
		Type a program like;
		Ask user to enter two integer values, the first will be greater than the second.
		The remainder when you divide the first by the second will be the width, 
		and the sum of the two numbers will be the length of a rectangle. 
		Then calculate the area and the perimeter of the rectangle, and print them 
		on the console.
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two integers, the first will be greater than the second");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int width = num1 % num2;
		int length = num1 + num2;
		
		System.out.println("Area: " + width*length);
		System.out.println("Perimeter: " + (2*(width+length)));

	}

}
