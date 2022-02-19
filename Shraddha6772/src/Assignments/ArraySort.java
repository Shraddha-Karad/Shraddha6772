package Assignments;
import java.util.Scanner;
/*Create a Java Program to Sort an Array of Numeric or String Data. 
 [Solution : Program : Sort an Array in Java]
 */

public class ArraySort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many elements you want to strore in Array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int temp;
		
		for(int i = 0; i < 5; i++)
		{
			for(int j=0; j<4-i;j++)
			{
				if(arr[j] < arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
				
		}
		
		for(int k =0; k<5; k++)
		{
			System.out.println(arr[k]);
		}
		
		
		sc.close();
		
	}

}
