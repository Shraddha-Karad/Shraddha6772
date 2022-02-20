package Assignments_Array;
import java.util.Scanner;
public class SecondGreatestElementInArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many elements you want to strore in Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++){
			System.out.println("Enter the "+i+"th Element : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("------------------------------------------------------");
		System.out.println("Entered Array is : ");
		
		for(int i = 0; i < n; i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\n------------------------------------------------------");
		
		for(int i = 0; i < n; i++)
		{
			for(int j=i+1; j<n;j++)
			{
				int temp=0;
				if(arr[i] < arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
				
		}
		
		for(int i = 0; i<n; i++){
			
			if(arr[i]==arr[i+1])
			{
				System.out.println("Second Greatest Element is : "+arr[i+2]);
				break;
			}
			else{
				
				System.out.println("Second Greatest Element is : "+arr[1]);
				break;
			}
		}
		sc.close();
		
	}
	
}
