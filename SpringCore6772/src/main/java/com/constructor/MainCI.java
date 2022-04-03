package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCI {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/constructor/configci.xml");
		
		Laptop laptop = (Laptop) context.getBean("laptop");
		
		System.out.println(laptop);
	}
	
}
