package day13_Review_StringMethods_MethodCreation;

public class StringMethods02 {

	public static void main(String[] args) {
		/*
		 * Task: Use startsWith(), endsWith(), isEmpty() for str3.
		 * String str3 = "This is for you to practice";
		 */
		
		String str3 = "This is for you to practice";
		
		boolean b1 = str3.startsWith("T");
		System.out.println(b1);
		
		boolean b2 = str3.startsWith("i",5);
		System.out.println(b2);
		
		boolean b3 = str3.endsWith("ice");
		System.out.println(b3);
		
		boolean b4 = str3.isEmpty();
		System.out.println(b4);

	}

}
