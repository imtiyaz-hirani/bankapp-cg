package com.springboot.bankapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.bankapp.model.Transaction;
import com.springboot.bankapp.repository.TransactionRepository;
import com.springboot.bankapp.repository.UserRepository;

@Service
public class TransactionService {

	@Autowired
	private UserRepository userRepository; 
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	public String fetchFromAccountNumber(String username) {
		 
		return userRepository.fetchFromAccountNumber(username);
	}
	
	
	public void updateBalance(String fromAccountNumber, double amount) {
		userRepository.updateBalance(fromAccountNumber,amount);
	}


	public void creditAmount(String toAccountNumber, double amount) {
		userRepository.creditAmount(toAccountNumber,amount); 
		
	}


	public Transaction saveTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}

}
