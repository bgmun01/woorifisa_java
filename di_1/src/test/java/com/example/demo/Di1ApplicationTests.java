package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.demo.phone.GalaxyFold;
import com.example.demo.phone.Iphone;
import com.example.demo.phone.Phone;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class Di1ApplicationTests {

	@Test //단위 테스트 - 동작을 이렇게 테스트?? junit 탭을 통해 본다. 단위테스트
	void contextLoads() {
		Calculator c = new Calculator();
		int result = c.add(100, 200); //단정문을 통해 결과를 검증하게 된다.
		Assertions.assertEquals(result, 300);
		
		Assertions.assertEquals(c.add(1, 5),6);
		
	}
	@Autowired // 해당 타입의 빈을 가져오세요!!
	ApplicationContext ctx; //스프링 프레임 워크가 가지고 있는것
	
	@Test
	public void beanTest() {
		String [] beanNames = ctx.getBeanDefinitionNames();
		for(String name: beanNames) {
			log.debug("name: {}", name);
			// 출력이 안된다? why? INFO 보다 낮은레벨이라서~~? 
			// src/resources application.properties 가서 수정해줘야함
			// 익숙한 이름들 아이폰, 갤럭시, 폰 유저 빈들의 이름
		}
	}
//단위 테스트를 통해 빈들이 잘 됐는지 할거다 4번과정 블로그에
	@Test    //이거 뭐지?
	public void getBeanTest() {
		Iphone iphone = ctx.getBean(Iphone.class);// 이게 좋음? 밑에보다 타입기반으로 빈 요청
//		iphone.call("101"); 
//		Object obj = ctx.getBean("galaxy");
//		if(obj instanceof GalaxyFold	 ) {
//			GalaxyFold g = (GalaxyFold)obj;
//			g.call("010");
		Assertions.assertNotNull(iphone);
		Object obj = ctx.getBean("galaxy"); //이름 기반으로 빈 요청
		Assertions.assertNotNull(obj);
		}
	
	@Test    //이거 뭐지?  빈이 두개라서 에러! 예쓰!
	public void getBeanTest2() {
		//Phone p = ctx.getBean(Phone.class);
		Phone p = ctx.getBean("galaxy", Phone.class); //이름기반 타입기반 빈 요청
		Assertions.assertNotNull(p);
		// 동일한 타입의 빈이 여러개라서 에러가 난다 그래서 이름기반도 쓰여야 하는데?
		// 그래서 겟빈 메서드에 이런 
		
	}
}
