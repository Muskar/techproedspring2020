package day26_exceptions;

public class Exceptions04 {

	public static void main(String[] args) {
        indexNum("Java", 2);
	}
	
	//IndexOutOfBoundsException is the parent of StringIndexOutOfBoundsException
	//If you are using many catch blocks do not use parent before child, make order
	//form child to parent
	
	public static void indexNum(String str, int idx) {
		try {
		    System.out.println(str.charAt(idx));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("Be careful about the index 1st catch block");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Be careful about the index 2nd catch block");
		}
		finally {
			System.out.println("You did a good job!");
		}
	}

}
