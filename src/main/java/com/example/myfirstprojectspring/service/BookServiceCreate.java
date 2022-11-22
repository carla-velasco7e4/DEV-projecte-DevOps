package com.example.myfirstprojectspring.service;

import com.example.myfirstprojectspring.entity.Book;
import com.example.myfirstprojectspring.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceCreate {
	
	@Autowired
	BookRepository bookrepository;
	
	public Book addBookToH2(Book book) {
		bookrepository.save(book);
		return book;
	}
}
