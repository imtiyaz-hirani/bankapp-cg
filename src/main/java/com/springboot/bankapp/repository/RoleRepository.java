package com.springboot.bankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.bankapp.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
