package com.sharique;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restcontroller {
	
	@GetMapping("/test")
	public String demo()
	{
		
		
		return "its working";
	}

}
