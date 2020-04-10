package day20_list_foreachloop;

public class ForEachLoopQuestion03 {

	public static void main(String[] args) {
		/*
		 Write a Java program to find the common elements between two 
         arrays (string values).
		 */
		
		String arr1[] = {"A", "B", "C", "D"};
		String arr2[] = {"Z", "B", "K", "L", "D"};
		
		for(String w : arr1) {
			
			for(String j:arr2) {
				
				if(w.equals(j)) {
					System.out.print(w + " ");
				}
				
			}
			
		}
	}
}
