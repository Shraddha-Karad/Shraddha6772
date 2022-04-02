package citeria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CriteriaMain {

	public static void main(String args[])
	{
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = (SessionFactory) configuration.buildSessionFactory();
		Session session = ((org.hibernate.SessionFactory) factory).openSession();
		Transaction tx = session.beginTransaction();
		
		Criteria cr =  session.createCriteria(StudentCriteria.class);
		cr.add(Restrictions.gt("age",18));
		List list = cr.list();
		for(int i = 0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		Criteria cr1 =  session.createCriteria(StudentCriteria.class);
		cr1.add(Restrictions.lt("age",30));
		List list1 = cr1.list();
		for(int i = 0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		
		Criteria cr2 =  session.createCriteria(StudentCriteria.class);
		cr2.add(Restrictions.between("age",20,30));
		List list2 = cr2.list();
		for(int i = 0;i<list2.size();i++)
		{
			System.out.println(list2.get(i));
		}
		
		
		Criteria cr3 =  session.createCriteria(StudentCriteria.class);
		cr3.add(Restrictions.like("name","S%"));
		List list3 = cr3.list();
		for(int i = 0;i<list3.size();i++)
		{
			System.out.println(list3.get(i));
		}
		
		//-------------------------
		Criteria cr4 =  session.createCriteria(StudentCriteria.class);
		cr4.addOrder(Order.desc("age"));
		List list4 = cr4.list();
		for(int i = 0;i<list4.size();i++)
		{
			System.out.println(list4.get(i));
		}
		
		Criteria cr5 =  session.createCriteria(StudentCriteria.class);
		cr5.setProjection(Projections.min("age"));
		List list5 = cr5.list();
		for(int i = 0;i<list5.size();i++)
		{
			System.out.println("Minimum age is :" +list5);
		}
		
		Criteria cr6 =  session.createCriteria(StudentCriteria.class);
		cr6.setProjection(Projections.max("age"));
		List list6 = cr6.list();
		for(int i = 0;i<list6.size();i++)
		{
			System.out.println("Maximum age is : "+list6);
		}
		
		
		
		
		StudentCriteria sc1 = new StudentCriteria();
		sc1.setId(101);
		sc1.setName("Shraddha");
		sc1.setEmail("shraddha@gmail.com");
		sc1.setAge(22);
		
		StudentCriteria sc2 = new StudentCriteria();
		sc2.setId(102);
		sc2.setName("Shivani");
		sc2.setEmail("shivani@gmail.com");
		sc2.setAge(21);
		
		StudentCriteria sc3 = new StudentCriteria();
		sc3.setId(103);
		sc3.setName("Lavanya");
		sc3.setEmail("lavanya@gmail.com");
		sc3.setAge(26);
		
		StudentCriteria sc4 = new StudentCriteria();
		sc4.setId(104);
		sc4.setName("Ruee");
		sc4.setEmail("ruee@gmail.com");
		sc1.setAge(30);
		
		session.save(sc1);
		session.save(sc2);
		session.save(sc3);
		session.save(sc4);
		
		tx.commit();
		
		
	}
}
