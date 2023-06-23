package com.example.demo.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// 의존성 바꾸려면 다 바꿨어야 했다 갤럭시를 아이폰으로 
@Component
public class PhoneUser {
	// 전화기를 쓰고 싶다!
	private Phone phone;
	
//	public PhoneUser() {
//		this.phone = new GalaxyFold();
	@Autowired
	public PhoneUser(@Qualifier("iphone") Phone p) {
		this.phone = p;
	}
	
//	public void setPhone() {
//		this.phone = new GalaxyFold(); //누가 나한테 줘야함? 
		
	public void setPhone(Phone p) {
		this.phone = p; //누가 나한테 줘야함? 
	}
	
	public void call(String to) {
		System.out.println(phone.getClass().getName()+"으로 전화");
	}
}
