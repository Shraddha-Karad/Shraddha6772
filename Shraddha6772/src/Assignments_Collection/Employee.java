package Assignments_Collection;

/*
 Create an Employee class with the related attributes and
 behavior. Create one more class EmployeeDB which has the
 following methods. a. boolean addEmployee(Employee e) b.
 boolean deleteEmployee(int eCode) c. String showPaySlip(int
  eCode) d. Employee[] listAll() Use an ArrayList which will be
 used to store the employees and use enumeration/iterator to
 process the employees. Write a Test Program to test that all
 functionalities are operational.
*/

class Employee{
	
	private int eCode; 
	private String eName;
	private char eGender;
	private double eSalary;
	
	
	public String displayEmp(){
		
		return "Employee [eCode=" + eCode + ", eName=" + eName + ", eGender="
				+ eGender + ", eSalary=" + eSalary + "]";
	}
	
	
	public Employee(int eCode, String eName, char eGender, double eSalary) {
		super();
		this.eCode = eCode;
		this.eName = eName;
		this.eGender = eGender;
		this.eSalary = eSalary;
	}
	
	
	
	public int geteCode() {
		return eCode;
	}
	public void seteCode(int empId) {
		eCode = empId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String empName) {
		eName = empName;
	}
	public char geteGender() {
		return eGender;
	}
	public void seteGender(char eGender) {
		this.eGender = eGender;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(float eSalary) {
		this.eSalary = eSalary;
	}
	
	
	
}
