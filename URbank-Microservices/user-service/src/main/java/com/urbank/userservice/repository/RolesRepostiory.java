package com.urbank.userservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.urbank.userservice.entity.ERole;
import com.urbank.userservice.entity.Role;

public interface RolesRepostiory extends JpaRepository<Role, Integer> {

	Optional<Role> findByName(ERole name);

}
