package day19_array_lists;

import java.util.ArrayList;
import java.util.List;

public class SetMethod {

	public static void main(String[] args) {
		// set() is used to change an element
		
		List<String> list1 = new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Can");
		System.out.println(list1); //[Ali, Veli, Can]
		
		// Change "Ali" to "John"
		System.out.println(list1.set(0, "John")); // set() returns the disappeared element which is Ali
		System.out.println(list1);// [John, Veli, Can]
		
		//Do not use set() to add sth to the list
		//System.out.println(list1.set(3, "George"));// If you use index which is greateer than or equal to 
		                                           // the length of the list, you will get 	                                           // IndexOutOfBoundsException
	}

}
