package day05_if_logicals;

import java.util.Scanner;

public class HowToGetCharFromUser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the initials of your first and last name");
		char initialOfTheFirstName = scan.next().charAt(0);
		char initialOfTheLastName = scan.next().charAt(0);
		
		System.out.println("First name initial: " + initialOfTheFirstName);
		System.out.println("Last name initial: " + initialOfTheLastName);

	}

}
