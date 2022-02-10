package OOPS;

import java.util.Scanner;

class A1
{
	
	int studId;
	String name;
	Scanner sc = new Scanner(System.in);
	
	public void input1(){
		
		System.out.println("Enter the Studdent Id : ");
		studId = sc.nextInt();
		System.out.println("Enter the Student Name : ");
		name = sc.next();
		
		System.out.println();
	}
	
	public void show1()
	{
		
		System.out.println("Id  : "+ studId);
		System.out.println("Name : "+ name);
		
		System.out.println();
	}
	
}

class B1 extends A1{
	
	String Address, Qualification;
	Scanner sc = new Scanner(System.in);
	
	public void input2(){
		
		
		System.out.println("Enter the Adress : ");
		Address = sc.next();
		System.out.println("Enter the Qualificatoin : ");
		Qualification = sc.next();
		
		System.out.println();
		
	}
	
	public void show2()
	{
		System.out.println("Adress : "+Address);
		System.out.println("Qualification : "+ Qualification);
		
		System.out.println();
	}
	
}
public class SingleInheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		B1 obj = new B1();
		
		obj.input1();
		obj.input2();
		
		
		obj.show1();
		obj.show2();
		
		
		
	}

}
