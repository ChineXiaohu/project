package com.ugrow.internet.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Hello {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "/front/index";
	}

}
