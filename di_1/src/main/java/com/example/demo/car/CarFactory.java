package com.example.demo.car;

public class CarFactory { //누군가는 카를 사야한다.
	public static Car getCar(String name) {
		if(name.equals("T")) {
			return new Teslar();
		}else {
			return new Supercar();
		}
	}
}
