package com.lucasmaciel.bookstoremaneger.controller;

import com.lucasmaciel.bookstoremaneger.dto.MessageResponseDTO;
import com.lucasmaciel.bookstoremaneger.entity.Book;
import com.lucasmaciel.bookstoremaneger.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // --> api rest
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book){
         return bookService.create(book);
    }

}
