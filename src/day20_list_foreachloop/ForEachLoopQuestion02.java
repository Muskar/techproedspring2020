package day20_list_foreachloop;

public class ForEachLoopQuestion02 {

	public static void main(String[] args) {
		/*
		 Create an integer array find the sum of all elements by using for-each loop
         and print the sum on the console.
		*/
		
		int arr[] = {1,2,3,4,5,6};
		int sum = 0;
		
		for(int w : arr) {
			sum = sum + w;
		}
		System.out.println("The sum is " + sum);
	}
}
