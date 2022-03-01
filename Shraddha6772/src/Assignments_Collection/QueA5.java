package Assignments_Collection;
import java.util.ArrayList;
import java.util.Iterator;

/*
 Create an ArrayList of Employee( id,name,address,sal) objects
 and search for particular Employee object based on id number.
 */
class Employee1 {
	public int id = 0;
	public String name = null;
	String address = null;
	double salary = 0.0;

	public String toString() {
		return "\nEmp [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	public Employee1(int id, String name, String address, double salary) {
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

public class QueA5 {

	public static void main(String[] args) {

		ArrayList<Employee1> al = new ArrayList<Employee1>();

		Employee1 emp1 = new Employee1(101, "Shrads", "Pune", 85000);
		Employee1 emp2 = new Employee1(102, "Barry", "Mumbai", 70000);
		Employee1 emp3 = new Employee1(103, "Harry", "Nashik", 750000);
		Employee1 emp4 = new Employee1(104, "Siya", "Nagpur", 80000);

		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);

		System.out.println(al.toString());

		Iterator<Employee1> it = al.iterator();
		int searchId = 102;

		while (it.hasNext()) {
			Employee1 emp = it.next();
			if (emp.getId() == searchId) {
				System.out.println(emp);
				System.out.println("employee id " + searchId + " present in the List !");
			}

		}

		// System.out.println(al.contains(emp.getId()));

	}
}
