package Assignments_Strings;

public class FrequencyOfCharacters {

	public static void main(String[] args) {

		String s1 = "welocme in Edubridge family";
		int[] cnt = new int[s1.length()];
		
		char[] ch = s1.toCharArray();
		
		for(int i = 0; i < s1.length(); i++)
		{
			cnt[i]=1;
			
			for(int j = i+1;j<s1.length();j++)
			{
				if(ch[i]==ch[j])
				{
					cnt[i]++;
					ch[j]='0';
				}
			}
			
		}
		
		for(int i=0;i<cnt.length;i++)
		{
			if(ch[i] !=' ' && ch[i]!='0')
			{
				System.out.println(ch[i]+"="+cnt[i]);
			}
		}
	}

}
