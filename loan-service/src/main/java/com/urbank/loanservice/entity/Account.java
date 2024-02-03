package com.urbank.loanservice.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Entity
public class Account {

	@Id
	@GeneratedValue
	@Column(name = "accountNumber", nullable = false,length = 50)
	public String accountNumber;
	public String customerId;
	public String branchId;
	public String accountType;
	public double balance;
	public Date createdDate;
	public boolean isTrancationEnabled;
	public String accountStatus;
	

}
