package com.Microservices.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Microservices.Entity.User;

import jakarta.websocket.server.PathParam;

@Controller
public class DemoController {
	

	@GetMapping("/greet")
	@ResponseBody
	public String greetUser() {
		return "Hemloo Everyone";
	}

	@GetMapping("/greet/{name}")
	@ResponseBody
	public String greetUser(@PathVariable String name) {
		return "Hemloo Peoplee, It's " + name;
	}

	@GetMapping("/welcome")
	@ResponseBody
	public String welcome(@PathParam("name") String name, @PathParam("age") int age) {
		return "Hemloo Peoplee, It's " + name + ". My age is " + age;
	}

	@PostMapping("/login")
	@ResponseBody
	// Instead of passing multiple arguments using @pathvariable, pass an object
	// directly
	public String loginUser(@RequestBody User user) {
		return "Hemloo Peoplee, It's " + user.getUsername();
	}
	
	

}
