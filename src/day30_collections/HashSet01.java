package day30_collections;

import java.util.HashSet;

public class HashSet01 {

	public static void main(String[] args) {
		//To create HashSet
		HashSet<String> hashSet = new HashSet<String>();	
		//To add elements to HashSet
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		System.out.println(hashSet); //[A, B, C]
		
		//Try to duplicate. If you try to add an element more than once Java 
		//will accepts it just once. No Compile Time Error, no Run Time Error.
		hashSet.add("A");
		hashSet.add("A");
		System.out.println(hashSet);
		
		//Try to add null element. If you try to add a null element more than once Java 
		//will accepts it just once. No Compile Time Error, no Run Time Error.
		hashSet.add(null);
		hashSet.add(null);
		System.out.println(hashSet);
	}

}
