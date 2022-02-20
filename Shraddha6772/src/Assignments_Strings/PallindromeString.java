package Assignments_Strings;

public class PallindromeString {

	public static void main(String[] args) {

		
		String str1  ="madam", str2="";
		
		for(int i=str1.length()-1; i>=0;i--){
			
			str2 += str1.charAt(i);
		}
		
		if(str1.equals(str2))
		{
			System.out.println("Its Pallindrom !");
		}
		else{
			System.out.println("It's not pallindrom !");
		}
		
		
	}

}
