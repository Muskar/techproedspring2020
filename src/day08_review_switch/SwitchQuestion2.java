package day08_review_switch;

import java.util.Scanner;

public class SwitchQuestion2 {

	public static void main(String[] args) {
		/*
		 * Type code which types “even” for even integers, and “odd” for odd integers on console.
		 */
		 String str = "even";
		
		switch(str) {
		  case "Even":
		    System.out.println("Even integer");
		    break;
		  case "Odd":
			System.out.println("Odd integer"); 
			break;
		  default:
			System.out.println("Enter a valid data");  
		}

	}

}
