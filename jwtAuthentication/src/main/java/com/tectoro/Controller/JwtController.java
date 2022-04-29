package com.tectoro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tectoro.helper.JwtUtil;
import com.tectoro.model.JwtRequest;
import com.tectoro.service.CustomUserDetailsService;

@RestController
public class JwtController {
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	
	@Autowired
	private JwtUtil jwtUtil;
	@PostMapping("/token")
	public ResponseEntity<?> generateToken(@RequestBody ResponseEntity<?> jwtRequest){
		return jwtRequest ;
		
	}

}
