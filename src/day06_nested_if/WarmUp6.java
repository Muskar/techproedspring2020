package day06_nested_if;

import java.util.Scanner;

public class WarmUp6 {

	public static void main(String[] args) {
		/*
		 Ask user to enter annual salary, if the salary is more than or equal 
         to $80.000 output will be “I accept the offer”, if the salary is between 
         $60.000 and $80.000 out put will be “I negotiate to increase”, 
         otherwise output will be “I do not accept the offer.”
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the offered annual salary");
		int annualSalary = scan.nextInt();
		
		if(annualSalary>=80000) {
			System.out.println("I accept the offer");
		}else if(annualSalary>=60000) {
			System.out.println("I negotiate the offer");
		}else {
			System.out.println("I do not accept the offer");
		}

	}

}
