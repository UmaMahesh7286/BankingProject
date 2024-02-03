package com.urbank.userservice.service;

import com.urbank.userservice.entity.User;

public interface UserService {

	public User saveUser(User User);

	public String deleteUser(String userId);

	public User getUser(String userId);

}
