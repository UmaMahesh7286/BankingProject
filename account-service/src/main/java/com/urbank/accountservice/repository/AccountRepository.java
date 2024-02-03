package com.urbank.accountservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urbank.accountservice.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {

}
