package assignments_package;

import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {
		/*
		 Type a program which asks user to enter his/her first name and last name, 
         then print it on the console. 
         Hint: To get String, use nextLine()
		 */	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter your first name");
		String first = scan.nextLine();
		System.out.println("Please, enter your last name");
		String last = scan.nextLine();
		System.out.println(first + " " + last);
	}
}
