package day07_review_ternary;

import java.util.Scanner;

public class TernaryQuestion4 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		int length = scan.nextInt();
		System.out.println("Enter the width of the rectangle");
		int width = scan.nextInt();
		
		String result = length==width ? "Square" : "Rectangle";
		System.out.println(result);

	}

}
