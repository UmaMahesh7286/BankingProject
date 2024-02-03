package com.urbank.bankservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Entity
public class Bank {

	@Id
	@GeneratedValue
	@Column(name = "bank_id", nullable = false, length = 50)
	public String bankId;
	public String bankName;
	public String headquatersAddress;
	public String contactNumber;
	public String website;

//	public MultipartFile logo;

}
