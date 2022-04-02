package map.criteriaDemo;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class EmployeeCriteria {

	@Id
	private int Id;
	@Column
	private String Name;
	@Column
	private String Salary;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + "]";
	}

	public EmployeeCriteria(int id, String name, String salary) {
		super();
		Id = id;
		Name = name;
		Salary = salary;
	}

	public EmployeeCriteria() {
		super();
		// TODO Auto-generated constructor stub
	}

}
