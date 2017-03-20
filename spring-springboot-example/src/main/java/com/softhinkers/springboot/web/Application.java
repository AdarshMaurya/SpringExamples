package com.softhinkers.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.softhinkers")
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootFirstWebApplication.class, args);

		ApplicationContext ctx = SpringApplication.run(Application.class, args);
	}

}
