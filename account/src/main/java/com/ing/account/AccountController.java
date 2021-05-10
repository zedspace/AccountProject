package com.ing.account;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {

	@Autowired
	private AccountRepository accountRepository;
	
	Date date;
	
	@PostMapping("account")
	public List<Account> createAccount(@RequestParam boolean accountStatus,@RequestParam double balance,@RequestParam double overdraft) {
		accountRepository.save(new Account(0,accountStatus,balance,overdraft));
		return accountRepository.findByAccountStatus(true);
	}
	
	@GetMapping("account")
	public List<Account> getAllAccounts(){
		return (List<Account>) accountRepository.findAll();
	}
	
	@PostMapping("close")
	public String closeAccount(@RequestParam int id) {
		Account account = accountRepository.findByAccountNo(id);
		if (account.getAccountStatus() && account.getBalance() ==0)
		{
			account.setAccountStatus(false);
			return "Account closed successfully!";
		}
		else
			return "Account can't be closed!";
		
	}
}
