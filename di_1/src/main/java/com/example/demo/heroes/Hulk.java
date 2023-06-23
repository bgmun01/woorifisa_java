package com.example.demo.heroes;

import org.springframework.stereotype.Component;

@Component
public class Hulk implements Heroes{
	

	public void help() {
		System.out.println("도와줄께~~~ 쫌 만 뿌시고~~");
	}
}
