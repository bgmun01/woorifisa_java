package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.service.RepoService;

@SpringBootTest
public class CityServiceTest {
	
	@Autowired
	RepoService service;
	
	
	@Test
	public void insertTest() {
		String countrycode = "KOR";
		String cityName = "니도시";
		service.saveCity(countrycode, cityName);
	}

}
