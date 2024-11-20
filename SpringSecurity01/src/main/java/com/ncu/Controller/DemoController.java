package com.ncu.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/admingreet")
	public String greetAdmin() {
		return "Heyy admin";
	}
	
	@GetMapping("/api/manGreet")
	public String greetManager() {
		return "Heyy manager";
	}
	
	@GetMapping("/greet")
	public String greet() {
		return "Heyy ";
	}
}
