package com.avg.spring.rest.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avg.spring.rest.model.Account;


public interface AccountRepository extends JpaRepository<Account, Long>{

	Optional<Account> findByUserName(String username);
	
}
