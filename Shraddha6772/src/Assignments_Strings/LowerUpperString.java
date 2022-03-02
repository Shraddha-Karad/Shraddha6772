package Assignments_Strings;
/*
 *  Write a java program to convert given string in lower and uppercase
 */
public class LowerUpperString {

	public static void main(String[] args) {
		
		// Method 1

		String str1 = "HelLo WorlD";

		System.out.println("\nString in Lower Case");
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) >= 65 && str1.charAt(i) <= 90) {
				char c = (char) (str1.charAt(i) + 32);
				System.out.print(c);
			} else {
				char c = (char) (str1.charAt(i));
				System.out.print(c);
			}
		}

		System.out.println("\n--------------------------------------------");
		System.out.println("\nString in Upper Case");
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) >= 97 && str1.charAt(i) <= 122) {
				char c = (char) (str1.charAt(i) - 32);
				System.out.print(c);
			} else {
				char c = (char) (str1.charAt(i));
				System.out.print(c);
			}
		}
		
		/*
		 * Method 2
		 * 
		 * String s = new String("ChuNky SalSa");
		 * 
		 * System.out.println("String in Lower Case : \n"+s.toLowerCase());
		 * System.out.println("-----------------------------------------");
		 * System.out.println("String in Upper Case : \n"+s.toUpperCase());
		 */

	}

}
