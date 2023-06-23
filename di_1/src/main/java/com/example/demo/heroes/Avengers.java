package com.example.demo.heroes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Avengers {
	private Hulk hulk; // 빈
	private IronMan iman; //빈
	@Value("뉴욕") //스칼라값을 주입하기 위한 에너테이션?
	private	String addr; // 빈x Scalar == 기본형 + 문자열 값
	@Value("${doorPass}") 
	public	String doorPassword; // 빈x Scalar == 기본형 + 문자열 값
	
		
	@Autowired
	public Avengers(Hulk hulk) {
		this.hulk = hulk;
	}
	
	@Autowired
	public void setIronMan(@Qualifier("hulkBuster") IronMan iman) {
		this.iman = iman;
	}
}