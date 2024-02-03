package com.urbank.accountservice.service;

import java.util.List;

import com.urbank.accountservice.entity.Transaction;

public interface TransactionService {

	public Transaction saveTransaction(Transaction transaction);

	public String deleteTransaction(Long transactionId);

	public Transaction getTransaction(Long transactionId);

	public List<Transaction> transactionListByAccountId(Long accountNumber);

}
