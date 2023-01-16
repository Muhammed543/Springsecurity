package com.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.springsecurity.model.User;
import com.springsecurity.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	 @Autowired
	private  UserRepository userrepo;
	
	 @Autowired
    private BCryptPasswordEncoder passwordEncode;

	public User CreateUser(User user) {
		
		user.setPassword(passwordEncode.encode(user.getPassword()));
		user.setRole("ROLE USER");
		return userrepo.save(user);
	}

}
