package day10_for_loop_practice;

import java.util.Scanner;

public class Assignment4Question01 {

	public static void main(String[] args) {
		/*
		 Question 19
		 Ask user to enter one of the first three letters of the alphabet. Output will be the 
		 order number of the letter in the alphabet. For example If user enters ‘a’ output will be 1. 
		 Your code should run for both uppercases and lowercases. Solve by using switch.
		*/		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter one of the first three letters of the alphabet");
		String str = scan.next();
		str = str.toUpperCase();
		
		switch(str) {
		case "A":
			System.out.println("1");
			break;
		case "B":
			System.out.println("2");
			break;
		case "C":
			System.out.println("3");
			break;
		default:
			System.out.println("Not valid character");
		}
	}
}
