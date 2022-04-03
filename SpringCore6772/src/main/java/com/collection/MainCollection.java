package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCollection {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/collection/configcollection.xml");
		
		Employee emp = (Employee) context.getBean("employee");
		
//		System.out.println(emp);

		System.out.println(emp.getEmpId());
		System.out.println(emp.getHobbies());
		System.out.println(emp.getContacts());
		System.out.println(emp.getMobile());
	}
}
