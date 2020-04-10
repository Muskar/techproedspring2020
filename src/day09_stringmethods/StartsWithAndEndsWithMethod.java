package day09_stringmethods;

public class StartsWithAndEndsWithMethod {

	public static void main(String[] args) {
		
		/*
		 * The startsWith() method determines whether a string begins with 
		 * the characters of a specified string, returning true or false as appropriate.
		 */
		
		String str1 = "Saturday night plans";

		boolean start1 = str1.startsWith("Sat");
		System.out.println(start1);
		

		boolean start2 = str1.startsWith("Sat", 3); //The position in this string at 
		System.out.println(start2);					//which to begin searching for searchString.Defaults to 0.
		
	}

}
