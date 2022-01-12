package com.springboot.bankapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.bankapp.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

	/*
	 * Step 2:  
	 * Fetch transactions for above account number
	 * this number should be either in  account_from or account_to
	 * this will give me List<Tansaction>
	 */
	@Query("select t from Transaction t where t.accountFrom = ?1 OR t.accountTo=?1 order by t.dateOfTransaction DESC")
	List<Transaction> fetchTransactionsByAccountNumber(String accountNumber);

}
