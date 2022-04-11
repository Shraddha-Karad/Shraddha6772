package Array;

public class PassingArrayAsArgument {

	// method to print an array, taking array as an argument
	private static void printArray(int[] arr) 
	{
		System.out.println("Array contents printed through method:");
		// print individual elements of array using enhanced for loop
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int[] intArray = { 10, 20, 30, 40, 50, 60, 70, 80 };

		// call printArray method by passing intArray as an argument
		printArray(intArray); 

	}
}		
