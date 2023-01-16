package com.springsecurity.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springsecurity.model.User;
import com.springsecurity.repository.UserRepository;

@Service
public class UserDetailsServiceimpl implements UserDetailsService{

	private UserRepository userrepo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
		User user=userrepo.findByEmail(username);
		if(user!=null)
		{
			return new CustomUserDetails(user);
		}
		throw new UsernameNotFoundException("user not found");
	}

}
