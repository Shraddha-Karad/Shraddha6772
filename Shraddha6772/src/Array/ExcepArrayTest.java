package Array;

public class ExcepArrayTest {

	public static void main(String args[]) {
		
		try
		{
			int a[] = new int[2];
			System.out.println("Element three :" + a[3]);
		
		} 
		catch (ArrayIndexOutOfBoundsException e) {
		
			System.out.println("Exception msg  :" + e);
		
		}
		
		System.out.println("After Catch block");
	}
}		