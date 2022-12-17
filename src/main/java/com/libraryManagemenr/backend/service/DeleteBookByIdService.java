package com.libraryManagemenr.backend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libraryManagemenr.backend.dto.BookDTO;
import com.libraryManagemenr.backend.dto.CommonResponse;
import com.libraryManagemenr.backend.entity.Book;
import com.libraryManagemenr.backend.exception.BackendException;
import com.libraryManagemenr.backend.mapper.BookMapper;
import com.libraryManagemenr.backend.repository.CrudInBookRepository;

@Service
public class DeleteBookByIdService {
	
	@Autowired
	CrudInBookRepository crudInBookRepository;
	
	@Autowired
	BookMapper bookMapper;

	public CommonResponse deleteBookById(BookDTO bookInfo) throws BackendException {
		
		Book bookEntity = bookMapper.bookEntityToDto(bookInfo);
		
		
		try{
			crudInBookRepository.deleteBookById(bookEntity.getBookId());
		}catch(Exception e) {
			System.out.println("Exception Occured in AddBookService -> addBook");
			throw new BackendException(1, "DB Exception Occured!!!");
		}
		
		
		System.out.println("END - Finshed deleting data in DB");
		return new CommonResponse(0, "Success", null);
	}
	
}
