package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class DoWhileLoopQuestion02 {

	public static void main(String[] args) {
		/*
		  Type java code by using do-while loop, 
          Write a program that prompts the user to input a positive integer. 
          It should then print the digits which have odd indexes.
          For example; number is 12345 --> 2, 4
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		String num = scan.nextLine();
		
		int length = num.length();
		int i = 1; 
		
		do {
			System.out.print(num.charAt(i));
			i=i+2;
		}while(i<length);
		
		
		

	}

}
