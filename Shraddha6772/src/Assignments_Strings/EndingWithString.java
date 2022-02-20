package Assignments_Strings;

public class EndingWithString {

	public static void main(String[] args) {

		String str = "munmun on the moon";
		int cnt = 0;
		
		String str1[] = str.split(" ");
		
		for(int i=0; i<str1.length;i++)
		{
			if(str1[i].endsWith("m") || str1[i].endsWith("n"))
			{
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
