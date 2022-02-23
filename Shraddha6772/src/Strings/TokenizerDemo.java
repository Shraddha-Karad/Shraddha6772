package Strings;
import java.util.StringTokenizer;

public class TokenizerDemo {

	public static void main(String args[])
		{
		System.out.println("Using Constructor 1 - ");

		StringTokenizer str1 = new StringTokenizer("Hello Geeks How are you", " ");
		while (str1.hasMoreTokens())
		{
		System.out.println(str1.nextToken());
		}
		System.out.println("Using Constructor 2 - ");

		StringTokenizer str2 = new StringTokenizer("JAVA : Code : String", ":");
		while (str2.hasMoreTokens())
		{

		System.out.println(str2.nextToken());

		} System.out.println("Using Constructor 3 - ");

		StringTokenizer str3 = new StringTokenizer("JAVA : Code : String",":", true);

		while (str3.hasMoreTokens())
		{

		System.out.println(str3.nextToken());

		}

		}
}