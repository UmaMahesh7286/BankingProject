package com.urbank.userservice.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbank.userservice.entity.User;
import com.urbank.userservice.exception.UserNotFound;
import com.urbank.userservice.repository.UserRepository;
import com.urbank.userservice.service.UserService;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	private UserRepository UserRepository;

	@Override
	public User saveUser(User User) {
		return UserRepository.save(User);
	}

	@Override
	public String deleteUser(String UserNumber) {
		User user = UserRepository.findById(UserNumber)
				.orElseThrow(() -> new UserNotFound(String.format("User Number %d not found", UserNumber)));
		UserRepository.deleteById(UserNumber);
		return "User deleted Successfully";
	}

	@Override
	public User getUser(String UserNumber) {
		User user = UserRepository.findById(UserNumber)
				.orElseThrow(() -> new UserNotFound(String.format("User Number %d not found", UserNumber)));
		return user;
	}

	
}
