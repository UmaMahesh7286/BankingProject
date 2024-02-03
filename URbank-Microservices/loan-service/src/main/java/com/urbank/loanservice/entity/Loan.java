package com.urbank.loanservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Entity
public class Loan {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loan_Id", nullable = false)
	public @Id Long loanId;

	@Column(name = "loan_type", nullable = false)
	public String loanType;

	@Column(name = "loan_interest", nullable = false)
	public int loanInterest;

}
