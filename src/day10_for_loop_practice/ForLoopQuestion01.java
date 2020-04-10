package day10_for_loop_practice;

public class ForLoopQuestion01 {

	public static void main(String[] args) {
		/*
		 Write a program to calculate the sum of first 10 natural number.
		 Natural numbers start from 0.
		*/
		
		int sum = 0;
		
		for(int i=0; i<20; i++) {  // 1) Create a variable assign 0 for addition
			                       // 2) Type sum = sum + i   or  sum += i
			sum = sum + i;	
		}
		
		System.out.println(sum); // To see the sum of the last step put System.out.println(sum)
								 // out of the loop body
	}
}
