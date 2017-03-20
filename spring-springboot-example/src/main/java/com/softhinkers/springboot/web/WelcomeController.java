package com.softhinkers.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softhinkers.springboot.service.WelcomeService;

@RestController
public class WelcomeController {
	
	//2. Dependency injected here
	//private WelcomeService service =  new WelcomeService();
	@Autowired
	private WelcomeService service;
	
	// welcome
	@RequestMapping("/welcome")
	public String welcome() {
		//return "This is great! I see something on the screen";
		return service.retrieveWelcomeMessage();
	
	}
}


//1. Spring to create and manage this bean and instance of it
//@Component
//class WelcomeService {
//	public String retrieveWelcomeMessage() {
//		//Complex Business Logic
//		return "Good Morning, Updated!";
//	}
//}
