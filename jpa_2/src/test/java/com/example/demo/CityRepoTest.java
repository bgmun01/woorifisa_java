package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.demo.model.entity.City;
import com.example.demo.model.entity.Country;
import com.example.demo.model.repo.CityRepo;
import com.example.demo.model.repo.CountryRepo;

import lombok.extern.slf4j.Slf4j;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Slf4j
public class CityRepoTest {
	//City Repo 쓰고 싶엉요
	@Autowired
	CityRepo cityRepo;
	@Autowired
	CountryRepo countryRepo;
	// 시티 페포를 인플리먼트한 ???
	@Test
	public void beanTest() {
		log.debug("repo : {}", cityRepo.getClass().getName());
	}
	
	
	@Test
	public void crudTest() {
		//city 가 포함된 country가 필요
		Country c = countryRepo.findById("ABW").get(); //데이터가 있을수도 있고 없을 수도 있어서 옵셔널?
		long cnt = cityRepo.count();
		log.debug("현재건수 : {}", cnt);
		//ㅇㅇㅇ새로 추가할 도시 구성
		City city = City.builder().name("내 도시").district("Asia").countrycode(c).build();
		cityRepo.saveAndFlush(city); // 저장 후 반영
		long cnt2 = cityRepo.count();
		Assertions.assertEquals(cnt+1, cnt2);
		
		//select 조회
		City selected = cityRepo.findById(city.getId()).get();
		Assertions.assertEquals(city, selected);
		
		// update
		selected.setName("너네도시");
		cityRepo.saveAndFlush(city); // 저장 후 반영
		
		//select 조회
		City selected2 = cityRepo.findById(city.getId()).get();
		Assertions.assertEquals(selected2.getName(), "너네도시");
		
		//delete
		cityRepo.delete(selected2);
		cityRepo.flush();
		
		Assertions.assertTrue(cityRepo.findById(city.getId()).isEmpty());

	}
	
	@Test
	public void byNameTest() {
		List<City> cities = cityRepo.findByNameLike("%at%");
		Assertions.assertEquals(cities.size(), 216);
		
		City city = cities.get(0);
		log.debug("이제 도시의 국가를 조회해보자.");
		String countryName = city.getCountrycode().getName();
		Assertions.assertEquals("Afghanistan", countryName);
		
	}
	@Test
	public void byCountryCodeAndPop() {
		List<City> cities = cityRepo.findByCountrycode_codeAndPopulationGreaterThan("ARG", 100);
		Assertions.assertEquals(cities.size(), 57);		
	
	}			
	@Test
	public void byPopulation() {
			List<City> cities = cityRepo.findByPopulationBetween(100,10000);
			Assertions.assertEquals(cities.size(), 41);
		}
	
	@Test
	public void sortTest() {
		Sort sort = Sort.by(Sort.Direction.DESC,"name");
		List<City> cities = cityRepo.findByPopulationGreaterThan(1000000, sort);
		Assertions.assertEquals(cities.size(), 237);
		Assertions.assertEquals(cities.get(0).getName(), "Zibo");
		Assertions.assertEquals(cities.get(236).getName(), "Abidjan");
	
	}
	
	@Test
	public void pagingTest() {
		Pageable pageable = PageRequest.of(0, 10, Sort.Direction.DESC, "name");
		Page<City> pages = cityRepo.findByPopulationGreaterThan(1000000, pageable);
		List<City> cities = pages.getContent();
		Assertions.assertEquals(cities.size(), 10);
		Assertions.assertEquals(cities.get(0).getName(), "Zibo");
		Assertions.assertEquals(cities.get(9).getName(), "Victoria");
		Assertions.assertEquals(pages.getTotalPages(), 24);
		Assertions.assertEquals(pages.getTotalElements(), 237);
	}
}

