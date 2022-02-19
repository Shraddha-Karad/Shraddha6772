package Assignments;
import java.util.Scanner;
/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many elements you want to strore in Array : ");
		int n = sc.nextInt();
*/

public class AverageOfArrayElements {

	public static void main(String[] args) {

		//int[] arr = {4,5,6,7,3};
				
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many elements you want to strore in Array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println();
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter the "+i+"th Element");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		float avg = 0.0f;
		
		for(int i = 0; i < n; i++)
		{
			sum = sum + arr[i];
		}
		System.out.println();

		avg = sum/n;
		System.out.println("The Average of an elements entered in Array is : "+avg);
		
		
		sc.close();
	}

}
