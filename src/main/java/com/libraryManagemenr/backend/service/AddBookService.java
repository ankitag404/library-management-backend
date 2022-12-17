package com.libraryManagemenr.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libraryManagemenr.backend.dto.BookDTO;
import com.libraryManagemenr.backend.dto.CommonResponse;
import com.libraryManagemenr.backend.entity.Book;
import com.libraryManagemenr.backend.exception.BackendException;
import com.libraryManagemenr.backend.mapper.BookMapper;
import com.libraryManagemenr.backend.repository.CrudInBookRepository;

@Service
public class AddBookService {
	
	@Autowired
	CrudInBookRepository addBookRepository;
	
	@Autowired
	BookMapper bookMapper;

	public CommonResponse addBook(BookDTO bookInfo) throws BackendException {
		
		Book bookEntity = bookMapper.bookEntityToDto(bookInfo);
		
		try{
			bookEntity = addBookRepository.save(bookEntity);
		}catch(Exception e) {
			System.out.println("Exception Occured in AddBookService -> addBook");
			throw new BackendException(1, "DB Exception Occured!!!");
		}
		
		
		System.out.println("END - Finshed inserting data in DB");
		return new CommonResponse(0, "Success", bookEntity);
	}
	
}
