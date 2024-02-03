package com.urbank.bankservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)

public class DataNotFound extends RuntimeException {
	private String message;

	public DataNotFound(String message) {
		super(message);
		this.message = message;
	}
}
