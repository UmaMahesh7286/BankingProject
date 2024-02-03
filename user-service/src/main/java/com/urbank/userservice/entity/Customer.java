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
public class Customer {

	@Id
	@GeneratedValue
	@Column(name = "customerId", nullable = false, length = 50)
	public String customerId;
	public String firstName;
	public String lastName;
	public String email;
	public String password;
	public String mobileNumber;
	public String address;
	public String profession;
	public String annualIncome;

}
