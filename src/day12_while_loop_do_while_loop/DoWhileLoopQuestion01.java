package day12_while_loop_do_while_loop;

public class DoWhileLoopQuestion01 {

	public static void main(String[] args) {
		/*
		 * To understand the difference between while and do-while...
		 */

		int count = 6;
		
		while(count!=6) {
			System.out.println("Hello while");
		}
		
		do {
			System.out.println("Hello do-while");
		} while(count!=6);

	}

}
