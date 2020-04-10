package day02_variable_scanner;

import java.util.Scanner;

public class AreaPerRectangle {
	public static void main(String[] args) {
		/*
		 Type a program which calculates the area and the perimeter of a rectangle 
         whose length and with are entered by user. 
         Hint 1: Area of a rectangle is width x length
         Hint 2: Perimeter of a rectangle is 2x (width + length)
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the width of the rectangle as double");
		double width = scan.nextDouble();
		System.out.println("Enter the length of the rectangle as double");
		double length = scan.nextDouble();
		System.out.println("Area is " + width*length);
		System.out.println("Length is " + 2*(width+length));
	}
}
