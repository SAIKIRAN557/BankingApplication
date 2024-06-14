package com.sai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.model.Bank;
import com.sai.repo.MyBankRepo;

@Service
public class BankClass implements BankService {


	@Autowired
	private MyBankRepo repo;

	@Override
	public Bank AccountOpen(Bank bank) {

		Bank b1 = repo.save(bank);
		return b1;
	}

	@Override
	public Bank BalanceCheck(Bank bank) {
		int accountNumber	   = bank.getAccNbr();
		String name   = bank.getAccName();
		String pass = 	bank.getAccPassword();
	      Bank data     = 	repo.findById(accountNumber).get();
	      if(accountNumber==data.getAccNbr() && name.equals(data.getAccName())&& pass.equals(data.getAccPassword()))

	      {
	    	  return data;
	      }
	      else {
	    	  return null;
	      }
	}

	@Override
	public Bank Deposit(Bank bank) {
		
		int accountNumber	   = bank.getAccNbr();
		String name   = bank.getAccName();
		String pass = 	bank.getAccPassword();
	      Bank data     = 	repo.findById(accountNumber).get();
	     double deposit =  bank.getAccAmount();
	     double afterdeposit = 0.0;
	      if(accountNumber==data.getAccNbr() && name.equals(data.getAccName())&& pass.equals(data.getAccPassword()))

	      {
	    	  afterdeposit = deposit+data.getAccAmount();
	    	  bank.setAccAmount(afterdeposit);
	    	  
	    	  repo.save(bank);
	    	  
	    	  
	    	  return data;
	      }
	      else {
	    	  return null;
	      }
		
	}

	@Override
	public Bank Withdraw(Bank bank) {
		

		int accountNumber	   = bank.getAccNbr();
		String name   = bank.getAccName();
		String pass = 	bank.getAccPassword();
	     double withdraw =  bank.getAccAmount();
	      Bank data1   = 	repo.findById(accountNumber).get();

	     double afterwithdraw = 0.0;
	      if(accountNumber==data1.getAccNbr() && name.equals(data1.getAccName())&& pass.equals(data1.getAccPassword())&&data1.getAccAmount()>withdraw )

	      {
	    	  afterwithdraw =  data1.getAccAmount()-withdraw;
	    	  bank.setAccAmount(afterwithdraw);
	    	  
	    	  repo.save(bank);
	    	  
	    	  
	    	  return data1;
	      }
	      else {
	    	  return null;
	      }

		
	}

	@Override
	public Bank transfer(Bank bank, int accNbr) {
		int accountNumber	   = bank.getAccNbr();
		String name   = bank.getAccName();
		String pass = 	bank.getAccPassword();
	     double withdraw =  bank.getAccAmount();
	     
	      Bank data1   = 	repo.findById(accountNumber).get();
	      
	    Bank transferaccount =  repo.findById(accNbr).get();

	     double afterwithdraw = 0.0;
	     double transfer = 0.0;
	      if(accountNumber==data1.getAccNbr() && name.equals(data1.getAccName())&& pass.equals(data1.getAccPassword())&&data1.getAccAmount()>withdraw )

	      {
	    	  //withdraw
	    	  afterwithdraw =  data1.getAccAmount()-withdraw;
	    	  bank.setAccAmount(afterwithdraw);
	    	  repo.save(bank);
	    	  
	    	  
	    	  //transfer
	    	  transfer = transferaccount.getAccAmount() + data1.getAccAmount();
	    	  transferaccount.setAccAmount(transfer);
	    	  repo.save(transferaccount);
	    	  
	    			  
	    			  
	   
	    	  

	    	  
	    	  
	    	  return data1;
	      }
	      else {
	    	  return null;
	      }
		
	
	}
}