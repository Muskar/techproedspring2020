package day24_inheritance_certificate_prep;

public class RunningOrderOfConstructorsParent {

	public static void main(String[] args) {

	}
	
	public RunningOrderOfConstructorsParent(String age) {
		System.out.println("This is the constructor of Parent Class");
	}
	
	public RunningOrderOfConstructorsParent(int num, String age) {
		System.out.println("Parent constructor with two parameters");
	}

}
