package com.geekster.studentApp.controller;

import com.geekster.studentApp.model.Address;
import com.geekster.studentApp.model.Book;
import com.geekster.studentApp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;


    @PostMapping("book")
    public String addBook(@RequestBody Book newBook){
        return bookService.addBook(newBook);
    }



    @GetMapping("Book")
    public List<Book> getAllAddress()
    {
        return bookService.getAllBook();
    }
}
