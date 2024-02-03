package com.urbank.bankservice.service;

import com.urbank.bankservice.payload.BranchDto;

public interface BranchService {

//	public List<BranchDto> branchList(Long bankId);

	public BranchDto saveBranchByBankId(Long bankId, BranchDto branchDto);

	public String deleteBranchByBankId(Long bankId, Long branchId);

	public String deleteBranch(Long branchId);

	public BranchDto getBranch(Long branchId);

}
