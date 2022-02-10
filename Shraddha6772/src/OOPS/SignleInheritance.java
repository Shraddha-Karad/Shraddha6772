package OOPS;

class Sem1{
	
	private int math, eng, science;
	public void input1()
	{
		math = 55;
		eng = 60;
		science = 70;
	}
	
	
	public void output1()
	{
		System.out.println("---------------------------------Semester1------------------------------");
		System.out.println("Marks in Mathemathics : "+ math);
		System.out.println("Marks in Englishs : "+ eng);
		System.out.println("Marks in Science : "+ science);
		
	}
		
}

class Sem2 extends Sem1{
	
	private int c, cpp, java;
	public void input2()
	{
		c = 66;
		cpp = 77;
		java = 99;
	}
	
	public void output2()
	{
		System.out.println("---------------------------------Semester2------------------------------");
		System.out.println("Marks in C lang : "+ c);
		System.out.println("Marks in Cpp lang :  "+ cpp);
		System.out.println("Marks in Java Lang : "+ java);
		
	}
		
}

class Sem3 extends Sem2{
	
	private int OS, DS, DB;
	
	public void input3()
	{
		OS = 55;
		DS = 60;
		DB = 70;
	}
	
	public void output3()
	{
		System.out.println("---------------------------------Semester3------------------------------");
		System.out.println("Marks in Operating System : "+ OS);
		System.out.println("Marks in DataStructure : "+ DS);
		System.out.println("Marks in Database : "+ DB);
		
	}
		
}

public class SignleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sem3 obj = new Sem3();
		obj.input1();
		obj.input2();
		obj.input3();
		
		obj.output1();
		obj.output2();
		obj.output3();
		

	}

}
