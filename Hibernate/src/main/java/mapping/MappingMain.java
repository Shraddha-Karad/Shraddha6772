package mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingMain {

	public static void main(String args[]) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = (SessionFactory) configuration.buildSessionFactory();
		Session session = ((org.hibernate.SessionFactory) factory).openSession();
		Transaction tx = session.beginTransaction();

		Person person = new Person();
	//	person.setpId(1);
		person.setName("Shraddha");

		
		Account account = new Account();
		account.setAccNo(123);
		account.setAccType("saving");
		account.setPerson(person);
		
//		person.setAccount(account);

		Account account2 = new Account();
		account2.setAccNo(124);
		account2.setAccType("saving");
		account2.setPerson(person);
		
//		person.setAccount((List<Account>) account);
//		person.setAccount((List<Account>) account2);

		List<Account> list = new ArrayList<Account>();
		list.add(account);
		list.add(account2);
		
		person.setAccount(list);
//		account.setPerson(person);
//		account2.setPerson(person);
		
		session.save(account);
		session.save(account2);
		session.save(person);

		tx.commit();
	}

}
