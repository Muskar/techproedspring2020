package day05_if_logicals;

import java.util.Scanner;

public class IfQuestion4 {

	public static void main(String[] args) {
		/*
		 Type java code by using if statement. When you enter the name of the day of a week, 
         output will be “Weekday” or “Weekend day” according to the name of the day.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the week, start with uppercase");
		String dayOfTheWeek = scan.next();
		
		if(dayOfTheWeek.equalsIgnoreCase("Saturday")) {       // While compare Strings DO NOT use "=="
			System.out.println("Weekend day");                // Use equals() or equalsIgnoreCase()
		}
		if(dayOfTheWeek.equalsIgnoreCase("Sunday")) {  // "==" checks the value and the address of the Strings
			System.out.println("Weekend day");         // However, equals() and equalsIgnoreCase() checks just 
		}												// values.
		if(dayOfTheWeek.equalsIgnoreCase("Monday")) {
			System.out.println("Week day"); 
		}

	}

}
