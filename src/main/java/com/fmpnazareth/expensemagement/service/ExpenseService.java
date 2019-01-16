package com.fmpnazareth.expensemagement.service;

import org.springframework.stereotype.Component;

import com.fmpnazareth.expensemagement.entity.Expense;

@Component
public interface ExpenseService {

	Expense create(Expense expense);
	
	Expense findByCurrentUser(String codUser);
}
