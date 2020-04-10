package day18_array_methods_multi_dimensional_arrays;

import java.util.Arrays;

public class SplitQuestion01 {

	public static void main(String[] args) {
		/*
		 * Create a String "I liked Java, did you like it?"
		 * 1)Split by using "d"
		 * 2)Split by using " "
		 * Print the arrays on the console.
		 */

		String str = "I liked Java, did you like it?"; 
		
		String str1[] = str.split("d");
		System.out.println(Arrays.toString(str1));
		
		String str2[] = str.split(" ");
		System.out.println(Arrays.toString(str2));
	}

	
	
	
}
