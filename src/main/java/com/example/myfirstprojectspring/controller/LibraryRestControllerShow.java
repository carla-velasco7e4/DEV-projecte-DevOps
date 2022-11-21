package com.example.myfirstprojectspring.controller;

import com.example.myfirstprojectspring.entity.Book;
import com.example.myfirstprojectspring.service.BookServiceShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class LibraryRestControllerShow {
    //here we are creating our end-point rest API
    @Autowired
    BookServiceShow bookservice;

    //CRUD: create
    @GetMapping("book/{id}")
    public java.util.Optional<Book> getBook(Book book) {
        return bookservice.showBookFromH2(book);
    }

}