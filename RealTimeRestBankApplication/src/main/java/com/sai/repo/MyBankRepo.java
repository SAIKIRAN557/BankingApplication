package com.sai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sai.model.Bank;

public interface MyBankRepo extends JpaRepository<Bank, Integer> {

}
