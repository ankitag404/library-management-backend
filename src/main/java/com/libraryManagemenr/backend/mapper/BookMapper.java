package com.libraryManagemenr.backend.mapper;


import com.libraryManagemenr.backend.dto.BookDTO;
import com.libraryManagemenr.backend.entity.Book;

public interface BookMapper {

	BookDTO bookDtoToEntity(Book bookEntity);
	Book bookEntityToDto(BookDTO bookDto) ;
}
