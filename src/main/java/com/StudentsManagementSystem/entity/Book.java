package com.StudentsManagementSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
@Table(name="book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	private String bookName;
	private String issueDate;
	private String returnDate;
	
	@ManyToOne
	private Student student;

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", issueDate=" + issueDate + ", returnDate="
				+ returnDate + ", student=" + student + "]";
	}
	
	
	
}
