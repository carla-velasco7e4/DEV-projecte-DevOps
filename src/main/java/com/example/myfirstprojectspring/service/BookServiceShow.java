package com.example.myfirstprojectspring.service;

import com.example.myfirstprojectspring.entity.Book;
import com.example.myfirstprojectspring.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServiceShow {
	
	@Autowired
	BookRepository bookrepository;
	public Optional<Book> showBookFromH2(Book book) {
		return bookrepository.findById(book.getId());
	}

}
