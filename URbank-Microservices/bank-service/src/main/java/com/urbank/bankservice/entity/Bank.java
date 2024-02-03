package com.urbank.bankservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder
@Data
@Entity
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bank_id", nullable = false)
	public long bankId;
	
	@NonNull
	@Column(name = "bankName", nullable = false)
	public String bankName;
	
	@Column(name = "headquatersAddress", nullable = false)
	public String headquatersAddress;
	
	@Column(name = "contactNumber", nullable = false)
	public String contactNumber;
	
	@Column(name = "website", nullable = false)
	public String website;

//	public MultipartFile logo;

}
