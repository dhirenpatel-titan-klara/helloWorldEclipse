package com.example.HelloWorld.Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		System.out.println("\"Greetings from Spring Boot Eclipse!\"");
		return "Greetings from Spring Boot Eclipse!";
	}

	@GetMapping("/getEclipse")
	public String getEclipse() {
		System.out.println("\"Greetings from Spring Boot Get Eclipse!\"");
		return "Greetings from Spring Boot Get Eclipse!";
	}
}
