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


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="Courselist")
public class CourseList {

	
	@Id
	private int courseId;
	private String courseName;
	private double courseFee;
	private double courseDuration;
	@Column(length=500)
	private String courseDescription;
//	private String courseProfile;
	
	
	  @ManyToOne private Student student;
	 
	
	@Override
	public String toString() {
		return "CourseList [courseId=" + courseId + ", courseName=" + courseName + ", courseFee=" + courseFee
				+ ", courseDuration=" + courseDuration + ", courseDescription=" + courseDescription + ", student=" + student + "]";
	}
	
	
	
	
	
}
