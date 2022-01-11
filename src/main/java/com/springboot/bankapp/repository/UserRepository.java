package com.springboot.bankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.bankapp.model.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo, Long>{

	UserInfo findByUsername(String username);
}
