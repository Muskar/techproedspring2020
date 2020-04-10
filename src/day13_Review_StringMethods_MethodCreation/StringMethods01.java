package day13_Review_StringMethods_MethodCreation;

public class StringMethods01 {

	public static void main(String[] args) {
		
		 String str1 = "Hello Java I am here";
		 String str2 = "";
		 
		// startsWith() method checks the initial character/characters and returns boolean
		 boolean resultForInitial = str1.startsWith("h"); // Case sensitive
		 boolean resultForFirstWord = str1.startsWith("He");
		 boolean resultForNotBeginnings = str1.startsWith("Java",6); // Checking first after the 6th index inclusive
		 //System.out.println(resultForInitial);
		 //System.out.println(resultForFirstWord);
		 //System.out.println(resultForNotBeginnings);
		 		 
		 // endsWith() method checks the last character/characters and returns boolean
		 boolean  resultForLastCharacter = str1.endsWith("e"); // Case sensitive
		 boolean resultForLastCharacters = str1.endsWith("here");
		 //System.out.println(resultForLastCharacter);
		 //System.out.println(resultForLastCharacters);
		 		 
		 // isEmpty() method checks the String whether it is empty or not and returns boolean
		 boolean isEmpty = str1.isEmpty();
		 boolean isEmptySecond = str2.isEmpty();
		 //System.out.println(isEmpty);
		 System.out.println(isEmptySecond);
		 
		 
		 
		 
		 
		 
		 
		 
		

	}

}
