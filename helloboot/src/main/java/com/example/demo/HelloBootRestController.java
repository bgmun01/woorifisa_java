package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBootRestController {
	@GetMapping("/hello") //Get 방식으로 부른다면? 이라는 뜻
	public String sayHello(String name) {
		return "Hello " + name;
	}
}
