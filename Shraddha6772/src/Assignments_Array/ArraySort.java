package Assignments_Array;
import java.util.Arrays;
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
		
		for(int i=0; i<n; i++){
			System.out.println("Enter the "+i+"th Element : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++)
		{
			for(int j=i+1; j<n;j++)
			{
				int temp=0;
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("\n ------Sorted Array------ ");
		for(int k =0; k<n; k++)
		{
			System.out.print(arr[k]+"\t");
		}
		
		//Method 2
		//Arrays.sort(arr);
		
		sc.close();
		
	}

}
