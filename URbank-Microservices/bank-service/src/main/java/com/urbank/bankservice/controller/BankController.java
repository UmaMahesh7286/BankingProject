package com.urbank.bankservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.urbank.bankservice.payload.BankDto;
import com.urbank.bankservice.service.BankService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/bank")
@Slf4j
public class BankController {

	@Autowired
	private BankService bankService;

	@PostMapping("/savebank")
	public ResponseEntity<BankDto> saveBank(@RequestBody BankDto dto) {
		log.info("saving bank ...");
		return new ResponseEntity<>(bankService.saveBank(dto), HttpStatus.CREATED);
	}

	@DeleteMapping("/deletebank")
	public ResponseEntity<String> deleteBankById(@PathVariable Long bankId) {
		return new ResponseEntity<>(bankService.deleteBank(bankId), HttpStatus.OK);
	}

	@GetMapping("/{bankid}")
	public ResponseEntity<BankDto> getById(@PathVariable(name = "bankid") Long bankId) {
		return new ResponseEntity<>(bankService.getBank(bankId), HttpStatus.OK);
	}
}