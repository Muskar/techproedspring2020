package day18_array_methods_multi_dimensional_arrays;

import java.util.Scanner;
import java.util.Arrays;

public class SortQuestion01 {
        
	
	public static void main(String[] args) {
		/*
		 Ask user to enter an integer array then print the array on the console
		 Use sort method then print the array on the console
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of the array");
		int length = scan.nextInt();
		int arr[] = new int[length];
		
		System.out.println("Enter the elements of the array");
		for(int i=0; i<length; i++) {
			arr[i]=scan.nextInt();		
		}
		
		for(int i=0; i<length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		Arrays.sort(arr);
		
		//ascending order
		for(int i=0; i<length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		//descending order
		for(int i=0; i<length; i++) {
			System.out.print(arr[length-1-i] + " ");
		}
		

	}

}
