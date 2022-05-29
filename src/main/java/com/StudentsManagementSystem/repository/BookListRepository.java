package com.StudentsManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentsManagementSystem.entity.BookList;

public interface BookListRepository  extends JpaRepository<BookList, Integer> {

}
