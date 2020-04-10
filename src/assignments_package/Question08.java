package assignments_package;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		/*
		 Type a program which converts the hours to seconds. Hours value will be
         entered by user. (Use long)
         Hint 1: second = hour x 60 x 60
         Hint 2: To get long, use nextLong()
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter hours value to convert seconds");
		long hour = scan.nextLong();
		System.out.println(hour + " hours are " + hour*60 + " seconds");
	}
}
