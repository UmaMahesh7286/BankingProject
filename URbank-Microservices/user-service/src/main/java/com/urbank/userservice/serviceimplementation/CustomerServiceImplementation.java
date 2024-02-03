package com.urbank.userservice.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbank.userservice.entity.Customer;
import com.urbank.userservice.exception.CustomerNotFound;
import com.urbank.userservice.repository.CustomerRepository;
import com.urbank.userservice.service.CustomerService;

@Service
public class CustomerServiceImplementation implements CustomerService {

	@Autowired
	private CustomerRepository CustomerRepository;

	@Override
	public Customer saveCustomer(Customer Customer) {
		return CustomerRepository.save(Customer);
	}

	@Override
	public String deleteCustomer(String customerId) {
		Customer Customer = CustomerRepository.findById(customerId)
				.orElseThrow(() -> new CustomerNotFound(String.format("Customer Number %d not found", customerId)));
		CustomerRepository.deleteById(customerId);
		return "Customer deleted Successfully";
	}

	@Override
	public Customer getCustomer(String customerId) {
		Customer Customer = CustomerRepository.findById(customerId)
				.orElseThrow(() -> new CustomerNotFound(String.format("Customer Number %d not found", customerId)));
		return Customer;
	}

}
