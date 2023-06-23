package com.example.javastudy.variable;

public class IntTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10; // int i 선언문, 10 실행문 동시에 적어
		byte b = 10; //값은 동일하지만 메모리 공간의 차이는 크다.
		//Type mismatch: cannot convert from int to byte
		//byte b2 = 128; // 용량 때문에 타입 미스매치 -128 ~ 127 까지만 허용
		
		//int i2 = 10000000000; 
		//int i2 = 10000000000L;  int 가 32 비트L 은 64비트라서 ㄱ다시 에러
		Long i2 = 10_000_000_000L;  //이게 정답
	}

}
