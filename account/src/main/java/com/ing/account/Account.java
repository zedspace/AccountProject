package com.ing.account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ACCOUNTNO")
	private int accountNo;
	
	@Column(name="ACCOUNTSTATUS")
	private boolean accountStatus;
	
	@Column
	private double balance;
	
	@Column
	private double overdraft;
	
	public Account() {
		
	}
	
	public Account(int accountNo, boolean accountStatus, double balance, double overdraft) {
		super();
		this.accountNo = accountNo;
		this.accountStatus = accountStatus;
		this.balance = balance;
		this.overdraft = overdraft;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public boolean getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(boolean accountStatus) {
		this.accountStatus = accountStatus;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getOverdraft() {
		return overdraft;
	}
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
	
}
