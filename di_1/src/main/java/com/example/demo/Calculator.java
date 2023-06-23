package com.example.demo;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	// 너무 많으면 테스트가 힘들다 실무에서는 단위테스트해서 자동화
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int result = c.add(100, 200);
		System.out.println(result);
	}
}
