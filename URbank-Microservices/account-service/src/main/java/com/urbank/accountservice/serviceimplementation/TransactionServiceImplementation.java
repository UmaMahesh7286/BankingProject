package com.urbank.accountservice.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbank.accountservice.entity.Account;
import com.urbank.accountservice.entity.Transaction;
import com.urbank.accountservice.exception.AccountNotFound;
import com.urbank.accountservice.exception.TrasanctionFailed;
import com.urbank.accountservice.repository.AccountRepository;
import com.urbank.accountservice.repository.TransactionRepository;
import com.urbank.accountservice.service.TransactionService;

@Service
public class TransactionServiceImplementation implements TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;
	@Autowired
	private AccountRepository AccountRepository;

	@Override
	public Transaction saveTransaction(Transaction Transaction) {
		return transactionRepository.save(Transaction);
	}

	@Override
	public String deleteTransaction(Long transactionId) {
		Transaction transaction = transactionRepository.findById(transactionId).orElseThrow(
				() -> new TrasanctionFailed(String.format("Transaction Number %d not found", transactionId)));
		transactionRepository.deleteById(transactionId);
		return "Transaction deleted Successfully";
	}

	@Override
	public Transaction getTransaction(Long transactionId) {
		Transaction Transaction = transactionRepository.findById(transactionId).orElseThrow(
				() -> new TrasanctionFailed(String.format("Transaction Number %d not found", transactionId)));
		return Transaction;
	}

	@Override
	public List<Transaction> transactionListByAccountId(Long accountNumber) {
		Account account = AccountRepository.findById(accountNumber)
				.orElseThrow(() -> new AccountNotFound(String.format("Account Number %d not found", accountNumber)));
		transactionRepository.findByAccountId(accountNumber);
		return transactionRepository.findByAccountId(accountNumber);
	}
}
