package lambda;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

public class LambdaExercisesFor1112 {

	public static void main(String[] args) {
		//1) Use IntPredicate to print on the console all odd integers in the given array
		//2) Use IntUnaryOperator to print on the console all odd integers in the given array
		int arr[] = {12, 9, 13, 4, 6, 2, 4, 12, 15};
		oddsInArray(arr);
		System.out.println("====");
		squaredUnary(arr);
	}
	
	//1) IntPredicate
	public static void oddsInArray(int arr[]) {
		IntPredicate intPredicate = x-> x%2==1;
		Arrays.stream(arr)
		      .filter(intPredicate)
		      .forEach(System.out::println);		
	}
	
	//2) IntUnaryOperator
		public static void squaredUnary(int arr[]) {
			IntUnaryOperator intUnary = x -> x*x;
	        Arrays.stream(arr)
	              .map(intUnary)
	              .forEach(System.out::println);			      		
		}
}
