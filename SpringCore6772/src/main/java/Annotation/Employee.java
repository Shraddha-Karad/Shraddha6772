package Annotation;

import javax.annotation.*;
public class Employee {

	private int eId;
	private String eName;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + "]";
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	
	@PostConstruct
	public void init(){
		System.out.println("init Method");
	}

	@PreDestroy
	public void destroy(){
		System.out.println("Destroy method");
	}
	
	
}

