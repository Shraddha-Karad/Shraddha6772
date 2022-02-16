package ExceptionHandling;

class MyException2 extends Exception {

	public MyException2(String msg)
	{
		super(msg);
		
	}
	
}
class Shraddha extends Exception{
	public Shraddha(String msg){
		super(msg);
	}
}

public class MyException{

	int age;
	public void checkAge(int age) throws MyException2{
		
		if(age < 0)
		{
			MyException2 m = new MyException2("Age must be greater than zero");
			throw m;
		}
		else{
			System.out.println("Age is greater than zero");
		}
	}
	
	public void checkName(String nm) throws Shraddha{
		if(nm != "Shraddha")
		{
			throw new Shraddha("name should be Shraddha");
		}
		else{
			System.out.println("Name is right");
		}
	}
	public static void main(String[] args) {
		
		MyException obj = new MyException();
		try{
			obj.checkAge(22);
			obj.checkName("Shraddha");
		}
		catch(Exception e)
		{	
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
