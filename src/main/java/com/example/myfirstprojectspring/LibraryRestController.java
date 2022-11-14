package com.example.myfirstprojectspring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class LibraryRestController {
    //here we are creating our end-point rest API
    @Autowired
    BookService bookservice;

    //CRUD: read
    @GetMapping("books")
    public Iterable<Book> getAllBooks() {
        //
        return bookservice.queryBooksFromH2();
    }

}