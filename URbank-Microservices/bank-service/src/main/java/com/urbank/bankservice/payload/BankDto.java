package com.urbank.bankservice.payload;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BankDto {
	public long bank_id;
	public String bank_name;
	public String headquaters_address;
	public String contact_number;
	public String website;

}
