package com.urbank.bankservice.service;

import java.util.List;

import com.urbank.bankservice.payload.BranchDto;

public interface BranchService {
	
	public List<BranchDto> branchList(String bankId);

	public BranchDto saveBranchByBankId(String bankId, BranchDto branchDto);

	public String deleteBranchByBankId(String bankId,String branchId);

	public String deleteBranch(String branchId);
	
	public BranchDto getBranch(String branchId);

}
