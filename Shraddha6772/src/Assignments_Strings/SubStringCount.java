package Assignments_Strings;

public class SubStringCount {

	public static void main(String[] args) {

		String s1 = "liveonwildlife";
		
		System.out.println("Count is : "+((s1.split("life",-1).length)-1));
		
	
	}

}
