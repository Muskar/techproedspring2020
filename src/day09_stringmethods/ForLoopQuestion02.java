package day09_stringmethods;

public class ForLoopQuestion02 {

	public static void main(String[] args) {
		/*
		 * Print on the console all integers from 100 to 1 in the same line with space between them
		 * like; 100 98 96 94 . . . 4 2 0
		 */
		for(int i=100; i>=0; i=i-2) {      // i=i-2       i-=2      i--
			System.out.print(i + " ");
		}

	}

}
