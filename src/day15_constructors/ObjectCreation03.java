package day15_constructors;

public class ObjectCreation03 {

	int x=5;
	
	ObjectCreation03() {
       System.out.print("-x"+x);
    }
	
	ObjectCreation03(int x) {
        this();
       System.out.print("-x"+x);
    }
    
	public static void main(String[] args) {
		
		ObjectCreation03 mc1= new ObjectCreation03(4);
		
		ObjectCreation03 mc2= new ObjectCreation03();
		
	}
	
}
