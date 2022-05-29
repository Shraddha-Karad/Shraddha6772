package com.StudentsManagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="booklist")
public class BookList {

	@Id
	private int bookId;
	private String bookName;
	private String issueDate;
	private String returnDate;
	

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", issueDate=" + issueDate + ", returnDate="
				+ returnDate + "]";
	}
	
	
	
}