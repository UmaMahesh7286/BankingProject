package com.urbank.accountservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urbank.accountservice.entity.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

}
