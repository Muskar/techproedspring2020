package day03_cast_inc_dec_concat;

public class TypeCasting {

	public static void main(String[] args) {
		byte by = 34;
		short sh = by;
		
		/*
		 * Create a short variable and cast it to int
		 * Print it on the console
		 */
		
		/*
		 * Create a float variable and cast it to double
		 * Print it on the console
		 */
		
		short sh1 = 129;
		int in1 = sh1;
		System.out.println(in1);
		
		float fl = 1.2f;
		double dbl = fl;
		System.out.println(dbl);
		
		
		float fl2 = 2.923f;
		int in2 = (int) fl2;
		System.out.println("This will be integer " + in2);
		//If you convert a float or double to byte/short/int/long
		//You will get just integer part, decimal part will be cancelled
		
		/*
		 * Create an int variable and convert it to byte
		 * Print it on the console 
		 */
		
		int in3 = 1234534;
		byte by3 = (byte)in3;
		System.out.println(by3);
		
		/*
		  Write a program to add an integer variable having value 5 
          and a double variable having value 6.2. Print the sum on the console.
		 */
		
		int in4 = 5;
		double dbl4 = 6.2;
		System.out.println("Result is: "+ (in4 + dbl4));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
