package day02_variable_scanner;

import java.util.Scanner;

public class VolumeOfPrism {
	public static void main(String[] args) {
		/*
	    Type a program which calculates the volume of a rectangular prism 
        whose length, with, and height are entered by user. 
        Hint 1: Volume of a rectangular prism is width x length x height 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the width as float");
		float width = scan.nextFloat();
		
		System.out.println("Enter the length as float");
		float length = scan.nextFloat();
		
		System.out.println("Enter the height as float");
		float height = scan.nextFloat();
		
		System.out.println("Volume is "+ width*length*height);
	}
}
