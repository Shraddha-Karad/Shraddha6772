package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration configuration = new Configuration();
        
        configuration.configure("hibernate.cfg.xml");
        
        System.out.println("Hello World");
        
        SessionFactory factory = (SessionFactory) configuration.buildSessionFactory();
        
        Session session =  ((org.hibernate.SessionFactory) factory).openSession();
        
        Transaction tx = session.beginTransaction();
        
        
        Student student = new Student();
        
        student.setRollNo(1);
        student.setName("shraddha");
        student.setEmail("shraddha@gmail.com");
        
        session.saveOrUpdate(student);
        tx.commit();
        
    }
}