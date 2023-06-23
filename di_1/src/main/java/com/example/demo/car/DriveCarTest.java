package com.example.demo.car;

public class DriveCarTest {
	
	public static void main(String[] args) {
	//	DriveCar dc = new DriveCar(); 생성자가 추가되서 안됨? 팩토리 ㅏㅁㄴ들자 마자 안됨
		DriveCar dc = new DriveCar(CarFactory.getCar("T"));
		dc.move("상암동");
	}

}
