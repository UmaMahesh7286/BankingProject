package com.urbank.bankservice.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BankExceptionController {
	
	//for definite  exceptions
	@ExceptionHandler(BankNotFound.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	
	public ResponseEntity<?> BankNotFoundExpHandling(BankNotFound bankNotFound) {
		Map<String, Object> error= new HashMap<>();
		error.put("bank not found", bankNotFound);
		return ResponseEntity.ok(error);
	}

	@ExceptionHandler(BranchNotFound.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	
	public ResponseEntity<?> BranchNotFoundExpHandling(BranchNotFound branchNotFound) {
		Map<String, Object> error= new HashMap<>();
		error.put("branch notfound", branchNotFound);
		return ResponseEntity.ok(error);
	}
		
}
