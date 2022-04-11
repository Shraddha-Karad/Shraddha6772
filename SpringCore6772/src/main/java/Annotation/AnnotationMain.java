package Annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Annotation/annotation.xml");
	
		context.registerShutdownHook();
		
		Employee emp = (Employee) context.getBean("emp");
	}

}
