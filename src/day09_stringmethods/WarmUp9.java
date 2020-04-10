package day09_stringmethods;

import java.util.Scanner;

public class WarmUp9 {

	public static void main(String[] args) {
		/*
		 Ask user to enter one of the ‘U’, ’S’, and ‘A’. 
         Then type a program by using “switch statement” to print “United” for ‘U’
         ”States” for ’S’, and “America” for ‘A’
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter one of the 'U', 'S', and 'A'");
		char ch = scan.next().charAt(0);
		
		switch(ch) {
		   case 'U':
			   System.out.println("United");
			   break;
		   case 'S':
			   System.out.println("States");
			   break;
		   case 'A':
			   System.out.println("America");
			   break;
		   default:
			   System.out.println("Just one of the 'U', 'S', and 'A'");
		}
	}
}
