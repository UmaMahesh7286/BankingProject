package com.urbank.accountservice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Entity
public class Transaction {
	@Id
	@GeneratedValue
	@Column(name = "transactionId", nullable = false, length = 50)
	public long transactionId;
	public String transactionType;
	public String ifscCode;
	public String branchAddress;
	public String contactNumber;
	public String branchManagerName;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "accountNumber_ref", referencedColumnName = "accountNumber")
	public Account account;
}
