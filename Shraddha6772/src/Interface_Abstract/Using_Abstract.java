package Interface_Abstract;

abstract class ABC
{
	int a;
	
	ABC()
	{
		System.out.println("in Abstract Constructor ");
	}
	
	public int cal(int a, int b)
	{
		return a*b;
	}
	
	abstract void show(); // Abstract class
	
}


public class Using_Abstract extends ABC{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Using_Abstract ul = new Using_Abstract();
		
		int c = ul.cal(9,7);
		System.out.println("Multiplication is " + c);
		ul.show();
		
		
	}
	void show()
	{
		System.out.println("This is abstrat Method ");
	}

}
