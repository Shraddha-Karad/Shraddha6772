package map.criteriaDemo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class EmployeeMain {

	public static void main(String args[]) {
		System.out.println("Hello World");

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = (SessionFactory) configuration.buildSessionFactory();
		Session session = ((org.hibernate.SessionFactory) factory).openSession();
		

		// -----------Greater than----------------
		Criteria c = session.createCriteria(EmployeeCriteria.class);
		System.out.println("Greater than salary : ");
		c.add(Restrictions.gt("salary", 50000));
		List list = c.list();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
/*
		// -----------Less than----------------
		Criteria c1 = session.createCriteria(Employee.class);
		System.out.println("Less than salary : ");
		c1.add(Restrictions.lt("salary", 80000));
		List list1 = c1.list();
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

		// -----------Between----------------
		Criteria c2 = session.createCriteria(Employee.class);
		System.out.println("Salary Between 20000 to 60000 : ");
		c2.add(Restrictions.between("salary", 20000, 60000));
		List list2 = c2.list();
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}

		// -----------Like----------------
		Criteria c3 = session.createCriteria(Employee.class);
		System.out.println(" salary like 50000: ");
		c3.add(Restrictions.like("salary", 50000));
		List list3 = c3.list();
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}

		// -----------Not Equal----------------
		Criteria c4 = session.createCriteria(Employee.class);
		System.out.println("salary is not eual to 30000 : ");
		c4.add(Restrictions.ne("salary", 30000));
		List list4 = c4.list();
		for (int i = 0; i < list4.size(); i++) {
			System.out.println(list4.get(i));
		}

		// -----------Less than equal----------------
		Criteria c5 = session.createCriteria(Employee.class);
		System.out.println("Less than equal to 40000 : ");
		c5.add(Restrictions.le("salary", 40000));
		List list5 = c5.list();
		for (int i = 0; i < list5.size(); i++) {
			System.out.println(list5.get(i));
		}

		// -----------Name Like----------------
		Criteria c6 = session.createCriteria(Employee.class);
		System.out.println("Employee Name sgould be start with S : ");
		c6.add(Restrictions.like("name", "S%"));
		List list6 = c6.list();
		for (int i = 0; i < list6.size(); i++) {
			System.out.println(list6.get(i));
		}

		// -----------Using Order ClassSorting Ascending----------------
		Criteria c7 = session.createCriteria(Employee.class);
		System.out.println("Salary is in Ascending Order : ");
		c7.addOrder(Order.asc("salary"));
		List list7 = c7.list();
		for (int i = 0; i < list7.size(); i++) {
			System.out.println(list7.get(i));
		}

		// -----------Using Order ClassSorting Descending----------------
		Criteria c8 = session.createCriteria(Employee.class);
		System.out.println("Salary is in descending Order : ");
		c8.addOrder(Order.desc("salary"));
		List list8 = c8.list();
		for (int i = 0; i < list8.size(); i++) {
			System.out.println(list8.get(i));
		}

		// -----------Using Projection Class Performs Agregate Operations----------------
		Criteria c9 = session.createCriteria(Employee.class);
		c9.setProjection(Projections.rowCount());
		List list9 = c9.list();
		for (int i = 0; i < list9.size(); i++) {
			System.out.println(list9.get(i));
		}
		
		Criteria c10 = session.createCriteria(Employee.class);
		c10.setProjection(Projections.avg("salary"));
		List list10 = c10.list();
		for (int i = 0; i < list10.size(); i++) {
			System.out.println(list10.get(i));
		}
		
		Criteria c11 = session.createCriteria(Employee.class);
		c11.setProjection(Projections.max("salary"));
		List list11 = c11.list();
		for (int i = 0; i < list11.size(); i++) {
			System.out.println(list11.get(i));
		}
		
		Criteria c12 = session.createCriteria(Employee.class);
		c12.setProjection(Projections.min("salary"));
		List list12 = c12.list();
		for (int i = 0; i < list12.size(); i++) {
			System.out.println(list12.get(i));
		}

		Criteria c13 = session.createCriteria(Employee.class);
		c13.setProjection(Projections.countDistinct("name"));
		List list13 = c13.list();
		for (int i = 0; i < list13.size(); i++) {
			System.out.println(list13.get(i));
		}*/
		
		Transaction tx = session.beginTransaction();
		
		EmployeeCriteria emp1 = new EmployeeCriteria();
		emp1.setId(11);
		emp1.setName("Shraddha");
		emp1.setSalary("80000");
		
		EmployeeCriteria emp2 = new EmployeeCriteria();
		emp2.setId(22);
		emp2.setName("Shivani");
		emp2.setSalary("60000");
		
		EmployeeCriteria emp3 = new EmployeeCriteria();
		emp3.setId(33);
		emp3.setName("Ramya");
		emp3.setSalary("50000");
		
		EmployeeCriteria emp4 = new EmployeeCriteria();
		emp4.setId(44);
		emp4.setName("Aradhya");
		emp4.setSalary("40000");
		
		EmployeeCriteria emp5 = new EmployeeCriteria();
		emp5.setId(55);
		emp5.setName("Ruee");
		emp5.setSalary("20000");
	
		List<EmployeeCriteria> listEmp = (List<EmployeeCriteria>) new EmployeeCriteria();
		listEmp.add(emp1);
		listEmp.add(emp2);
		listEmp.add(emp3);
		listEmp.add(emp4);
		listEmp.add(emp5);
		

		
		session.saveOrUpdate(emp1);
		session.saveOrUpdate(emp2);
		session.saveOrUpdate(emp3);
		session.saveOrUpdate(emp4);
		session.saveOrUpdate(emp5);
		
		
	
		tx.commit();
	}

}
