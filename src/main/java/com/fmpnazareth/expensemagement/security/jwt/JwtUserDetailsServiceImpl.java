package com.fmpnazareth.expensemagement.security.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fmpnazareth.expensemagement.entity.User;
import com.fmpnazareth.expensemagement.service.UserService;

@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String codUser) throws UsernameNotFoundException {

		User user = userService.findByCodUser(codUser);
		if (user == null) {
			throw new UsernameNotFoundException(String.format("No user found with username '%s'.", codUser));
		} else {
			return JwtUserFactory.create(user);
		}
	}
}