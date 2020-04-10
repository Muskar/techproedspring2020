package day11_review_while_loop;

import java.util.Scanner;

public class ReverseIntegerInterview {

	public static void main(String[] args) {
		/*
		 Ask user to enter an integer, then print its inverse on the console.(Interview Question) 
         If the last number is "12345" output will be "54321"
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		String num = scan.nextLine();
		
		String reversedNum = "";
		
		for(int i=1; i<=num.length(); i++) {
			reversedNum = reversedNum + num.charAt(num.length()-i);
		}
		System.out.println(reversedNum);
		
		int reversedInt = Integer.parseInt(reversedNum); 
		System.out.println(reversedInt);

	}

}
