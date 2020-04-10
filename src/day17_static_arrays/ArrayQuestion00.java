package day17_static_arrays;

public class ArrayQuestion00 {

	public static void main(String[] args) {
		/*
		 1)Declare two Arrays
		 2)Create two Arrays which has 4 elements
		 3)Initialize all elements, for the first Array use the long way to initialize
		 for the second one use the short way to initialize 
		 */
		
		/*If you use index more than or equal to length of an array
		 *  1)We do not get compile time error
		 *  2)We get runtime error which is "ArrayIndexOutOfBoundsException"
		 */
			
		char arr1[] = new char[4]; // Here I put primitive
		
		arr1[0] = 'a';
		arr1[1] = 'b';
		arr1[2] = 'c';
		arr1[3] = 'd';
		
		String arr2[] = {"Ali", "Veli", "Fatma", "Ayse"}; // Here I put reference
		
		//This is a correct way but too long, to make it short we will use for loop
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		
		//For loop to print all elements of arr1 of the array on the console
		for(int i = 0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		//For loop to print all elements of arr2 of the array on the console
		for(int i = 0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
