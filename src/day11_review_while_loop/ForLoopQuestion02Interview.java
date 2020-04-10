package day11_review_while_loop;

import java.util.Scanner;

public class ForLoopQuestion02Interview {

	public static void main(String[] args) {
		/*
		 The program will prompt user to input a number and then it will reverse the same number using for loop
		 */
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		long num = scan.nextLong();
		
		long reversedNum = 0;
		
		for(int i=0; i<12; i++) {
			
			reversedNum = reversedNum*10;
			reversedNum = reversedNum + num%10;
			num = num / 10;
			
			if(num==0) {
				break;
			}
		}
		System.out.println(reversedNum);
	}
}
