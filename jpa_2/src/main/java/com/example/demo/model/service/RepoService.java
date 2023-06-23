package com.example.demo.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.dto.CityDto;
import com.example.demo.model.entity.City;
import com.example.demo.model.entity.Country;
import com.example.demo.model.repo.CityRepo;
import com.example.demo.model.repo.CountryRepo;

import jakarta.transaction.Transactional;

//@Component // 밋밋하다? 이거 보단 서비스!

@Service // 비즈니스 로직의 출발점
public class RepoService {
	
	public String helloService(String name) {
		return "Hello" + name;
	}
	
	@Autowired
	CityRepo cityRepo;
	
	@Autowired
	CountryRepo countryRepo;
	
	// 한 도시를 등록하면 그 도시의 자매도시도 등록한다.
	
	@Transactional //트랜잭션 하고싶으면 여기다 골뱅이 트랜젝션 하면된다. insert inparw 
	// 자동 rollback commit int i = 1/0; 이런 케이스 롤백
	// rollback : runtime exception 이 발생한 경우, commit: 별일 없이 종료된 경우
	public void saveCity(String countryCode, String name) {
		// 1. 국가를 데려온다.
		Country country = countryRepo.findById(countryCode).get();
		
		// 2. 등록할 도시를 만든다.
		City city = City.builder().name(name).countrycode(country)
								  .population(0).district("Asia").build();
		City city2 = City.builder().name(name + "자매").countrycode(country)
				  .population(0).district("Asia").build();
		cityRepo.save(city);
		//int i = 1/0;
		cityRepo.save(city2);
	}
	
	public City selectCity(long no) {
		Optional<City> city = cityRepo.findById(no);
		if(city.isPresent()) {
			return city.get();
		}else {
			return null;
		}
		
	}
	
	public City login(String id, String pass) {
		List<City> cities = cityRepo.findByName(id);
		for(City c: cities) {
			if(c.getDistrict().equals(pass)) {
				return c;
			}
		}
		return null;
	}
	
	public CityDto registCity(CityDto dto) {
		Optional<Country> country = countryRepo.findById(dto.getCountryCode());
		if(country.isEmpty()) {
			return null;
		}else {
			Country c = country.get();
			City city = dto.toEntity();
			city.setCountrycode(c);
			cityRepo.saveAndFlush(city);
			return city.toDto();
		}

	}
	public List<CityDto> list(){
		List<City> cities = cityRepo.findAll(Sort.by(Sort.Direction.DESC, "id"));
		List<CityDto> dtos = new ArrayList<>();
		for(City c: cities) {
			dtos.add(c.toDto());
		}
		return dtos;
	}
}
