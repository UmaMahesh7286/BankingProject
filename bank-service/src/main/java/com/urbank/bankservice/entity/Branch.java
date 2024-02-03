package com.urbank.bankservice.entity;

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
public class Branch {
	@Id
	@GeneratedValue
	@Column(name = "branch_id", nullable = false, length = 50)
	public String branchId;
	public String branchName;
	public String ifscCode;
	public String branchAddress;
	public String contactNumber;
	public String branchManagerName;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "bank_ref_id", referencedColumnName = "bankId")
	public Bank bank;
}
