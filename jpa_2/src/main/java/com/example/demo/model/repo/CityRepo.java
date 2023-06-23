package com.example.demo.model.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.entity.City;

public interface CityRepo extends JpaRepository<City, Long>{ //시티를 관리하고 long 값?
//JPA repo를 상속 받아서 구현한다. 위에 코드 하나가 CRUD 를 만들었다? 
	// 아까 메소드 확인 ㄱㄱ?
	
	List<City> findByNameLike(String namePattern);
	// 이름 기반으로 검색 
	List<City> findByName(String name);
	
	// 연관 관계의 객체 속성 활용
	
	List<City> findByCountrycode_codeAndPopulationGreaterThan(String code, int pop);
	
	List<City> findByPopulationBetween(int from,int to);
	
	List<City> findByPopulationGreaterThan(int pop, Sort sort);
	
	Page<City> findByPopulationGreaterThan(int pop, Pageable pageable);
	
	
}

