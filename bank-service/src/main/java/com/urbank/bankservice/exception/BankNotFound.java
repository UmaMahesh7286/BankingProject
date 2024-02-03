package com.urbank.bankservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BankNotFound extends RuntimeException {
	private String message;

	public BankNotFound(String message) {
		super(message);
		this.message = message;
	}

}
