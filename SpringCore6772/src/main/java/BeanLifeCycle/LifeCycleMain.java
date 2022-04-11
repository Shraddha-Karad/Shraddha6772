package BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycle/LifeCycle.xml");
		
		context.registerShutdownHook();
		
		Student student = (Student) context.getBean("student");
		
		System.out.println(student);
	}

}
