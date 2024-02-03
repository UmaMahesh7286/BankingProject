package com.urbank.loanservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.urbank.loanservice.entity.Deposit;

public interface DepositRepository extends JpaRepository<Deposit, Long> {

}
