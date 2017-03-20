package com.softhinkers.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class LoginController {
	
	//Set the login service [Dependency Injection] - AutoWiring
	@Autowired
	LoginService service;
	//LoginService service = new LoginService();

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	//@ResponseBody
	//public String sayHello() {
	public String showLoginPage() {
		//return "Hello World Dummy";
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	//public String handleLoginRequest() {
	//public String handleLoginRequest(@RequestParam String name) {
	public String handleLoginRequest(@RequestParam String name, @RequestParam String password ,ModelMap model) {
		//System.out.println(name);
		if(!service.validateUser(name, password)){
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		
		model.put("name", name);
		model.put("password", password);
		return "welcome";
		
		//return "Hello World Dummy";
		
	}
}
