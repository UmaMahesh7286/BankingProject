package com.urbank.loanservice.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class CustomerDeposit {

	@Column(name = "cd_Id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Id Long cdId;

	@Column(name = "deposit_type", nullable = false)
	private String depositType;

	@Column(name = "amount", nullable = false)
	private double amount;

	@Column(name = "start_date", nullable = false)
	private Date startDate;

	@Column(name = "duration", nullable = false)
	private int durationInMonths;

	@Column(name = "isApproved", nullable = false)
	private boolean isApproved;

	@Column(name = "reason", nullable = false)
	private String reason;

}
