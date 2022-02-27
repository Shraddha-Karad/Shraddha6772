package Assignments_Collection;

class Test {
	
	
	public static void main(String[] args) {
		EmployeeDB empDb = new EmployeeDB();
		
		Employee emp1 = new Employee(101, "Shrads",'F', 85000);
		Employee emp2 = new Employee(102, "Barry", 'M', 70000);
		Employee emp3 = new Employee(103, "Harry", 'M', 750000);
		Employee emp4 = new Employee(104, "Siya",  'F', 80000);
		
	
		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		empDb.addEmployee(emp4);

		System.out.println("Displaying Employee Redords : ");
		for (Employee emp : empDb.listAll())
			System.out.println(emp.displayEmp());
		
		System.out.println();
		empDb.deleteEmployee(104);
		
		System.out.println("After Removing 104 employee Record : ");
		
		for (Employee emp : empDb.listAll())
			System.out.println(emp.displayEmp());
		
		System.out.println();
		
		System.out.println(empDb.showPaySlip(103));
	}
}