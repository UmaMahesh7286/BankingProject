package com.urbank.loanservice.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbank.loanservice.entity.Account;
import com.urbank.loanservice.exception.AccountNotFound;
import com.urbank.loanservice.repository.AccountRepository;
import com.urbank.loanservice.service.AccountService;

@Service
public class AccountServiceImplementation implements AccountService {

	@Autowired
	private AccountRepository AccountRepository;

	@Override
	public Account saveAccount(Account Account) {
		return  AccountRepository.save(Account);
	}

	@Override
	public String deleteAccount(String accountNumber) {
		Account account = AccountRepository.findById(accountNumber)
				.orElseThrow(() -> new AccountNotFound(String.format("Account Number %d not found", accountNumber)));
		AccountRepository.deleteById(accountNumber);
		return "Account deleted Successfully";
	}

	@Override
	public Account getAccount(String accountNumber) {
		Account account = AccountRepository.findById(accountNumber)
				.orElseThrow(() -> new AccountNotFound(String.format("Account Number %d not found", accountNumber)));
		return account;
	}

}
