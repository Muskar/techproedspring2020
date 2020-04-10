package day25_overriding_polymorphism;

public class MethodSignature {

	public static void main(String[] args) {
	
	}
	// To check if the methods are same or not
	// look at just method name and parameter list
	// When you look at the parameter list just look at the data types
	// Method signature contains method name and parameter list
	
	public void addX(int num1, int num2) {
		System.out.println("The sum: " + (num1 + num2));
	}

	protected int add(int num3, int num4) {
		return num3 + num4;
	}
}
