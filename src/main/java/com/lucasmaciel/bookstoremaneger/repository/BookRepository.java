package com.lucasmaciel.bookstoremaneger.repository;

import com.lucasmaciel.bookstoremaneger.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
