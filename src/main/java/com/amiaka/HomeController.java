package com.amiaka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String Home() {
		return "Hello, Home";
	}
	
	@GetMapping("/secured")
	public String Secured() {
		return "Hello, Secured";
	}
}
