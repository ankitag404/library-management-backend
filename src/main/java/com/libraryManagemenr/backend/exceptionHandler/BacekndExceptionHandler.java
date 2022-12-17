package com.libraryManagemenr.backend.exceptionHandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.libraryManagemenr.backend.dto.CommonResponse;
import com.libraryManagemenr.backend.exception.BackendException;

@ControllerAdvice
public class BacekndExceptionHandler {

	@ExceptionHandler(value = BackendException.class)
	public ResponseEntity handleFailureResponse(BackendException exception) {
		return ResponseEntity.ok(new CommonResponse(exception.getErrorCode(), exception.getErrorMessage(), null));
	}
	
}
