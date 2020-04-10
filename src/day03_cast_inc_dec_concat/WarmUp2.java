package day03_cast_inc_dec_concat;

import java.util.Scanner;

public class WarmUp2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please select a figure to draw triangle");
		String fig = scan.next(); // next() gets just the first word, nextLine() gets all the line as data
		
		System.out.println("  " + fig + "  ");
		System.out.println(" " + fig + " " + fig + " ");
		System.out.println(fig + " " + fig + " " + fig);
	}
}
