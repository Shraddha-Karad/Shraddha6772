package Assignments_Strings;

import java.util.Scanner;

/*
 * Write a Java program to count the number of words ending in 'm' or 'n' 
 * (not case sensitive) in a given text.

Sample Output:

The given string is: mam is in the room
The number of words ends eith m or n is: 3

 */
public class EndingWithString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		int cnt = 0;
		
		String str1[] = str.split(" ");
		
		for(int i=0; i<str1.length;i++)
		{
			if(str1[i].endsWith("m") || str1[i].endsWith("n"))
			{
				cnt++;
			}
		}
		
		System.out.println("The given String is : "+str);
		System.out.println("The number of words ends with m or n is : "+cnt);
	}

}
