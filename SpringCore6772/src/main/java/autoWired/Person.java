package autoWired;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	private int pId;
	private String pName;
	private int age;

	@Autowired
	Address address;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int pId, String pName, int age) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.age = age;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", age=" + age + "]";
	}
	
	
	
	
}
