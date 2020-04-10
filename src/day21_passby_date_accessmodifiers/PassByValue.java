package day21_passby_date_accessmodifiers;

public class PassByValue {
	
   public static void main(String[] args) {
		
		int num = 5;
		
		System.out.println(increment(num)); // 6
		
		System.out.println(num);//5
		
	}
	
	public static int increment(int num) {
		num++;
		return num;
	}
}
