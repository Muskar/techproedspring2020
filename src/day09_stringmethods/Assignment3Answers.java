package day09_stringmethods;

import java.util.Scanner;

public class Assignment3Answers {

	public static void main(String[] args) {
		
		// Question 22
		
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of money you have");
        double moneyAmount = scan.nextDouble();
        
        System.out.println("Enter the price of the shirt");
        double price = scan.nextDouble();
        
        if(moneyAmount>300){
        	if(price<200){
                 System.out.println("I can  buy the shirt");
        	}else {
        		System.out.println("Let me think");
        	}
        }else if(moneyAmount==190){
        	if(price==200){
                System.out.println("I cannot buy the shirt");
       	    }else {
       		    System.out.println("Let me think");
       	    }
        }else{
        	System.out.println("Let me think");
        }
	}

}
