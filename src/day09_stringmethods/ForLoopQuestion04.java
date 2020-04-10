package day09_stringmethods;

public class ForLoopQuestion04 {

	public static void main(String[] args) {
		/*
		 * Type a program to find the positive integers which are not divisible by 3 and less than 100, and 
		 * print them on the console.
		 */
		for(int i=1; i<100; i++) {
			if(i%3 != 0) {
				System.out.print(i + ", ");
			}
		}
	}
}
