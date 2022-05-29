package com.StudentsManagementSystem.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.StudentsManagementSystem.entity.BookList;
import com.StudentsManagementSystem.repository.BookListRepository;
import com.StudentsManagementSystem.service.BookListService;

@Service
public class BookListServiceImplementation implements BookListService{

private BookListRepository bookListRepository;
	
	public BookListServiceImplementation(BookListRepository bookListRepository) {
		super();
		this.bookListRepository = bookListRepository;
	}

	
	@Override
	public List<BookList> getAllBookList() {
		return bookListRepository.findAll();
	}

	@Override
	public BookList saveBook(BookList bookList) {
		return bookListRepository.save(bookList);
	}

	@Override
	public BookList getBookById(int bookId) {
		return bookListRepository.findById(bookId).get();
	}

	@Override
	public BookList updateBook(BookList bookList) {
		return bookListRepository.save(bookList);	}

	@Override
	public void deleteBookById(int bookId) {
		bookListRepository.deleteById(bookId);
		
	}

	
	
}
