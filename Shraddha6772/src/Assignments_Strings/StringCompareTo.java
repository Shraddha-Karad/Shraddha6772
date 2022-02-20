package Assignments_Strings;

public class StringCompareTo {

	public static void main(String[] args) {

		String s1 = "Hocus Pocus";
		String s2 = "Hocus Pocus";
		
		if(s1.compareToIgnoreCase(s2) < 0)
		{
			System.out.println(s1+" is less than "+s2);
		}
		else if(s1.compareToIgnoreCase(s2) == 0)
		{
			System.out.println(s1+" is equal to "+s2);
		}
		else if(s1.compareToIgnoreCase(s2) > 0)
		{
			System.out.println(s1+" is greater than "+s2);
		}
	}

}
