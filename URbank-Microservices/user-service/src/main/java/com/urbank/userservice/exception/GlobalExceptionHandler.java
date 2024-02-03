package com.urbank.userservice.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(CustomerNotFound.class)
	public ResponseEntity<?> catchCustomerNotFoundException(CustomerNotFound customerNotFound) {
		Map<String, Object> errormap = new HashMap<>();
		errormap.put("error message", customerNotFound.getMessage());
		return ResponseEntity.ok(errormap);
	}

	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(UserNotFound.class)
	public ResponseEntity<?> catchUserNotFoundException(UserNotFound userNotFound) {
		Map<String, Object> errormap = new HashMap<>();
		errormap.put("error message", userNotFound.getMessage());
		return ResponseEntity.ok(errormap);
	}

}
