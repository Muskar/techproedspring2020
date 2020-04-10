package day13_Review_StringMethods_MethodCreation;

import java.util.Scanner;

public class MethodCreatingTask01 {

	public static void main(String[] args) {
		/*
		 * Task: Create a method outside of the main method like;
		 * Ask user to enter two numbers then print their product on the console
		 * Call the method from inside the main method.
		*/ 
		productTwoNums();
	}
   public static void productTwoNums() {
	   
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers to product");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		System.out.println("The product of numbers is " + num1*num2);
   }
}
