package com.example.demo.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DriveCar {
	//쓰고 싶다 !! ->has a 관계 멤버변수로 관리한다. -> 초기화 get 함수 생성자 초기화 2개 방법
	//폴리뮬피즘? 상위 구조 드라이브 라는 같은 기능이 있네?
	// 인터페이스 사용
	Car car;
	// 생성자를 이용해 DI
	
	
	// set으로 DI
	public DriveCar() { // 이러면 car 가 없다.
	}
//	

	
// 생성자를 통한 빈 주입은 필수적인 관계 반드시 --> 별특별한거 없으면 이게 쓰인다.
// 세터 옵셔널한 관계는 빈주입은 세터 
	
	
//	public DriveCar() {
//		this.car = new Teslar(); //이곳 한곳만 고쳤었음 하지만 아직 고쳤다 인터페이스를 이용해서 폴리뮬피즘을 했을땐
//	} // new 한다는게 산다는것 구체화 - > 렌탈을 해야함!!
	
	@Autowired
	public DriveCar(@Qualifier("teslar") Car car) { //생성자를 통한 빈 주입.
		this.car = car; // 종속이 제거됨.  // 누군가는 정수기를 구매했다? 
	} 
	public void setCar(Car car) { //setter 를 통한 빈 주입
		this.car = car;
	}
	
	
	public void move(String to) {
		car.drive();
		System.out.println(to+"로 gogo gogo!!");
	}
	
}
