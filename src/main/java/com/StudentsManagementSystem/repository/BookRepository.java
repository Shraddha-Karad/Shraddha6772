package com.StudentsManagementSystem.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.StudentsManagementSystem.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	@Query("from Book as b where b.student.id=:studentId")
	public Page<Book> findBookByStudent(@Param("studentId") int studentId,Pageable pageable);
	
	
}
