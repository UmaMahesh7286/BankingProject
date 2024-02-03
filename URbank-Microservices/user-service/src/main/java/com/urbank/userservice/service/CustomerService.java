package com.urbank.userservice.service;

import com.urbank.userservice.entity.Customer;

public interface CustomerService {

	public Customer saveCustomer(Customer Customer);

	public String deleteCustomer(String customerId);

	public Customer getCustomer(String customerId);

}
