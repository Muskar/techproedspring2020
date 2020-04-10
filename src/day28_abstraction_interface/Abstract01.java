package day28_abstraction_interface;

public abstract class Abstract01 {

	//If you use "abstract" keyword do not create body
	//If you do not use "abstract" keyword do not forget to create body
	
	public abstract void abs();
	public abstract void abs2();
	
	//We can create concrete methods inside abstract classes; however,
	//we cannot create abstract methods inside concrete classes.
	
	//No need to inherit concrete methods form child classes
	public void concrete() {
		System.out.println("This is not abstract");
	}
}

class Dog extends Abstract01{
	//If you do not inherit any abstract method from parent class
	//you will get compile time error.
	public void abs() {
		System.out.println("I have to inherit all abstract methods");
	}
	
	public void abs2() {
		System.out.println("I have to inherit all abstract methods");
	}	
}
