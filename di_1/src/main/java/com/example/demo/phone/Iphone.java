package com.example.demo.phone;

import org.springframework.stereotype.Component;

@Component("iphone")
public class Iphone implements Phone{
	
	@Override
	public void call(String to) {
		System.out.println("아이폰에서 전화" + to);
}
}
