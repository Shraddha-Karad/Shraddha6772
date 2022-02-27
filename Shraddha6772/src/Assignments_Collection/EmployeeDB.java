package Assignments_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


class EmployeeDB {
		
	List<Employee> emp = new ArrayList<>();
	
	boolean addEmployee(Employee e)
	{
		
		return emp.add(e);
	}
		
	boolean deleteEmployee(int eCode)
	{
		boolean status = false;
		
		Iterator<Employee> it = emp.iterator();
		
		while (it.hasNext()) {
			
			Employee emp = it.next();
			
			if (emp.geteCode() == eCode) 
			{
				status = true;
				it.remove();
			}
		}
		
		return status;
	}
		
	String showPaySlip(int eCode)
	{
		String paySlip ="Invalid employee Code";
		
		for(Employee e : emp)
		{
			if(e.geteCode() == eCode)
			{
				paySlip = "Pay slip for employee id " + eCode + " is " +
						e.geteSalary();
				
			}
			
		}
		return paySlip;
	}
	
	public Employee[] listAll() {
		Employee[] eArray = new Employee[emp.size()];
		for (int i = 0; i < emp.size(); i++)
			eArray[i] = emp.get(i);
		return eArray;
	}
}

	
	















	
	
	
	
	
	
	
/*	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many no of employee you want to store : ");
		int input = sc.nextInt();
		
		int eCode = 0;
		String eName = null;
		char eGender = '\t';
		double eSalary = 0.0;
		
		for(int i = 0; i<input; i++)
		{
			System.out.println("Enter the Employee Id : ");
			eCode = sc.nextInt();
			
			System.out.println("Enter the Employee Name : ");
			eName = sc.next();
			
			System.out.println("Enter the Employee Gender : ");
			eGender = sc.next().charAt(0);
			
			System.out.println("Enter the Employee Salary : ");
			eSalary = sc.nextDouble();
		
			
		}
		
		List<Employee> emp = new ArrayList<>();
		
//		Employee e = new Employee(eCode,eName,eGender,eSalary);
//		emp.add(e);
		
		EmployeeDB db = new EmployeeDB();
		
		Employee emp1 = new Employee(101, "Bob", 'M', 25000);
		Employee emp2 = new Employee(102, "Alice",  'F', 30000);
		Employee emp3 = new Employee(103, "John",  'M', 20000);
		Employee emp4 = new Employee(104, "Ram", 'M', 50000);
		
		db.addEmployee(emp1);
		db.addEmployee(emp2);
		db.addEmployee(emp3);
		db.addEmployee(emp4);
		
		db.deleteEmployee(eCode);
		db.showPaySlip(eCode);
		
		
		
	}
	
}
	*/


