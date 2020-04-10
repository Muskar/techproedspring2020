package day03_cast_inc_dec_concat;

public class Concatenation {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Easy";
		System.out.println(str1 + str2);
		System.out.println(str1 + " " + str2);
		System.out.println("Java"  + " Easy");
		
		System.out.println("2" + "5"); //You should get 25, not 7
		System.out.println(2 + "5"); // You should get 25
		System.out.println(2 + 3 + "5"); //You should get 55
		System.out.println("5" + 3 + 2); // You should get 532
		System.out.println("5" + (3 + 2)); // You should get 55
		System.out.println("5" + 3*2); //You should get 56
		System.out.println(2 + 3 + "5" + 6 + 7*2); //  55614
		System.out.println(3*2 + "5" + (4+5) + 1); //  6591
		}

}
