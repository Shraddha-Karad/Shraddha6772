package com.StudentsManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.StudentsManagementSystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query("select s from Student s where s.studentEmail = :studentEmail")
	public Student getStudentByStudentName(@Param("studentEmail") String email);
	
}
