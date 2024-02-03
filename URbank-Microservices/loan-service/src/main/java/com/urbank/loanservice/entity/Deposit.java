package com.urbank.loanservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Entity
@Builder
@Data
public class Deposit {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "deposit_Id", nullable = false)
	public @Id Long depositId;

	@Column(name = "deposit_type", nullable = false)
	public String depositType;

	@Column(name = "deposit_interest", nullable = false)
	public int depositInterest;

}
