package day13_Review_StringMethods_MethodCreation;

public class StringMethods04 {

	public static void main(String[] args) {
		/*
		 * Task: Use isDigit() to check '2' and 'b' 
	     * Use isAlphabetic() to check '3' and 'c'
	    */

		boolean b1 = Character.isDigit('2'); //true
		boolean b2 = Character.isDigit('b'); //false
		
		boolean b3 = Character.isAlphabetic('3'); //false
		boolean b4 = Character.isAlphabetic('c'); //true
		
		System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);
	}

}
