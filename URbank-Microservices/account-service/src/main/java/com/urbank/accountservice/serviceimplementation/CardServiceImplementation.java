package com.urbank.accountservice.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbank.accountservice.entity.Card;
import com.urbank.accountservice.exception.CardNotFound;
import com.urbank.accountservice.repository.CardRepository;
import com.urbank.accountservice.service.CardService;

@Service
public class CardServiceImplementation implements CardService {

	@Autowired
	private CardRepository CardRepository;

	@Override
	public Card saveCard(Card Card) {
		return CardRepository.save(Card);
	}

	@Override
	public String deleteCard(Long CardNumber) {
		Card Card = CardRepository.findById(CardNumber)
				.orElseThrow(() -> new CardNotFound(String.format("Card Number %d not found", CardNumber)));
		CardRepository.deleteById(CardNumber);
		return "Card deleted Successfully";
	}

	@Override
	public Card getCard(Long CardNumber) {
		Card Card = CardRepository.findById(CardNumber)
				.orElseThrow(() -> new CardNotFound(String.format("Card Number %d not found", CardNumber)));
		return Card;
	}

}
