package com.urbank.bankservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urbank.bankservice.entity.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, String> {

	List<Branch> findByBankId(String bankId);

}
