package Assignments_Strings;
import java.util.Arrays;

/*
  Write a Java program to print after removing duplicates from a given string. 
  
 */
public class RemoveDupliccate {

	public static void main(String[] args) {
		String str1 = "welltowell";
		System.out.println("The given string is: " + str1);
		System.out.println("After removing duplicates "
				+ "characters the new string is: " + removeDuplicateChars(str1));
	}

	private static String removeDuplicateChars(String str2) {
		char[] arr1 = str2.toCharArray();
		String targetStr = " ";
		for (char value : arr1) {
			if (targetStr.indexOf(value) == -1) {
				targetStr += value;
			}
		}
		return targetStr;
	}
}
