package day21_passby_date_accessmodifiers;

import java.util.Arrays;

public class Varargs01 {

	public static void main(String[] args) {
		
		/*
		 Create a method which has 3 parameters outside the main method
		 Make a parameter as varargs
		 Call the method from main method in different arguments
		 */
		
		print(1,7); // 1 - 7 - [ ] ==> varargs is empty, it is not necessary to enter a value for varargs
		print(1, 7, 2, 3); // 1, 7, [2, 3]
		print(1, 7, 2, 3, 4, 5); //1, 7, [2,3,4,5]

	}
	
	public static void print(int start, int end, int... nums) {		
		System.out.println("Starting number: "+start);
		System.out.println("Ending number: " + end);
		System.out.println("Varargs: " + Arrays.toString(nums));		
	}

}
