package com.sai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sai.model.Bank;
import com.sai.service.BankService;
@RestController

public class MyController {
	
	@Autowired
	
	private BankService service;
	
	@PostMapping("/save")
	public Bank index(@RequestBody Bank bank)
	{
	Bank data 	= service.AccountOpen(bank);
	
	
	return data;
	}
	
	@GetMapping("/get")
	
	public  double meth(@RequestBody Bank bank)
	{
	Bank data = service.BalanceCheck(bank);
	 return data.getAccAmount();
	
	}
	
@GetMapping("/deposit")
	
	public  double depos(@RequestBody Bank bank)
	{
	Bank data = service.Deposit(bank);
	 return data.getAccAmount();
	
	}

@GetMapping("/withdraws")

public  double withdraw(@RequestBody Bank bank)
{
Bank data = service.Withdraw(bank);
 return data.getAccAmount();

}
	

@GetMapping("/transfer/{accNbr}")

public  double trasnfer(@RequestBody Bank bank,@PathVariable int accNbr)
{
Bank data = service.transfer(bank,accNbr);
 return data.getAccAmount();

}

}
