package Assignments_Array;
import java.util.Scanner;
/*
 * Write a menu driven Java program with following option 
a. Accept elements of an array 
b. Display elements of an array 
c. Search the element within array given by user
d. Sort the array using bubble sort method 
Write methods for all options. The methods should be static and have one parameter name of the array.

 */
public class MenuDriven {
	public static void Accept(int arr[], int n) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the " + i + "th Element : ");
			arr[i] = sc.nextInt();
		}
	}

	public static void Display(int arr[]) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("]");
	}

	public static boolean Search(int arr[], int s) {
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == s) {
				flag = true;
				break;
			}
		}
		return flag;

	}

	public static void Sort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many elements tou want to store in array");
		int n = sc.nextInt();

		int arr[] = new int[n];
		boolean status = false;

		Accept(arr, n);
		System.out.println("----------------------------------------------------------");

		System.out.println("Your Choices : \n\n1.Display Array  \n2.Search an Element in Array  \n3.Sort an Array  \n");
		System.out.println("----------------------------------------------------------");

		System.out.println("Enter You Choice : ");
		int c = sc.nextInt();

		System.out.println();
		switch (c) {
		case 1:
			System.out.println("Displaying the Array :\n");
			Display(arr);
			System.out.println("\n----------------------------------------------------------");
			break;

		case 2:
			System.out.println("Enter element to search in array");
			int a = sc.nextInt();

			status = Search(arr, a);

			if (status == true)
				System.out.println("\nThe Entered Element is Present in Array !");
			else
				System.out.println("\nThe Entered Element is Not Present in Array !");

			System.out.println("\n----------------------------------------------------------");
			break;

		case 3:
			Sort(arr);
			Display(arr);
			System.out.println("Array Sorted Successfully !");
			break;

		default:
			System.out.println("You Entered Invalid Choice ! ");
		}
	}

}