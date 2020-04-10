package day17_static_arrays;

public class ArrayQuestion01 {

	public static void main(String[] args) {
		/*
		 * {"a", "b", "c", "d"}
		 * Type a program to declare and initialize the given Array
		 * Print just the second element of the array on the console
		 * Print just the last element of the array on the console
		 * Print the size of the array on the console
		 * Print all elements of the array on the console
		 */
		
		String arr[] = {"a", "b", "c", "d"};
		System.out.println(arr[1]);
		System.out.println(arr[arr.length-1]);
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
