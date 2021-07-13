package com.example.demo.activator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frases")
public class MyControllers {
	
	@GetMapping
	public String teste() {
		System.out.println("alo?");
		return("Hello World");
	}


}
