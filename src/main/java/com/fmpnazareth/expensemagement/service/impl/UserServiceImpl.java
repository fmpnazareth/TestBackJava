package com.fmpnazareth.expensemagement.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.fmpnazareth.expensemagement.entity.User;
import com.fmpnazareth.expensemagement.repository.UserRepository;
import com.fmpnazareth.expensemagement.service.UserService;

@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	public User findByEmail(String codUser) {
		return this.userRepository.findByCodUser(codUser);
	}

	public User createOrUpdate(User user) {
		return this.userRepository.save(user);
	}

	public Optional<User> findById(String id) {
		return this.userRepository.findById(id);
	}

	public void delete(String id) {
		this.userRepository.deleteById(id);
	}

	public Page<User> findAll(int page, int count) {
		Pageable pages = new PageRequest(page, count);
		return this.userRepository.findAll(pages);
	}
	
	public User findByCodUser(String codUser) {
		return this.userRepository.findByCodUser(codUser);
	}

}
