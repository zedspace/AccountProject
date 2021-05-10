package com.ing.account;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int transactionId;
	
	@Column
	private Date transactionDate;
	
	@Column
	private double tranValue;
	
	@Column
	private int accountId;
	
	public Transaction() {
		
	}
	
	public Transaction(int transactionId, Date transactionDate, double tranValue, int accountId) {
		super();
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.tranValue = tranValue;
		this.accountId = accountId;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public double getValue() {
		return tranValue;
	}

	public void setValue(double tranValue) {
		this.tranValue = tranValue;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	

}
