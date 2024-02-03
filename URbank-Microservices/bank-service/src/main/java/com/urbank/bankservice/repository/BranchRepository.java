package com.urbank.bankservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.urbank.bankservice.entity.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {

	List<Branch> findByBankId(Long bankId);

	@Query(name = "getallBranchesWithIfscCode")
	Branch findByifsccode(@Param("ifsccode") String ifsccode);
//
//	@Query(value = "select * from Branch where branch_name=?", nativeQuery = true)
//	@Query("SELECT B FROM Branch b WHERE B.branchName=?1")
//	Branch findBybranchName(String branchName);

}
