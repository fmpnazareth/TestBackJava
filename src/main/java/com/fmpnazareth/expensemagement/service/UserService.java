package com.fmpnazareth.expensemagement.service;

import org.springframework.stereotype.Component;
import org.springframework.data.domain.Page;

import com.fmpnazareth.expensemagement.entity.User;

@Component
public interface UserService {

	User findByCodUser(String codUser);
	
	User createOrUpdate(User user);
	
	User findById(String id);
	
	void delete(String id);
	
	Page<User> findAll(int page, int count);
}
