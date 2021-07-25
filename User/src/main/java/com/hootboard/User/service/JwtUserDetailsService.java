package com.hootboard.User.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class JwtUserDetailsService implements UserDetailsService{

	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		if("hootboard".equals(username))
		{
			
			return new User(username,"$2a$10$pbSCz9LFCTGy7QhS/1qxFObR/4Lwcvo3R8NSYHPfALylroPPPQeMy",new ArrayList<>());
		}
		else
			throw new UsernameNotFoundException("User not found.");
	
	}

	

	

}
