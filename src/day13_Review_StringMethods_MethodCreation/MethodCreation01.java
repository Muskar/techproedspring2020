package day13_Review_StringMethods_MethodCreation;

import java.util.Scanner;

public class MethodCreation01 {

	public static void main(String[] args) {
		/*
		 * Create a method outside of the main method like;
		 * Ask user to enter two numbers then print their sum on the console
		 * Call the method from inside the main method.
		*/ 
		addTwoNums(1,"3"); //Calling method
	}
	
	public static void addTwoNums(double num1, String num2) {
		
		System.out.println(num1+num2);
	}
	
	
	 
	

}
