package Assignments_Strings;
/*
 * Write a Java program to count how many times the substring 'life' present at 
 * anywhere in a given string. 

Sample Output:

The given string is: liveonwildlife
appear number of times: 1

 */
public class SubStringCount {

	public static void main(String[] args) {

		String s1 = "livelifeonwildlife";
		
		System.out.println("Appear No of Times : "+((s1.split("life",-1).length)-1));
		
	
	}

}
