package com.urbank.bankservice.service;

import com.urbank.bankservice.payload.BankDto;

public interface BankService {

	public BankDto saveBank(BankDto bankDto);
	
	public String deleteBank(String bankId);
	
	public BankDto getBank(String bankId);
	
}
