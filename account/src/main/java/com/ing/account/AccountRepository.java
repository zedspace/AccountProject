package com.ing.account;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
	List<Account> findByAccountStatus(boolean status);
	
	Account findByAccountNo(int id);

}
