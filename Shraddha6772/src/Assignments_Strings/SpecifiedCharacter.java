package Assignments_Strings;
/*
 Write a Java program to check whether the character immediately before and after a specified character is same in a given string. 
 Sample Output:
 The given string is: moon#night
 The before and after character are same: true

 */
public class SpecifiedCharacter {

	public boolean leftAndRightSame(String stng) 
	{
	  int l = stng.length();
	  boolean found = true;
	  for (int i = 0; i < l; i++) 
	  {
	    String tmpString = stng.substring(i,i+1);
	    if (tmpString.equals("#") && i > 0 && i < l-1) 
		{
	      if (stng.charAt(i-1) == stng.charAt(i+1))
	        found = true;
	      else
	        found = false;
	    }
	  }
	  return found;
	}
	public static void main (String[] args)
	    {
	      SpecifiedCharacter m= new SpecifiedCharacter();
	      String str1 =  "moon#night";
	      System.out.println("The given string is: "+str1);
	      System.out.println("The before and after character are same: "+m.leftAndRightSame(str1));
		  }
	}
	

	
	
	
	
	/*
	public static void main(String[] args) {

		String s1 = "moon@night";
		String[] s2 = s1.split("@");
		
//		for(int i = 0; i<s1.length();i++)
//		{
//			if(!(s1.charAt(i) == '@'))
//			{
//				s2 = s2+s1;
//			}
//			else
//				break;
//		}
		System.out.println(s2);
		
		
	}

}
*/