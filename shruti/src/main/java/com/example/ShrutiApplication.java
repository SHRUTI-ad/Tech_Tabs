package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ShrutiApplication {

	@GetMapping("/msg")
	public String getMessage() {
		return "welcome to Docker Session";
		
	}
	public static void main(String[] args) {
		SpringApplication.run(ShrutiApplication.class, args);
	}

}
