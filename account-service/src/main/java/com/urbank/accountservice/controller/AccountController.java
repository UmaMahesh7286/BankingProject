package com.urbank.accountservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.urbank.accountservice.entity.Account;
import com.urbank.accountservice.entity.Transaction;
import com.urbank.accountservice.service.AccountService;
import com.urbank.accountservice.service.TransactionService;

@RestController
@RequestMapping(value = "/account")
public class AccountController {
	
	@Autowired
	private AccountService AccountService;

	@Autowired
	private TransactionService TransactionService;

	@PostMapping("/saveAccount")
	public ResponseEntity<Account> saveAccount(@RequestBody Account dto) {
		return new ResponseEntity<>(AccountService.saveAccount(dto), HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteAccount")
	public ResponseEntity<String> deleteAccountById(@PathVariable String AccountId) {
		return new ResponseEntity<>(AccountService.deleteAccount(AccountId), HttpStatus.OK);
	}

	@GetMapping("/{Accountid}")
	public ResponseEntity<Account> getById(@PathVariable(name = "Accountid") String AccountId) {
		return new ResponseEntity<>(AccountService.getAccount(AccountId), HttpStatus.OK);
	}

	// Transaction Controller
	
	@PostMapping("/saveTransaction")
	public ResponseEntity<Transaction> saveTransactionByAccountId(@RequestBody Transaction dto) {
		return new ResponseEntity<>(TransactionService.saveTransaction(dto), HttpStatus.CREATED);
	}
	@GetMapping("/getallTransactiones/{Accountid}")
	public ResponseEntity<List<Transaction>> getAllTransactionesByAccountId(
			@PathVariable(name = "Accountid") String AccountId) {
		return new ResponseEntity<>(TransactionService.transactionListByAccountId(AccountId), HttpStatus.OK);
	}

	@DeleteMapping("/deleteTransaction/{Transactionid}")
	public ResponseEntity<String> deleteTransaction(@PathVariable(name = "Transactionid") String TransactionId) {
		return new ResponseEntity<>(TransactionService.deleteTransaction(TransactionId), HttpStatus.OK);
	}

	@GetMapping("/getTransaction/{Transactionid}")
	public ResponseEntity<Transaction> getTransaction(@PathVariable(name = "Transactionid") String TransactionId) {
		return new ResponseEntity<>(TransactionService.getTransaction(TransactionId), HttpStatus.OK);
	}

	
}