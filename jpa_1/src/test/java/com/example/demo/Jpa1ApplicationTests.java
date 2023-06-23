package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.entity.Employee;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

//@SpringBootTest
@Slf4j
// 테스트시 메모리 DB로 변경하지 말고 application.properties 의 DB 사용해라
@AutoConfigureTestDatabase(replace = Replace.NONE)
@DataJpaTest // spring data jpa 테스트 전용 클래스 // @Transactional 이 제일 중요 crud 테스트가 끝나면 rollback
class Jpa1ApplicationTests {

	@Autowired
	EntityManager em;
	
	@Test
	public void crudtest() {
		// Employee 를 만들어보자.
		Employee emp = Employee.builder().gender('M')
										 .managerNo(0)
										 .age(10).name("hong gil dong").build();
		//저장해보자
		em.persist(emp);
		//반영해보자
		em.clear();
		
		Employee selected = em.find(Employee.class, 1);
		
		log.debug("조회된 객체: {}", selected);
		
		Assertions.assertEquals(selected.getEmpNo(),1);
		
	}

}
