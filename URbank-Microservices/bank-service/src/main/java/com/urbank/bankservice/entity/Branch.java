package com.urbank.bankservice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

import lombok.Builder;
import lombok.Data;

@NamedQuery(name = "getallBranchesWithIfscCode", query = "SELECT c FROM Branch c WHERE c.ifscCode LIKE:ifscCode")
@Builder
@Data
@Entity
public class Branch {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "branch_id", nullable = false)
	public @Id long branchId;

	@Column(name = "ifsc_code", nullable = false)
	public String ifscCode;

	@Column(name = "branch_name", nullable = false)
	public String branchName;

	@Column(name = "branch_address", nullable = false)
	public String branchAddress;

	@Column(name = "contact_number", nullable = false)
	public String contactNumber;

	@Column(name = "branch_manager_name", nullable = false)
	public String branchManagerName;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "bank_ref_id", referencedColumnName = "bank_id")
	public Bank bank;
}
