package com.urbank.loanservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urbank.loanservice.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, String> {

	List<Transaction> findByBankId(String bankId);

}
