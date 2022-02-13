package Interface_Abstract;

// Inheritance achieved by using Default

class AAA{
	public void display()
	{
		
		System.out.println("This is Class method");
	}
}

interface StudInfo
{
	
	public default void display()
	{
		int r = 1;
		String name = "Rita";
		System.out.println("This is Interface Method ");
	}
}


public class UsingDefault extends AAA implements StudInfo{

	public void display()
	{
		super.display();  // AAA class
		StudInfo.super.display(); // Interface
		
		int r = 1;
		String name = "Rita";
		
		System.out.println("Student roll no : "+r+"\nStudent Name  : "+name);
		StudInfo.super.display();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	UsingDefault ul = new UsingDefault();
	ul.display();
		
	}

}
