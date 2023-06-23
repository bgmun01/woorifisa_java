package com.example.demo.bean;

import java.util.Calendar;

import org.springframework.stereotype.Component;



@Component
public class SimpleBeanImpl implements Simplebean{
	private String name = "홍길동";
	private Calendar now = Calendar.getInstance();

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setNow(Calendar cal) {
		//log.debug("변수세팅 : {}", name); 이런놈들을 묶을거야 분리된 놈들 advice
		this.now = cal;
		//위에 한칸이 조인포인트? 그중 하나를 지정하는게 포인트 컷?
		//advice = -
		
	}

	@Override
	public Calendar getNow() {
		return this.now;
	}

}
