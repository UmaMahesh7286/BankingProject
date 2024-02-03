package com.urbank.bankservice.serviceimplementation;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbank.bankservice.entity.Bank;
import com.urbank.bankservice.exception.BankNotFound;
import com.urbank.bankservice.payload.BankDto;
import com.urbank.bankservice.repository.BankRepository;
import com.urbank.bankservice.service.BankService;

@Service
public class BankServiceImplementation implements BankService {

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private BankRepository bankRepository;

	@Override
	public BankDto saveBank(BankDto bankDto) {
		Bank bank = mapper.map(bankDto, Bank.class);
		Bank banksaved = bankRepository.save(bank);
		return mapper.map(banksaved, BankDto.class);
	}

	@Override
	public String deleteBank(Long bankId) {
		Bank bank = bankRepository.findById(bankId)
				.orElseThrow(() -> new BankNotFound(String.format("Bank Id %d not found", bankId)));
		bankRepository.deleteById(bankId);
		return "Bank deleted Successfully";
	}

	@Override
	public BankDto getBank(Long bankId) {
		Bank bank = bankRepository.findById(bankId)
				.orElseThrow(() -> new BankNotFound(String.format("Bank Id %d not found", bankId)));
		return mapper.map(bank, BankDto.class);
	}

}
