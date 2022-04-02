package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Student student1 = (Student) context.getBean("Stud1");
		System.out.println(student1);

		Student student2 = (Student) context.getBean("Stud2");
		System.out.println(student2);

		Student student3 = (Student) context.getBean("Stud3");
		System.out.println(student3);
		
	}

}
