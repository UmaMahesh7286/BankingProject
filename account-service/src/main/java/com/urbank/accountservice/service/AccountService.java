package com.urbank.accountservice.service;

import com.urbank.accountservice.entity.Account;

public interface AccountService {

	public Account saveAccount(Account Account);

	public String deleteAccount(String accountNumber);

	public Account getAccount(String accountNumber);

}
