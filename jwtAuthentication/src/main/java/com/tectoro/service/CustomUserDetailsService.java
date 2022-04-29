package com.tectoro.service;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		if(userName.equals("sujatha"))
		{
			
			return (UserDetails) new User();
		}
		else
		{
			throw new UsernameNotFoundException("user not found");
		}
	
	}

}
