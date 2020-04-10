package day11_review_while_loop;

import java.util.Scanner;

public class ForLoopQuestion01Interview {

	public static void main(String[] args) {
		/*
		 Ask user to enter his/her last name, then print its inverse on the console.(Interview Question) 
         If the last name is "Walker" output will be "reklaW"
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		
		String reversedStr = "";
		
		for(int i=1; i<=str.length(); i++) {
			reversedStr = reversedStr + str.charAt(str.length()-i);
		}
		System.out.println(reversedStr);
	}
}
