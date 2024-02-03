package com.urbank.bankservice;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BankServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankServiceApplication.class, args);
	}
	
	@Bean
	public ModelMapper mapper() {
		return new ModelMapper();
	}
}
