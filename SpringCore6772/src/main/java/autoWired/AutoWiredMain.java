package autoWired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiredMain {

	public static void main(String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("autoWired/autowired.xml");
		
		Person person = context.getBean(Person.class,"person");

		System.out.println(person);
	}
	
	
	
}
