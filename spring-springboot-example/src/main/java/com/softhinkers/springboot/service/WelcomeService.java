package com.softhinkers.springboot.service;

import org.springframework.stereotype.Component;

@Component 
public class WelcomeService {
	public String retrieveWelcomeMessage() {
		// Complex Business Logic
		return "Good Morning, Updated!";
	}
}