package com.api.test.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.test.model.Transaction;
import com.api.test.repository.TransactionRepository;

@RestController
@RequestMapping("/transaction")
public class TransactionResource {

	@Autowired
	private TransactionRepository repo;
	
	@PostMapping()
	public Transaction addTransaction(@RequestBody Transaction transaction) {
		return repo.save(transaction);
	} 
	
	@GetMapping("/all")
	public @ResponseBody Iterable<Transaction> listTransactions() {
		return repo.findAll();
	}
	
	@PutMapping
	public Transaction updateTransaction(@RequestBody Transaction transaction) {
		return repo.save(transaction);
	}
}
