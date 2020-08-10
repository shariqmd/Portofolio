package com.sharique;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(value={"/","/home"})
	public String home()
	
	{System.out.println("home controller called by sharique ");
		
		return "index";
	}

}
