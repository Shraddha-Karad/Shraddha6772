package mapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	@Column
	private String name;
	@OneToMany
	List<Account> account;

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", name=" + name + ", account=" + account + "]";
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

	public Person(int pId, String name, List<Account> account) {
		super();
		this.pId = pId;
		this.name = name;
		this.account = account;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}
