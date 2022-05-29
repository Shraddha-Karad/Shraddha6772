package com.StudentsManagementSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.StudentsManagementSystem.entity.BookList;

@Service
public interface BookListService {

	
	 List<BookList> getAllBookList();
	  
	  BookList saveBook(BookList bookList);
	  
	  BookList getBookById(int bookId);
	
	  
	  BookList updateBook(BookList bookList);
	  
	  void deleteBookById(int bookId);
	
}
