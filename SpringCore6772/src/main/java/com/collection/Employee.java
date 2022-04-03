package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int empId;
	private List<String> hobbies;
	private Set<String> contacts;
	private Map<String, Double> mobile;

	private Address address;

	public Employee() {
		super();
	}

	public Employee(int empId, List<String> hobbies, Set<String> contacts, Map<String, Double> mobile,
			Address address) {
		super();
		this.empId = empId;
		this.hobbies = hobbies;
		this.contacts = contacts;
		this.mobile = mobile;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", hobbies=" + hobbies + ", contacts=" + contacts + ", mobile=" + mobile
				+ ", address=" + address + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public Set<String> getContacts() {
		return contacts;
	}

	public void setContacts(Set<String> contacts) {
		this.contacts = contacts;
	}

	public Map<String, Double> getMobile() {
		return mobile;
	}

	public void setMobile(Map<String, Double> mobile) {
		this.mobile = mobile;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
