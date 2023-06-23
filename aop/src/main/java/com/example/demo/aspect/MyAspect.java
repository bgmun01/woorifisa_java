package com.example.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	@Before("execution( void com..*.set*(*) )") // 왼쪽 자체를 point cut 어떤 메서드를 필터링 하고 있구나. the pointcut expression where to bind the advice
	public void logging() { //advice
		// 횡단 관심 코드
		System.out.println("set 메서드 호출됨");
		// 위에 한묶음이 aspect / 맨위에 한줄이 advice
	}

}
