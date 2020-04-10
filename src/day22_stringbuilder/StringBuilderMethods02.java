package day22_stringbuilder;

public class StringBuilderMethods02 {

	public static void main(String[] args) {
		/*
		 * Create a String "United Kingdom".
		 * 1)Print the length of the String on the console.
		 * 2)Find the first occurence of the char 'n'
		 * 3)Find the last occurence of the char 'n'
		 * 4)Find the character in index 4
		 * 5)Make the String "United Kingdom 2020"
		 * 6)Insert 'X' after first 'i' ==> UniXted Kingdom 2020
		 * 7)Delete X ==> United Kingdom 2020
		 */

		StringBuilder sb1 = new StringBuilder("United Kingdom");
		System.out.println("The length: " + sb1.length());
		System.out.println("Index of first occurence of 'n': " + sb1.indexOf("n"));
		System.out.println("Index of last occurence of 'n': " + sb1.lastIndexOf("n"));
		System.out.println("Character in index 4: " + sb1.charAt(4));
		System.out.println(sb1.append(" 20").append("20"));
		//System.out.println(sb1.insert(3, "X"));
		System.out.println(sb1.insert(sb1.indexOf("i")+1, "X"));
		System.out.println(sb1.delete(3, 4));
		System.out.println(sb1.deleteCharAt(6)); //UnitedKingdom 2020
		System.out.println(sb1.reverse()); // 0202 modgniKdetinU
		
		
		
		
		
		
	}

}
