package com.urbank.bankservice.payload;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BranchDto {
	public String branch_id;
	public String branch_name;
	public String ifsc_code;
	public String branch_address;
	public String contact_number;
	public String branch_manager_name;
}
