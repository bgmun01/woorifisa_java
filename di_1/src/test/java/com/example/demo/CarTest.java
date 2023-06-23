package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.demo.car.Supercar;

@SpringBootTest
public class CarTest {
	
	@Autowired // 자동으로 필요한 bean빈? 객체 연결
	ApplicationContext ctx;
	
	
	@Test //여기다가 뭔가 테스트 해보고 싶어
	public void beanCreationTest()	{
		Supercar f = ctx.getBean(Supercar.class);
		Assertions.assertNotNull(f);
	}
		
		
	@Test //여기다가 뭔가 테스트 해보고 싶어
	public void singletonTest()	{
		Supercar f1 = ctx.getBean(Supercar.class);
		Supercar f2 = ctx.getBean(Supercar.class);
		Supercar f3 = ctx.getBean("ferrari",Supercar.class);
		Assertions.assertEquals(f1, f2); // 같은 내용이냐 이퀄 ==은 같냐? 싱글턴 질문 x
		Assertions.assertSame(f2, f3); //같은 객체 참조냐?
		Assertions.assertSame(f1, f3); //같은 객체 참조냐?
		// 완전히 같기 때문에 스프링에서 bean 들은 싱글턴으로 관리된다는 것을 알 수 있음! 
			
	}
}
