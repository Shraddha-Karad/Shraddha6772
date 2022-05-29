package com.StudentsManagementSystem.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="Student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	
	@NotBlank(message="name Feild is required!")
	@Size(min=2,max=20,message="Minimum 2 and maximum 15 charachters are allowed !")
	private String studentName;
	
	@Column(unique = true)
	private String studentEmail;
	
	private String password;
	
	private boolean enabled;
	
	private String studentContact;
	
	private String imageURL;
	
	private String role;
	
	
	
	/*
	 * @Override public String toString() { return "Student [studentId=" + studentId
	 * + ", studentName=" + studentName + ", studentEmail=" + studentEmail +
	 * ", password=" + password + ", enabled=" + enabled + ", studentContact=" +
	 * studentContact + ", imageURL=" + imageURL + ", role=" + role + ", course=" +
	 * course + "]"; }
	 */




	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy="student")
	private List<Course> course=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy="student")
	private List<CourseList> courseList=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy="student")
	private List<Book> book=new ArrayList<>();
	
	
	
	
	
	
	

	
}
