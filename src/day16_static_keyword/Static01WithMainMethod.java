package day16_static_keyword;

public class Static01WithMainMethod {

	public static void main(String[] args) {
		
		int myArray1[] = {9, 10, 11};
		int myArray2[] = {9, 10, 11};
		int size = myArray1.length;
		System.out.println(myArray1.equals(myArray1));
		for(int i=0; i<size; i++) {
			System.out.println(myArray1[i]);
		}
		
		
		System.out.println(myArray1.length);
		
		//To reach static variables and methods 
		//       1) I can reach them by using just class name
		//       2) I can reach them by using object as well but it is not recommended (do not do it)
		
		System.out.println(Static02WithoutMainMethod.name2);
		System.out.println(Static02WithoutMainMethod.num2);
		Static02WithoutMainMethod.method2();
		
		// To reach instance variables and methods 
		//       1) You have just one way which creating object and reaching them through object
		
		Static02WithoutMainMethod obj1 = new Static02WithoutMainMethod();
		System.out.println(obj1.name1);
		System.out.println(obj1.num1);
		obj1.method1();

	}

}
