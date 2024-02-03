package com.urbank.userservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Entity
public class User {
	@Id
	@GeneratedValue
	@Column(name = "transactionId", nullable = false, length = 50)
	public String userId;
	public String email;
	public String password;
	public String role;
	

//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "bank_ref_id", referencedColumnName = "bank_id")
	
}
