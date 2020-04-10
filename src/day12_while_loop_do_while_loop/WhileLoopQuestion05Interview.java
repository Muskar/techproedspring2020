package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class WhileLoopQuestion05Interview {

	public static void main(String[] args) {
		/*
		 Get number from user
		 Type java code by using while loop, 
         Write a program that prompts the user to input an integer. 
         It should then find sum of the digits of that number. 
         For example; user entered 1234 --> 1+2+3+4 = 10 --> output will be 10
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		
		int sum = 0;
		
		while(num>0) {
			int lastDigit = num % 10;
			sum = sum + lastDigit;
			num = num / 10;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		

	}

}
