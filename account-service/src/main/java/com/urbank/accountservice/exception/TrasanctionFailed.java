package com.urbank.accountservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TrasanctionFailed extends RuntimeException {
	private String message;

	public TrasanctionFailed(String message) {
		super(message);
		this.message = message;
	}
	
}
