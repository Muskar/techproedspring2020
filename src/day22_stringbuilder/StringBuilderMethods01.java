package day22_stringbuilder;

public class StringBuilderMethods01 {

	public static void main(String[] args) {
		/*
		 * Create a String which has at least 7 characters by using StringBuilder class
		 * 1)Print on the console last 5 characters
		 * 2)Print on the console first 5 characters
		 */

		//StringBuilder sb1 = new StringBuilder("Techproed");
		
        //StringBuilder sb1 = new StringBuilder();
        //sb1.append("Techproed");
		
		StringBuilder sb1 = new StringBuilder(20);
		sb1.append("Techproed");
	
		System.out.println("Last 5 chars: " + sb1.substring(4));
		System.out.println("First 5 chars: " + sb1.substring(0, 5));
	}

}
