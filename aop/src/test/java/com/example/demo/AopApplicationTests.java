package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.shortThat;

import java.util.Calendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.bean.Simplebean;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class AopApplicationTests {
	
	
	@Autowired
	Simplebean sbean; //간단하게 객체가져오기 테스트할

	@Test
	public void beanTest() {
		Assertions.assertNotNull(sbean); // sbean 객체가 잘 생성되어있나요? 비지 않았나요?
	}
	
	@Test
	public void nameTest() {
		String name = "장길산";
		Assertions.assertEquals(sbean.getName(), "홍길동");
		sbean.setName(name); //set name이 잘 동작하는 지 확인했다.
		Assertions.assertEquals(sbean.getName(), name);
		
		log.debug("sbean 의 타입은 : {} ", sbean.getClass().getSimpleName());
		// 로그가 안나오는 이유는 레벨이 안맞아서?
	}
	
	@Test
	public void setCalTest() {
		Calendar now = Calendar.getInstance();
		sbean.setNow(now);
		assertEquals(now, sbean.getNow()); //static import 가 된다?
	}

}
