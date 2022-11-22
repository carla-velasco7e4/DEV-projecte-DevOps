package com.example.myfirstprojectspring.controller;


import com.example.myfirstprojectspring.entity.Book;
import com.example.myfirstprojectspring.service.BookServiceList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class LibraryRestControllerList {
    //here we are creating our end-point rest API
    @Autowired
    BookServiceList bookservice;

    //CRUD: read
    @GetMapping("books")
    public Iterable<Book> getAllBooks() {
        return bookservice.listBooksFromH2();
    }

}