package com.example.demo.car;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.demo.car"}) //이걸로 빈을 등록할거야?
//사실이것도 필요없다???Di1Application.java여기에 있기 ㄸㅐ문에. src 안에서 해야함
public class CarConfig {
	
//	@Bean
//	public Teslar teslar() {
//		return new Teslar();
//	}
//	@Bean
//	public Ferrari ferrari() {
//		return new Ferrari();
//	}
//	@Bean
//	public DriveCar driveCar() {
//		return new DriveCar(teslar()); 여기 다시 써야함
//		DriveCar car = new DriveCar(teslar());
//		return car;
//		return dc;
//	}	
	}
