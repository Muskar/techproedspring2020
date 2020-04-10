package day11_review_while_loop;

import java.util.Scanner;

public class ForLoopQuestion01 {

	public static void main(String[] args) {
		/*
		 Two numbers are entered through the keyboard.First is base, second is power. 
		 Write a program to find the value of first number raised to the power of the second.
		 For example; if the numbers are 2 and 3, output will be 8. Because 2x2x2(three times) = 8
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base");
		int base = scan.nextInt();
		
		System.out.println("Enter the power except zero");
		int power = scan.nextInt();
		
		int num = 1;
		
		for(int i=1; i<=power; i++) {
			num = num * base;		
		}
		System.out.println(num);
		
		
		
		
		
		
		
		
		
	}
}
