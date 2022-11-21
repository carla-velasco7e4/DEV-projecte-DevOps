package com.example.myfirstprojectspring.service;

import com.example.myfirstprojectspring.entity.Book;
import com.example.myfirstprojectspring.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServiceList {
	
	@Autowired
	BookRepository bookrepository;
	
	public Iterable<Book> listBooksFromH2() {
		return bookrepository.findAll();
	}

}
