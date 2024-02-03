package com.urbank.accountservice.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbank.accountservice.entity.Account;
import com.urbank.accountservice.exception.AccountNotFound;
import com.urbank.accountservice.repository.AccountRepository;
import com.urbank.accountservice.service.AccountService;

@Service
public class AccountServiceImplementation implements AccountService {

	@Autowired
	private AccountRepository AccountRepository;

	@Override
	public Account saveAccount(Account Account) {
		return  AccountRepository.save(Account);
	}

	@Override
	public String deleteAccount(Long accountNumber) {
		Account account = AccountRepository.findById(accountNumber)
				.orElseThrow(() -> new AccountNotFound(String.format("Account Number %d not found", accountNumber)));
		AccountRepository.deleteById(accountNumber);
		return "Account deleted Successfully";
	}

	@Override
	public Account getAccount(Long accountNumber) {
		Account account = AccountRepository.findById(accountNumber)
				.orElseThrow(() -> new AccountNotFound(String.format("Account Number %d not found", accountNumber)));
		return account;
	}

}
