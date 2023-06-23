package com.example.demo.phone;

import org.springframework.stereotype.Component;

@Component
public interface Phone {
	void call(String to);
}
