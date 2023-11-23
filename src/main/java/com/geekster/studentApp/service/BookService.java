package com.geekster.studentApp.service;

import com.geekster.studentApp.model.Address;
import com.geekster.studentApp.model.Book;
import com.geekster.studentApp.repo.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    IBookRepo iBookRepo;

    public String addBook(Book newBook) {
        iBookRepo.save(newBook);
        return "Book added";
    }

    public List<Book> getAllBook() {
        return iBookRepo.findAll();
    }
}
