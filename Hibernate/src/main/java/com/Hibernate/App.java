package com.Hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.entity.Student;

import citeria.StudentCriteria;

public class App {
	public static void main(String[] args) {
		
		System.out.println("Hello World!");

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		System.out.println("Hello World");
		SessionFactory factory = (SessionFactory) configuration.buildSessionFactory();
		Session session = ((org.hibernate.SessionFactory) factory).openSession();
		Transaction tx = session.beginTransaction();

		Criteria cr =  session.createCriteria(Student.class);
		cr.addOrder(Order.asc("name"));
		List list = cr.list();
		for(int i = 0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		Criteria cr1 =  session.createCriteria(Student.class);
		cr1.add(Restrictions.like("name","S%"));
		List list1 = cr1.list();
		for(int i = 0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		
		Criteria cr2 =  session.createCriteria(Student.class);
		cr2.add(Restrictions.between("age",20,30));
		List list2 = cr2.list();
		for(int i = 0;i<list2.size();i++)
		{
			System.out.println(list2.get(i));
		}
		
		Criteria cr3 =  session.createCriteria(Student.class);
		cr3.add(Restrictions.gt("age",18));
		List list3 = cr3.list();
		for(int i = 0;i<list3.size();i++)
		{
			System.out.println(list3.get(i));
		}
		

		Criteria cr4 =  session.createCriteria(Student.class);
		cr4.add(Restrictions.lt("age",28));
		List list4 = cr4.list();
		for(int i = 0;i<list4.size();i++)
		{
			System.out.println(list4.get(i));
		}
		
		Criteria cr5 =  session.createCriteria(Student.class);
		cr5.setProjection(Projections.min("age"));
		List list5 = cr5.list();
		for(int i = 0;i<list5.size();i++)
		{
			System.out.println("Minimum age is :" +list5);
		}
		
		Criteria cr6 =  session.createCriteria(Student.class);
		cr6.setProjection(Projections.max("age"));
		List list6 = cr6.list();
		for(int i = 0;i<list6.size();i++)
		{
			System.out.println("Maximum age is : "+list6);
		}
		
		Student student = new Student();
		student.setRollNo(1);
		student.setName("Shraddha");
		student.setEmail("Shraddha@gmail.com");
		student.setAge(22);
		
		Student student1 = new Student();
		student1.setRollNo(2);
		student1.setName("Shivani");
		student1.setEmail("shivani@gmail.com");
		student1.setAge(21);
		
		Student student2 = new Student();
		student2.setRollNo(3);
		student2.setName("Lavanya");
		student2.setEmail("lavanya@gmail.com");
		student2.setAge(24);
		
		Student student3 = new Student();
		student3.setRollNo(4);
		student3.setName("Ruee");
		student3.setEmail("ruee@gmail.com");
		student3.setAge(30);
		
		session.saveOrUpdate(student);
		session.saveOrUpdate(student1);
		session.saveOrUpdate(student2);
		session.saveOrUpdate(student3);
		
		tx.commit();
	}
}

/*
 * String hql = "from Student where student.rollNo=:rn"; Query query =
 * session.createQuery(hql); query.setParameter("rn","1"); List<Student>
 * lest = query.list();
 */

/*
 * String hql = "FROM Student";
 * 
 * Query query = session.createQuery(hql);
 * 
 * List results = query.list();
 * 
 * 
 * System.out.println(results);
 */