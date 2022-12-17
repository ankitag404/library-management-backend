package com.libraryManagemenr.backend.dto;

import com.libraryManagemenr.backend.entity.Book;

public class CommonResponse {
	public CommonResponse(int returnCode, String returnMessage, Book book) {
		super();
		this.returnCode = returnCode;
		this.returnMessage = returnMessage;
		this.book = book;
	}
	private int returnCode;
	private String returnMessage;
	private Book book;
	public int getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnMessage() {
		return returnMessage;
	}
	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
}
