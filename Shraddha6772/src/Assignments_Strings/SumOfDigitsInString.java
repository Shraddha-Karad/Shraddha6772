package Assignments_Strings;
/*
 *  Write a Java program to calculate the sum of the numbers appear in a given string. 

Sample Output:

The given string is: it 15 is25 a 20string
The sum of numbers in the string is: 60

 */
public class SumOfDigitsInString {

	public static void main(String[] args) {

		String str = "its10for30s";
		String s1 ="0";
		int add = 0;
		
		for(int i = 0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if(Character.isDigit(ch))
			{
				s1 = s1 + ch;
			}
			else{
				add=add+Integer.parseInt(s1);
				s1 = "0";
			}
		}
	
		System.out.println("The Sum of numbers in the String is : "+(add+Integer.parseInt(s1)));
		
	}

}
