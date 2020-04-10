package day05_if_logicals;

import java.util.Scanner;

public class WarmUp4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a 4 digits integer");
		int num = scan.nextInt();
		
		int last = num % 10;
		int first = num / 1000;
		
		System.out.println("The sum of the first and the last digits: " + (first + last));
	}
}
