package day02_variable_scanner;

import java.util.Scanner;

public class AreaPerimeterOfASquare {
	
	public static void main(String[] args) {
		
		/*
		   Type a program which calculates the area and the perimeter of a square 
           whose side length is entered by user. 
           Hint 1: Area of a square is length x length
           Hint 2: Perimeter of a square is 4x length
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the side of the square as an integer");
		int side = scan.nextInt();
		System.out.println("Area of the square is "+side*side);	
		System.out.println("Perimeter of the square is " + 4*side);
		
	}
}
