package com.libraryManagemenr.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.libraryManagemenr.backend.dto.BookDTO;
import com.libraryManagemenr.backend.exception.BackendException;
import com.libraryManagemenr.backend.service.DeleteBookByIdService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class DeleteBookByIdController {
	
	@Autowired
	DeleteBookByIdService deleteBookByIdService;

	@PostMapping(value = "/deleteBookById")
	@Operation(summary = "delete a book by ID", description = "This endPoint is used to delete a book by ID in DB")
	public ResponseEntity addBook(@RequestBody BookDTO bookInfo) throws BackendException {
		System.out.println("BEGIN - Started deleting data in DB");
		return ResponseEntity.ok(deleteBookByIdService.deleteBookById(bookInfo));
	}
}
