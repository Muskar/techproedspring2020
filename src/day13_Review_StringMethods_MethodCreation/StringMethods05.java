package day13_Review_StringMethods_MethodCreation;

public class StringMethods05 {

	public static void main(String[] args) {
		
		String str = "Java says hello world. Java String tutorial";

		//Replace first occurrence of substring "Java" with "JAVA"
		
		String result = str.replaceFirst("Java", "JAVA");
		System.out.println(result); // JAVA says hello world. Java String tutorial
		
		String result2 = str.replaceFirst("a", "X");
		System.out.println(result2); // JXva says hello world. Java String tutorial	
		
		String result3 = str.replaceFirst("\\s", "***"); //Java***says hello world. Java String tutorial
		System.out.println(result3);
	}

}
