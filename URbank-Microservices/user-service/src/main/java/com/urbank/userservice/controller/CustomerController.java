package com.urbank.userservice.controller;

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

import com.urbank.userservice.entity.Customer;
import com.urbank.userservice.service.CustomerService;
@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService CustomerService;

	
	
	@PostMapping("/saveCustomer")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer dto) {
		return new ResponseEntity<>(CustomerService.saveCustomer(dto), HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteCustomer")
	public ResponseEntity<String> deleteCustomerById(@PathVariable String CustomerId) {
		return new ResponseEntity<>(CustomerService.deleteCustomer(CustomerId), HttpStatus.OK);
	}

	@GetMapping("/{Customerid}")
	public ResponseEntity<Customer> getById(@PathVariable(name = "Customerid") String CustomerId) {
		return new ResponseEntity<>(CustomerService.getCustomer(CustomerId), HttpStatus.OK);
	}

}
