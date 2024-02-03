package com.urbank.userservice.request;

import java.util.Set;

import lombok.Data;

@Data
public class SignupRequest {
	private String username;
	private String email;
	private String password;
	private String phoneNumber;
	private Set<String> roles;
}