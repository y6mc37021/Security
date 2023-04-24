package com.comany.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityController {
	
	@GetMapping("/hello")
	public String helloSecurity() {
		return "Hello Spring Security";
	}
	
	@GetMapping("/welcome")
	public String welcomeSecurity() {
		return "Welcome Spring Security";
	}
	
	
	@GetMapping("/ola")
	public String olaSecurity() {
		return "Ola Spring Security";
	}

}
