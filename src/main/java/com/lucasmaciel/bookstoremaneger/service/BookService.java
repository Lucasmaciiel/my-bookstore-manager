package com.lucasmaciel.bookstoremaneger.service;

import com.lucasmaciel.bookstoremaneger.dto.BookDTO;
import com.lucasmaciel.bookstoremaneger.dto.MessageResponseDTO;
import com.lucasmaciel.bookstoremaneger.entity.Book;
import com.lucasmaciel.bookstoremaneger.mapper.BookMapper;
import com.lucasmaciel.bookstoremaneger.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    private BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO){
        Book bookToSave = bookMapper.toModel(bookDTO);

        Book savedBook = bookRepository.save(bookToSave);
        return MessageResponseDTO.builder()
                .message("Book created with ID " + savedBook.getId())
                .build();
    }

    public BookDTO findById(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        return bookMapper.toDTO(optionalBook.get());
    }
}
