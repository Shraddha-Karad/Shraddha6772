package Assignments_Array;

import java.util.Scanner;

public class GreatestElementInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements tou want to store in array");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++){
			System.out.println("Enter the "+i+"th Element : ");
			arr[i] = sc.nextInt();
		}
		
		int temp=0;
		for(int i = 0; i < n; i++){
			for(int j=0; j<n-1; j++){
				
				if(arr[j] > arr[j+1]){
					temp = arr[j];
				}
				else if(arr[j+1]>temp){
					temp=arr[j+1];
				}
			}
			
		}
		
		System.out.println("The Greatest Element in goven array is : "+temp);
	
		sc.close();
	}

	
}
