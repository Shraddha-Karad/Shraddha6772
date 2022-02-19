package Assignments;

import java.util.Scanner;

/*Write a Java Program to check if see if Array contains a specific value. 
 [Solution: Program : To check if Array contains an specific element. (Primitive value)]
*/

public class ArrayContainsSpecificElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many elements you want to store in Array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println();
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter the "+i+"th Element");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter an element to check whether array contains in it : ");
		int n1 = sc.nextInt();
		boolean flag = false;
		
		for(int i=0; i<n; i++){
			
			if(n1 == arr[i]){
				flag = true ;
			}
		}
		System.out.println();
		
		if(flag == true)
		{
			System.out.println("Array contain the Entered Element :) ");
		}
		else{
			System.out.println("Array does not contain the Entered Element :( ");
		}
	}

}
