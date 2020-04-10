package day05_if_logicals;

import java.util.Scanner;

public class IfElseIfQuestionInterview {

	public static void main(String[] args) {
		/*
		 Type java code by using if-else statement.
         Write a program to check if a year is leap year or not.
         If the year is divisible by 400 then it is leap year.
         If a year is divisible by 4 and not divisible by 100 then it is leap year. 
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year to check if it is leap year or not");
		int year = scan.nextInt();
		
		if(year % 400 == 0) {
			System.out.println("This is leap year");
		} else if(year%4==0 && year%100!=0) {
			System.out.println("This is leap year");
		}else {
			System.out.println("This is not a leap year");
		}
	}
}
