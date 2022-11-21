package com.example.myfirstprojectspring.repository;

import com.example.myfirstprojectspring.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <Book, Integer>{


}
