package Assignments_Strings;

import java.util.Scanner;

/*
 * Wap to check string is palindrome or not like “madam”
 */
public class PallindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check whether iy is pallindrome or Not");
		
		String str1  =sc.next();
		String str2="";
		
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
