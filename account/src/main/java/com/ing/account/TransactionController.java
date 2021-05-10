package com.ing.account;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("transaction")
public class TransactionController {

	@Autowired
	private TransactionRepository transactionRepository;
	
	@GetMapping("transaction")
	public List<Transaction> getAllTransactions(@RequestParam Date date){
		return transactionRepository.findByTransactionDate(date);
	}
}
