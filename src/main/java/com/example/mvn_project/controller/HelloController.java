package com.example.mvn_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/message")
	public String sayHello()
	{
		return "Hello All";
	}
	
}
