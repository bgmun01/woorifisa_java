package com.example.javastudy.variable;

public class CastingTest {

	public static void main(String[] args) {
		int i = 10000;
		float f = i; //값 손실 없음 : 묵시적 형변환
		System.out.println(f); //
		
		//long l = F; // long: 64bit, f: 32bit
		long l = (long)f; // long: 64bit, f: 32bit
		System.out.println(l); // 프로그래머 괜찮아 알고 있어
		
		byte b = (byte)l;  
		System.out.println(b);
	}

}
