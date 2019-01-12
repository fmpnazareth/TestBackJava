package com.fmpnazareth.expensemagement.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.fmpnazareth.expensemagement.commands.UserForm;
import com.fmpnazareth.expensemagement.entity.User;

@Component
public class UserFormToUser implements Converter<UserForm, User> {

    @Override
    public User convert(UserForm userForm) {
    	User user = new User();
        if (userForm.getCodUser() != null  && !StringUtils.isEmpty(userForm.getCodUser())) {
        	user.setCodUser(userForm.getCodUser());
        }
        
        return user;
    }
}
