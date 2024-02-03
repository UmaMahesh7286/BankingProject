package com.urbank.accountservice.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Entity
public class Account {

	@Id
	@Column(name = "account_number", nullable = false)
	public long accountNumber;
	
	@Column(name = "customer_id", nullable = false)
	public Long customerId;
	
	@Column(name = "branch_id", nullable = false)
	public Long branchId;
	
	@Column(name = "account_type", nullable = false)
	public String accountType;
	
	@Column(name = "balance", nullable = false)
	public double balance;
	
	@Column(name = "created_date", nullable = false)
	public Date createdDate;
	
	@Column(name = "is_trancation_enabled", nullable = false)
	public boolean isTrancationEnabled;	
	
	@Column(name = "account_status", nullable = false)
	public String accountStatus;

}
