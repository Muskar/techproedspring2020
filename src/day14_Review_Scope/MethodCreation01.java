package day14_Review_Scope;

public class MethodCreation01 {

	public static void main(String[] args) {
		/*
		 * TASK:
		 * Create a method outside of the main method
		 * Get(Pass) the value and the unit which will be converted as a parameter into the method
		 * Your program should be able to convert hours to sec, miles to km, and kg to gr.
		 * Your program should return double and print the result on the console
		 * Call the method from inside the main method by using arguments
		 *  For example; converter(20, "sec") --> output will be 20*60*60 = 72000
		 *               converter(20, "km") --> output will be 20*1.6 = 32
		 *               converter(20, "gr") --> output will be 20*1000 = 20000
		 */
		converter(2,"km");
	}

	public static void converter(double num, String unit) {
		switch(unit) {
		   case "sec":
			   System.out.println(num*60*60);
			   break;
		   case "km":
			   System.out.println(num*1.6);
			   break;
		   case "gr":
			   System.out.println(num*1000);
			   break;
		   default:
			   System.out.println("Enter a valid unit"); 
		}
	}
}
