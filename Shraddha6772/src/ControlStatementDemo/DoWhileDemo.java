package ControlStatementDemo;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int sum = 0;

		do
		{
			sum = sum + i;
			i++;
		}while (i<=10);
		
		System.out.println("\n\n\tThe sum of 1 to 10 is .. " + sum);
		}
		

}
