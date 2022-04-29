package com.tectoro.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@RequestMapping("/welcome")
	public String Welcome()
	{
		
		String txt="hello world";
		
		return txt;
		
	}
	

}
