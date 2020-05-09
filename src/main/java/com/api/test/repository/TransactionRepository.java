package com.api.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.test.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, String> {

}
