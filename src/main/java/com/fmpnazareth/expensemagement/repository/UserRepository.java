package com.fmpnazareth.expensemagement.repository;

import org.springframework.data.repository.CrudRepository;
import com.fmpnazareth.expensemagement.entity.User;

public interface UserRepository extends CrudRepository<User, String> {
}