package com.libraryManagemenr.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.libraryManagemenr.backend.dto.BookDTO;
import com.libraryManagemenr.backend.entity.Book;
import com.libraryManagemenr.backend.mapper.BookMapper;

@Configuration
public class MapperConfig {

	@Bean
	public BookMapper modelMapper(){
	    return new BookMapper() {
			
	    	public BookDTO bookDtoToEntity(Book bookEntity) {
	    		BookDTO bookDto = new BookDTO();
	    		bookDto.setBookAuthor(bookEntity.getBookAuthor());
	    		bookDto.setBookCount(bookEntity.getBookCount());
	    		bookDto.setBookId(bookEntity.getBookId());
	    		bookDto.setBookIsbn(bookEntity.getBookIsbn());
	    		bookDto.setBookName(bookEntity.getBookName());
	    		return bookDto;
	    	}
	    	public Book bookEntityToDto(BookDTO bookDto) {
	    		Book bookEntity = new Book();
	    		bookEntity.setBookAuthor(bookDto.getBookAuthor());
	    		bookEntity.setBookCount(bookDto.getBookCount());
	    		bookEntity.setBookId(bookDto.getBookId());
	    		bookEntity.setBookIsbn(bookDto.getBookIsbn());
	    		bookEntity.setBookName(bookDto.getBookName());
	    		return bookEntity;
	    	}
		};
	}
}
