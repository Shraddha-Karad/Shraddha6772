package Assignments_Strings;

public class SubStringCount {

	public static void main(String[] args) {

		String s1 = "liveonlifewildlife";
		
		int count = (s1.split("life",-1).length)-1;
		
		System.out.println("count is : "+count);
	
	
	}

}
