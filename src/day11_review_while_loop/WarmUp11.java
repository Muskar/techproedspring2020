package day11_review_while_loop;

import java.util.Scanner;

public class WarmUp11 {

	public static void main(String[] args) {
		/*
		 Ask user to enter his/her first name, then print the letters of the first name on the console 
		 from top to down.
         		If the first name is John out put will be like; J
														        o
                                                                h
                                                                n
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String name = scan.next();
		
		for(int i=0; i<name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		
		
		
		
		
		
		
		
		
		
	}
}
