package Strings;

public class EqualsDemo {

	public static void main(String[] args) {
		
		String s1 = "Chunky Salsa";
		String s2 = "Chunky Salsa";
		String s3 = new String("Chunky Salsa");
		
		System.out.println(s1.equals(s2)); 
		
		if(s1 == s2){
			System.out.println("The Address of both strings are same");
		}
		else{
			System.out.println("The Address of both strings are different");
		}
		
		if (s1.equals(s3)) {
			System.out.println("Both Strings are Equal");
		} else
			System.out.println("Both Strings are Not Equal");
	}
}