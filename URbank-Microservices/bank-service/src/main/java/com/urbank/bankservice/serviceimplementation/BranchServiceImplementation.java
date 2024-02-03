package com.urbank.bankservice.serviceimplementation;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbank.bankservice.entity.Bank;
import com.urbank.bankservice.entity.Branch;
import com.urbank.bankservice.exception.BankNotFound;
import com.urbank.bankservice.exception.BranchNotFound;
import com.urbank.bankservice.payload.BranchDto;
import com.urbank.bankservice.repository.BankRepository;
import com.urbank.bankservice.repository.BranchRepository;
import com.urbank.bankservice.service.BranchService;

@Service
public class BranchServiceImplementation implements BranchService {

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private BankRepository bankRepository;

	@Autowired
	private BranchRepository branchRepository;

//	@Override
//	public List<BranchDto> branchList(Long bankId) {
//		Bank bank = bankRepository.findById(bankId)
//				.orElseThrow(() -> new BankNotFound(String.format("Bank Id %d not found", bankId)));
//		List<Branch> branchs = branchRepository.findByBankId(bankId);
//		return branchs.stream().map(task -> mapper.map(branchs, BranchDto.class)).collect(Collectors.toList());
//	}

	@Override
	public BranchDto saveBranchByBankId(Long bankId, BranchDto branchDto) {
		Bank bank = bankRepository.findById(bankId)
				.orElseThrow(() -> new BankNotFound(String.format("bankId %d not found", bankId)));
		Branch branch = mapper.map(branchDto, Branch.class);
		Branch branchsaved = branchRepository.save(branch);
		return mapper.map(branchsaved, BranchDto.class);
	}

	@Override
	public String deleteBranchByBankId(Long bankId, Long branchId) {
		Bank bank = bankRepository.findById(bankId)
				.orElseThrow(() -> new BankNotFound(String.format("Bank Id %d not found", bankId)));
		Branch branch = branchRepository.findById(branchId)
				.orElseThrow(() -> new BranchNotFound(String.format("branchId Id %d not found", branchId)));
		if (bank.getBankId() != branch.getBank().getBankId()) {
			throw new BankNotFound(String.format("bankId %d is not belong to branchId %d", bankId, branchId));
		}
		branchRepository.deleteById(branchId);
		return "Deleted Successfully";
	}

	@Override
	public String deleteBranch(Long branchId) {
		Branch branch = branchRepository.findById(branchId)
				.orElseThrow(() -> new BranchNotFound(String.format("branchId Id %d not found", branchId)));
		branchRepository.deleteById(branchId);
		return "Deleted Successfully";
	}

	@Override
	public BranchDto getBranch(Long branchId) {
		Branch branch = branchRepository.findById(branchId)
				.orElseThrow(() -> new BranchNotFound(String.format("branchId Id %d not found", branchId)));
		return mapper.map(branch, BranchDto.class);
	}

}
