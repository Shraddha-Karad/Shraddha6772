package Assignments_Array;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many elements you want to strore in Array : ");
		int n = sc.nextInt();
		int[] actual = new int[n];
		int[] copy = new int[n];
		
		for(int i=0; i<n; i++){
			System.out.println("Enter the "+i+"th Element : ");
			actual[i] = sc.nextInt();
		}
		
		System.out.println("------------------------------------------------------");
		System.out.println("Entered Array is : ");
		
		for(int i = 0; i < n; i++){
			System.out.print(actual[i]+"\t");
		}
		
		System.out.println("\n------------------------------------------------------");
		for(int i=0;i<n;i++){
			
			copy[i] = actual[i];
			
		}
		
		System.out.println("\nCopied Array is : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(copy[i]+"\t");
		}
		
		System.out.println("\n------------------------------------------------------");
		System.out.println("\nActualArray copied into CopyArray Successfully !");
	}
	
	
	//Method 2
	
	/*
	  System.out.println(arr1,0,arr2,0,arr1.length);
	 
	 */
	
	
	

}
