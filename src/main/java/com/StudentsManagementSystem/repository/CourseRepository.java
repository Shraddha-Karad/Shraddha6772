package com.StudentsManagementSystem.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.StudentsManagementSystem.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{


	@Query("from Course as c where c.student.id=:studentId")
	public Page<Course> findCourseByStudent(@Param("studentId") int studentId, Pageable pageable);
	
	
	
	
}

