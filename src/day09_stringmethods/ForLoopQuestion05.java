package day09_stringmethods;

public class ForLoopQuestion05 {

	public static void main(String[] args) {
		/*
		 * Type a program to print all letters in English alphabet on the console in the same line
		 */		
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.print((c + " ").toUpperCase());
		}
	}
}
       