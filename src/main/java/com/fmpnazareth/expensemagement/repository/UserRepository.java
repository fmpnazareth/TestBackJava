package com.fmpnazareth.expensemagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fmpnazareth.expensemagement.entity.User;

public interface UserRepository extends MongoRepository<User,String> {
	
	User findByCodUser(String codUser);

}
