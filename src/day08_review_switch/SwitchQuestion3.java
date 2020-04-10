package day08_review_switch;

import java.util.Scanner;

public class SwitchQuestion3 {

	public static void main(String[] args) {
		/*
		 If the user pressed 1, 2, 3 the program will print the number that is pressed; 
         otherwise, program will print "Not allowed".
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1, 2 or 3");
		int x = scan.nextInt();
		
		switch(x) {
		
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("Not allowed");
		}
	}

}
