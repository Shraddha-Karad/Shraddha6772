package Assignments_Collection;

import java.util.Iterator;
import java.util.Vector;

/*
 Write a program that will have a Vector which is capable of
 storing emp objects. Use an Iterator and enumeration to list
 all the elements of the Vector.

 */
class EmployeeDetails {
	public int id = 0;
	public String name = null;
	String address = null;
	double salary = 0.0;

	public String toString() {
		return "\nEmp [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	public EmployeeDetails(int id, String name, String address, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
}

public class QueA8 {

	public static void main(String[] args) {

		Vector<EmployeeDetails> v = new Vector<EmployeeDetails>();
		EmployeeDetails emp1 = new EmployeeDetails(101, "Shrads", "Pune", 85000);
		EmployeeDetails emp2 = new EmployeeDetails(102, "Barry", "Mumbai", 70000);
		EmployeeDetails emp3 = new EmployeeDetails(103, "Harry", "Nashik", 750000);
		EmployeeDetails emp4 = new EmployeeDetails(104, "Siya", "Nagpur", 80000);

		v.add(emp1);
		v.add(emp2);
		v.add(emp3);
		v.add(emp4);

		System.out.println(v.toString());

		Iterator<EmployeeDetails> it = v.iterator();

		while (it.hasNext()) {
			EmployeeDetails emp = it.next();
		}
		
		// System.out.println(al.contains(emp.getId()));

	}
}
