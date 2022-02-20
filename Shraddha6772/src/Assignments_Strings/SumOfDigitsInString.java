package Assignments_Strings;

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
	
		System.out.println(add+Integer.parseInt(s1));
		
	}

}
