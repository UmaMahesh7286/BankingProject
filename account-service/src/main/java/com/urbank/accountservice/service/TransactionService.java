package com.urbank.accountservice.service;

import java.util.List;

import com.urbank.accountservice.entity.Transaction;

public interface TransactionService {

	public Transaction saveTransaction(Transaction transaction);

	public String deleteTransaction(String transactionId);

	public Transaction getTransaction(String transactionId);

	public List<Transaction> transactionListByAccountId(String accountNumber);

}
