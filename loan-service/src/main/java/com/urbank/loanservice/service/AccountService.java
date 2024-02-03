package com.urbank.loanservice.service;

import com.urbank.loanservice.entity.Account;

public interface AccountService {

	public Account saveAccount(Account Account);

	public String deleteAccount(String accountNumber);

	public Account getAccount(String accountNumber);

}
