package day06_nested_if;

import java.util.Scanner;

public class ReviewQuestion1Interview {

	public static void main(String[] args) {
		/*
		 Ask user to enter a word which has 4 letters and output will be inverse of the word.
         For example; if user enters “MARK” output will be “KRAM”
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word which has 4 letters");
		String word = scan.next();
		
		char first = word.charAt(0);
		char second = word.charAt(1);
		char third = word.charAt(2);
		char fourth = word.charAt(3);
		System.out.println("Before inversing: " + word);
		System.out.println("After inversing: " + fourth + third + second + first);
	}

}
