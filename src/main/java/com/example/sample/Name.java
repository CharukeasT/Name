package com.example.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
	@GetMapping("/call")
	public String name() {
		String name = "Charukeas";
		return "Welcome " + name + "!";
	}
}
