package com.urbank.loanservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.urbank.loanservice.entity.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long> {

}
