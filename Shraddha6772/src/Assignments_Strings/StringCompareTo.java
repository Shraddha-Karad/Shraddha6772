package Assignments_Strings;
/*
 *  Write a Java program to compare two strings lexicographically, ignoring case differences2. 
 */
public class StringCompareTo {

	public static void main(String[] args) {

		String s1 = "Hocus Pocus";
		String s2 = "pocus hocus";

		if(s1.compareToIgnoreCase(s2) < 0)
		{
			System.out.println(s1+" is less than "+s2);
		}
		if(s1.compareToIgnoreCase(s2) == 0)
		{
			System.out.println(s1+" is equal to "+s2);
		}
		if(s1.compareToIgnoreCase(s2) > 0)
		{
			System.out.println(s1+" is greater than "+s2);
		}
	}

}
