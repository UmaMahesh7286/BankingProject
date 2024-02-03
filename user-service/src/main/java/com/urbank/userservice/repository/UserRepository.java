package com.urbank.userservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urbank.userservice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	List<User> findByBankId(String bankId);

}
