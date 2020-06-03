package com.lucasmaciel.bookstoremaneger.controller;

import com.lucasmaciel.bookstoremaneger.dto.BookDTO;
import com.lucasmaciel.bookstoremaneger.dto.MessageResponseDTO;
import com.lucasmaciel.bookstoremaneger.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController // --> api rest
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO){
        return bookService.create(bookDTO);
    }

    @GetMapping("{id}")
    public BookDTO findById(@PathVariable Long id){
        return bookService.findById(id);
    }

}
