package ExceptionHandling;

class ThrowDemo2 extends Exception {
	String str1;

	ThrowDemo2(String str2) {
		str1 = str2;
	}

	public String toString() {
		return ("MyException Occurred: " + str1);
	}
}

class Example1 {

	public static void main(String args[]) {
		try 
		{
			System.out.println("Starting of try block");
			throw new ThrowDemo2("This is My error Message");
		}
		catch (ThrowDemo2 exp) 
		{
			System.out.println("Catch Block");
			System.out.println(exp);
		}
	}
}