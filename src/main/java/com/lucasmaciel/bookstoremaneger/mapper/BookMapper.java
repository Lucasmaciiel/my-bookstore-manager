package com.lucasmaciel.bookstoremaneger.mapper;

import com.lucasmaciel.bookstoremaneger.dto.BookDTO;
import com.lucasmaciel.bookstoremaneger.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);

}
