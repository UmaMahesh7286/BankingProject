package com.urbank.bankservice.service;

import com.urbank.bankservice.payload.BankDto;

public interface BankService {

	public BankDto saveBank(BankDto bankDto);
	
	public String deleteBank(Long bankId);
	
	public BankDto getBank(Long bankId);
	
}
