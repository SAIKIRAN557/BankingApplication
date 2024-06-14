package com.sai.service;

import com.sai.model.Bank;

public interface BankService {
	
	public Bank AccountOpen(Bank bank);
public Bank BalanceCheck(Bank bank);

public Bank Deposit(Bank bank);

public Bank Withdraw(Bank bank);
public Bank transfer(Bank bank,int accNbr);
}
