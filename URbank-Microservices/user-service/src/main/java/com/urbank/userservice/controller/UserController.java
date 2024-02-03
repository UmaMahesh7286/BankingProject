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
import com.urbank.userservice.entity.User;
import com.urbank.userservice.service.CustomerService;
import com.urbank.userservice.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private CustomerService CustomerService;

	@Autowired
	private UserService UserService;


	// User Controller

//	@PostMapping("/register")
//	public ResponseEntity<User> saveUserByCustomerId(@RequestBody User dto) {
//		return new ResponseEntity<>(UserService.saveUser(dto), HttpStatus.CREATED);
//	}
	
//	@PostMapping("/login")
//	public ResponseEntity<User> saveUserByCustomerId(@RequestBody User dto) {
//		return new ResponseEntity<>(UserService.saveUser(dto), HttpStatus.CREATED);
//	}

	@DeleteMapping("/deleteUser/{Userid}")
	public ResponseEntity<String> deleteUser(@PathVariable(name = "Userid") String UserId) {
		return new ResponseEntity<>(UserService.deleteUser(UserId), HttpStatus.OK);
	}

	@GetMapping("/getUser/{Userid}")
	public ResponseEntity<User> getUser(@PathVariable(name = "Userid") String UserId) {
		return new ResponseEntity<>(UserService.getUser(UserId), HttpStatus.OK);
	}
}