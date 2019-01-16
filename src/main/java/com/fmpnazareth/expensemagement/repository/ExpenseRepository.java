package com.fmpnazareth.expensemagement.repository;

import java.awt.print.Pageable;
import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.fmpnazareth.expensemagement.entity.Expense;
import com.fmpnazareth.expensemagement.entity.User;


public interface ExpenseRepository extends MongoRepository<Expense, String> {
	
	Expense findByUserId(String userId);
	
	Expense findByDateBetween(Date startDate, Date endDate);

	Page<Expense> findByUserIdOrderByDateDesc(Pageable pages,String userId);
	
	Page<Expense> findByDateBetween(Pageable pages, Date startDate, Date endDate);
	
}
