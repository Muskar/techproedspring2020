package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class WhileLoopQuestion01 {

	public static void main(String[] args) {
		/*
		  Type java code by using while loop, 
          Write a program that prompts the user to input a positive integer. 
          It should then print the multiplication table of that number. 
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		
		int count = 1;
		
		while(count<=10) {
			System.out.println(num + " x " + count + " = " + num*count);
			count++;
		}	
	}

}
