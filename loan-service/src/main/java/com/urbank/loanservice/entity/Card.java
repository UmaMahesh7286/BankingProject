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
public class Card {
	@Id
	@GeneratedValue
	@Column(name = "cardId", nullable = false, length = 50)
	public String cardId;
	public String number;
	public String cardType;
	public String status;
}
