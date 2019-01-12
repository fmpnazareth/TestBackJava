package com.fmpnazareth.expensemagement.service;

import java.util.List;

import com.fmpnazareth.expensemagement.commands.UserForm;
import com.fmpnazareth.expensemagement.entity.User;

public interface UserService {

    List<User> listAll();

    User getByCodUser(String codUser);

    User saveOrUpdate(User user);

    void delete(String codUser);

    User saveOrUpdateUserForm(UserForm userForm);
}