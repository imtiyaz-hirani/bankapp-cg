package com.springboot.bankapp.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.springboot.bankapp.model.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo, Long>{

	UserInfo findByUsername(String username);

	@Query("select a.accountNumber from Customer c join c.userInfo u join c.account a where u.username=?1")
	String fetchFromAccountNumber(String username);

	@Transactional
	@Modifying
	@Query("update Account a SET a.balance=a.balance-?2 where a.accountNumber=?1")
	void updateBalance(String fromAccountNumber, double amount);

	@Transactional
	@Modifying
	@Query("update Account a SET a.balance=a.balance+?2 where a.accountNumber=?1")
	void creditAmount(String toAccountNumber, double amount);
}
