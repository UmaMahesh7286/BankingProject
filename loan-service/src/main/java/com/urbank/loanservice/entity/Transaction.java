package com.urbank.loanservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Entity
public class Transaction {
	@Id
	@GeneratedValue
	@Column(name = "transactionId", nullable = false, length = 50)
	public String transactionId;
	public Card transactionType;
	public String ifscCode;
	public String branchAddress;
	public String contactNumber;
	public String branchManagerName;

//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "bank_ref_id", referencedColumnName = "bank_id")
	
}
