package com.libraryManagemenr.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.libraryManagemenr.backend.dto.BookDTO;
import com.libraryManagemenr.backend.exception.BackendException;
import com.libraryManagemenr.backend.service.AddBookService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;

@RestController
public class AddBookController {
	
	@Autowired
	AddBookService addBookService;

	@PostMapping(value = "/addBook")
	@Operation(summary = "add a book", description = "This endPoint is used to add a book in DB")
	public ResponseEntity addBook(@RequestBody BookDTO bookInfo) throws BackendException {
		System.out.println("BEGIN - Started inserting data in DB");
		return ResponseEntity.ok(addBookService.addBook(bookInfo));
	}
}
