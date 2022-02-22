package Array;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many elements you want ? ");
		
		int n = sc.nextInt();
		int array[] = new int[n];
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.println("enter the " + i+ "th element");
			array[i] = sc.nextInt();
		}
		
		System.out.println("\nEntered Elements are ");
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]+"\t");
		}
		
	}
	
}
