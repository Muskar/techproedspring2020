package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class DoWhileLoopQuestion03 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a number. If the number is not 0
		 * Ask user to enter a new number and give a message like "You won!"
		 * If user enters 0, finish the loop and give a message like "You lost!"
		 */		
		Scanner scan = new Scanner(System.in);
        int num = 1;
		
		do {
			System.out.println("Enter an integer");
			num = scan.nextInt();
			if(num>0 || num<0) {
				System.out.println("You won!");
			}else if(num==0){
				System.out.println("You lost!");
			}
			
		}while(num!=0);

	}

}
