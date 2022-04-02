package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class M2MMain 
{

	public static void main(String[] args) 
	{

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = (SessionFactory) configuration.buildSessionFactory();
		Session session = ((org.hibernate.SessionFactory) factory).openSession();
		Transaction tx = session.beginTransaction();

		Employee employee1 = new Employee();
		employee1.setEmpId(1);
		employee1.setEmpName("Shraddha");

		Employee employee2 = new Employee();
		employee1.setEmpId(2);
		employee1.setEmpName("Shivani");

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(employee1);
		empList.add(employee2);

		Project project1 = new Project();

		project1.setProjectId(111);
		project1.setProjectName("Java");
		project1.setEmployee(empList);

		Project project2 = new Project();
		project2.setProjectId(222);
		project2.setProjectName(".NET");
		project2.setEmployee(empList);

		List<Project> projectList = new ArrayList<Project>();

		projectList.add(project1);
		projectList.add(project2);

		employee1.setProject(projectList);
		employee2.setProject(projectList);

		session.saveOrUpdate(employee1);
		session.saveOrUpdate(employee2);

		tx.commit();
	}

}
