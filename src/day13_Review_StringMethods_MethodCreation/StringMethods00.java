package day13_Review_StringMethods_MethodCreation;

import java.util.Scanner;

public class StringMethods00 {

	public static void main(String[] args) {
		/*
		 * Task: Ask user to enter his first name.
		 * Make the first and the last letters "*"
		 */
		
		/*
		 * 1) When you make a change on a String, you need to assign it to a new variable
		 * 2) Functionality of Garbage Collector
		 * 3) Strings are immutable
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String name = scan.next();
		
		String firstInitial = name.substring(0,1).replaceAll("\\w", "*");
		String lastInitial = name.substring(name.length()-1).replaceAll("\\w", "*");
		String allLettersExceptFirstAndLast = name.substring(1,name.length()-1);

		String changedName = firstInitial + allLettersExceptFirstAndLast + lastInitial ;
		
		System.out.println(name);  //Ali 
		System.out.println(changedName); // *l*		
	}

}
