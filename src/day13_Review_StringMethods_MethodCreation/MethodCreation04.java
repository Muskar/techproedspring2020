package day13_Review_StringMethods_MethodCreation;

public class MethodCreation04 {

	public static void main(String[] args) {
		/* TASK:
		 * Create a method outside of the main method
		 * Get(Pass) first name and last name as a parameter into the method
		 * If just the initials are uppercase, print on the console "Good job"
		 * Call the method from inside the main method by using arguments
		 */
		checkUpperInitials("Ali","Gunes");
	}

	public static void checkUpperInitials(String first, String last) {
		if(first.charAt(0)>='A' && first.charAt(0)<='Z' && last.charAt(0)>='A' && last.charAt(0)<='Z') {
			System.out.println("Good job");
		}else {
			System.out.println("Make the initials uppercase");
		}
	}
}
