package com.urbank.accountservice.service;

import com.urbank.accountservice.entity.Card;

public interface CardService {

	public Card saveCard(Card Card);

	public String deleteCard(Long CardNumber);

	public Card getCard(Long CardNumber);

}
