package Assignments_Array;
/*Write a Java Program to reverse the array contents. [Solution: Program: Java Code to Reverse an int Array]
*/

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many elements you want to strore in Array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			System.out.print("Enter the "+i+"th Element : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Reversed Array : ");
		
		for(int i=n-1; i>=0; i--){
			System.out.print(arr[i]+"  ");
		}
		
	}

}
