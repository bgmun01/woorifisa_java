package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.demo.model.entity.Employee;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE	)
@Slf4j
public class RelationTest {
	
//	@BeforeAll // 모든거 앞에 한번 each는 각각의 테스트 앞에 한번
	@BeforeEach // 각각의 텧스트 마다 핝ㅂ번
	public void setup() {
		//Employee 를 만들어보자.
		Employee emp = Employee.builder().gender('M')
				 .managerNo(0)
				 .age(10).name("hong gil dong").build();
		// Dept 도 만들어보자
		Dept dept = Dept.builder().deptName("영업부").build();
		emp.setDept(dept);
		em.persist(dept);
		em.persist(emp);
		em.clear();
	}
	
	@Autowired
	EntityManager em;
	
	@Test
	public void beanTest() {
		Assertions.assertNotNull(em);
		Employee selected = em.find(Employee.class, 1);
		log.debug("조회된 직원: {}", selected.getName());// 콜콜콜 해서 중복? 계쏙?
	
		//직원의 부서
		Dept dept = selected.getDept()	;
		log.debug("부서 정보: {}", dept.getDeptName()); //영업부
		// 다시 그 부서의 직원들
		List<Employee> emps = dept.getEmps();
		log.debug("직원수 : {}", emps.size());
	}
	

}
