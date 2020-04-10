package day10_for_loop_practice;

public class ForLoopQuestion00 {

	public static void main(String[] args) {
		/*
		 How many times 'Hello' is printed for the following codes? 
		*/
		
		//Question 1
		for(int i = 0; i<5; i++){
		     //System.out.println("Hello1");
		     break;
		}
		
		//Question 2
		for(int i = 0; i<5; i++){
			 //System.out.println("Hello2");
			 i++;
		}
		
		//Question 3
		for(int i = 0; i<5; i++){
			 //System.out.println("Hello3");
			 i++;
			 i--;
		}
		
		//Question 4
		for(int i = 0; i<5; i++){
			// System.out.println("Hello4");
			 i+=2;
		}
		
		//Question 5
		for(int i = 0; i<5; ){
			//System.out.println("Hello5");
		}
		
		//Question 6 
	    for(int i = 0; i>5; ){
		   // System.out.println("Hello6");
	    }
	    
	    //Question 7
	    for(int i = 0; i<5; i=5 ){
	    	//System.out.println("Hello7");
	    }
	    
	    //Question 8
	    for(int i = 0; i<5; i--){
	    	System.out.println("Hello8");
	    }		
	}
}
