package OOPS;

public class SimpleDemo{

	public void Demo(){
		System.out.println("Welcome to Java");
	}

	public int add(int a, int b)
	{
		return a+b;
	}

	public static void show(int side)
	{
		int area = side*side;
		System.out.println("Area is :" + area);
	}

	public static void main(String[] args){

		SimpleDemo s=new SimpleDemo();
		s.Demo();
	
		System.out.println("Addition is : "+ s.add(4,5));
	
		SimpleDemo.show(5);


	}
}
