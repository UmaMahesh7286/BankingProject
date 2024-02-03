package com.urbank.bankservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urbank.bankservice.entity.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {

}
