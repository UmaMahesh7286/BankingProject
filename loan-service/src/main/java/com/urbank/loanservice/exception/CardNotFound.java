package com.urbank.loanservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)

public class CardNotFound extends RuntimeException {
	private String message;

	public CardNotFound(String message) {
		super(message);
		this.message = message;
	}
}
