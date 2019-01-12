package com.fmpnazareth.expensemagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.fmpnazareth.expensemagement.commands.UserForm;
import com.fmpnazareth.expensemagement.converter.UserFormToUser;
import com.fmpnazareth.expensemagement.entity.User;
import com.fmpnazareth.expensemagement.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;


public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private UserFormToUser userFormToUser;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserFormToUser userFormToUser) {
        this.userRepository = userRepository;
        this.userFormToUser = userFormToUser;
    }


    @Override
    public List<User> listAll() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add); 
        return users;
    }

    @Override
    public User getByCodUser(String codUser) {
        return userRepository.findById(codUser).orElse(null);
    }

    @Override
    public User saveOrUpdate(User user) {
    	userRepository.save(user);
        return user;
    }

    @Override
    public void delete(String codUser) {
    	userRepository.deleteById(codUser);

    }

    @Override
    public User saveOrUpdateUserForm(UserForm userForm) {
    	User savedUser = saveOrUpdate(userFormToUser.convert(userForm));

        System.out.println("Saved User Id: " + savedUser.getCodUser());
        return savedUser;
    }
}
