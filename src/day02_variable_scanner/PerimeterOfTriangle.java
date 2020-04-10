package day02_variable_scanner;

import java.util.Scanner;

public class PerimeterOfTriangle {

	public static void main(String[] args) {
		
		/*
	    Type a program which calculates the perimeter of a triangle whose 
        Side lengths are entered by user. (Use byte)
        Hint 1: Perimeter of a triangle is a + b + c
        Hint 4: To get byte, use nextByte()
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the sides of the triangle as byte data type");
		byte s1 = scan.nextByte(), s2 = scan.nextByte(), s3 = scan.nextByte();
		System.out.println("perimeter of the triangle is " + (s1 + s2 + s3));
	}
}
