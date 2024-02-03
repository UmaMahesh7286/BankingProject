package com.urbank.bankservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.urbank.bankservice.payload.BankDto;
import com.urbank.bankservice.payload.BranchDto;
import com.urbank.bankservice.service.BankService;
import com.urbank.bankservice.service.BranchService;

@RestController
@RequestMapping(value = "/bank")
public class BankController {

	@Autowired
	private BankService bankService;

	@Autowired
	private BranchService branchService;

	@PostMapping("/savebank")
	public ResponseEntity<BankDto> saveBank(@RequestBody BankDto dto) {
		return new ResponseEntity<>(bankService.saveBank(dto), HttpStatus.CREATED);
	}

	@DeleteMapping("/deletebank")
	public ResponseEntity<String> deleteBankById(@PathVariable String bankId) {
		return new ResponseEntity<>(bankService.deleteBank(bankId), HttpStatus.OK);
	}

	@GetMapping("/{bankid}")
	public ResponseEntity<BankDto> getById(@PathVariable(name = "bankid") String bankId) {
		return new ResponseEntity<>(bankService.getBank(bankId), HttpStatus.OK);
	}



	// Branch Controller
	
	@PostMapping("/savebranch/{bankid}")
	public ResponseEntity<BranchDto> saveBranchByBankId(@RequestBody BranchDto dto,
			@PathVariable(name = "bankid") String bankId) {
		return new ResponseEntity<>(branchService.saveBranchByBankId(bankId, dto), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deletebranch/bank/{bankid}/branch/{branchid}")
	public ResponseEntity<String> deleteBranchByBankId(@PathVariable(name = "bankid") String bankId,
			@PathVariable(name = "branchid") String branchId) {
		return new ResponseEntity<>(branchService.deleteBranchByBankId(bankId, branchId), HttpStatus.OK);
	}

	@GetMapping("/getallbranches/{bankid}")
	public ResponseEntity<List<BranchDto>> getAllBranchesByBankId(@PathVariable(name = "bankid") String bankId) {
		return new ResponseEntity<>(branchService.branchList(bankId), HttpStatus.OK);
	}

	@DeleteMapping("/deletebranch/{branchid}")
	public ResponseEntity<String> deleteBranch(@PathVariable(name = "branchid") String branchId) {
		return new ResponseEntity<>(branchService.deleteBranch(branchId), HttpStatus.OK);
	}

	@GetMapping("/getbranch/{branchid}")
	public ResponseEntity<BranchDto> getBranch(@PathVariable(name = "branchid") String branchId) {
		return new ResponseEntity<>(branchService.getBranch(branchId), HttpStatus.OK);
	}

}