package com.urbank.accountservice.service;

import com.urbank.accountservice.entity.Account;

public interface AccountService {

	public Account saveAccount(Account Account);

	public String deleteAccount(Long accountNumber);

	public Account getAccount(Long accountNumber);

}
