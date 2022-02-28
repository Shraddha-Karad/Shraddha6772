package Assignments_Array;
/*Write a Java Program to remove a particular element from an array. 
 * [Solution : Program : Remove an Element from int Array in Java]
 */

import java.util.Arrays;
import java.util.Scanner;

public class RemoveArrayElement {


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
		
		System.out.println("Enter the Element to remove from Array : ");
		int n1 = sc.nextInt();
		
		for(int i=n1; i<n-1; i++)
		{
			arr[i] = arr[i]+1;
		}
		
		System.out.println("Array after removing the enterred element : ");
		for(int i =0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
