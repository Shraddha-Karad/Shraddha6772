package citeria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentCriteria {

	@Id
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private int age;
	
	public StudentCriteria(int id, String name, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentCriteria [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public StudentCriteria() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
