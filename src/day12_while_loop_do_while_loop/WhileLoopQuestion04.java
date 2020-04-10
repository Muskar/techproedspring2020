package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class WhileLoopQuestion04 {

	public static void main(String[] args) {
		/*
		 Type java code by using while loop, 
         Write a program to count the factors of an integer which is entered by user.
         For example; 6 --> Factors of 6 is --> 1,2,3,6
                      10 --> Factors of 10 --> 1, 2, 5, 10
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		
		int factor = 1;
		
		while(factor<=num) {
			if(num%factor==0) {
				System.out.print(factor + " ");
			}
			factor++;
		}

	}

}
