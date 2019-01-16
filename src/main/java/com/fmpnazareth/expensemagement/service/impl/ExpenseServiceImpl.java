package com.fmpnazareth.expensemagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.fmpnazareth.expensemagement.entity.Expense;
import com.fmpnazareth.expensemagement.repository.ExpenseRepository;
import com.fmpnazareth.expensemagement.service.ExpenseService;

public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;
	
	@Override
	public Expense create(Expense expense) {
		
		return this.expenseRepository.save(expense);
	}

	@Override
	public Expense findByCurrentUser(String codUser) {
		return this.expenseRepository.findByUserId(codUser);
	}

}
