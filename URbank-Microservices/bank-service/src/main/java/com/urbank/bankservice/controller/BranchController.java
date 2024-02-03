package com.urbank.bankservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.urbank.bankservice.payload.BranchDto;
import com.urbank.bankservice.service.BranchService;

public class BranchController {

	@Autowired
	private BranchService branchService;

	@PostMapping("/savebranch/{bankid}")
	public ResponseEntity<BranchDto> saveBranchByBankId(@RequestBody BranchDto dto,
			@PathVariable(name = "bankid") Long bankId) {
		return new ResponseEntity<>(branchService.saveBranchByBankId(bankId, dto), HttpStatus.CREATED);
	}

	@DeleteMapping("/deletebranch/bank/{bankid}/branch/{branchid}")
	public ResponseEntity<String> deleteBranchByBankId(@PathVariable(name = "bankid") Long bankId,
			@PathVariable(name = "branchid") Long branchId) {
		return new ResponseEntity<>(branchService.deleteBranchByBankId(bankId, branchId), HttpStatus.OK);
	}

//	@GetMapping("/getallbranches/{bankid}")
//	public ResponseEntity<List<BranchDto>> getAllBranchesByBankId(@PathVariable(name = "bankid") Long bankId) {
//		return new ResponseEntity<>(branchService.branchList(bankId), HttpStatus.OK);
//	}

	@DeleteMapping("/deletebranch/{branchid}")
	public ResponseEntity<String> deleteBranch(@PathVariable(name = "branchid") Long branchId) {
		return new ResponseEntity<>(branchService.deleteBranch(branchId), HttpStatus.OK);
	}

	@GetMapping("/getbranch/{branchid}")
	public ResponseEntity<BranchDto> getBranch(@PathVariable(name = "branchid") Long branchId) {
		return new ResponseEntity<>(branchService.getBranch(branchId), HttpStatus.OK);
	}

}
