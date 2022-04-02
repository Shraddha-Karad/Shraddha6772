package mapping;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Account {

	@Id
	private int accNo;
	@Column
	private String accType;
	
	@ManyToOne
	Person person;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accType=" + accType + ", person=" + person + "]";
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accNo, String accType, Person person) {
		super();
		this.accNo = accNo;
		this.accType = accType;
		this.person = person;
	}

}
