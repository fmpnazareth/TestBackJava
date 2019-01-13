package com.fmpnazareth.expensemagement.service;

import org.springframework.stereotype.Component;

import com.fmpnazareth.expensemagement.entity.User;

@Component
public interface UserService {

	User findByCodUser(String codUser);
}
