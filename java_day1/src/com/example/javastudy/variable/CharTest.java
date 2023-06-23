package com.example.javastudy.variable;

public class CharTest {

	public static void main(String[] args) {
		char c1 = 'a';
		int i = c1 + 1; //c1 은 a 97 인데 그럼 값이 98이 된다 연산시 int로 바뀜
		System.out.println(i); // 문자는 사실 ascii 코드에 숫자로 매핑이 되어있다.
		System.out.println((char)i); //형변환
		
		
		
		
		
	}

}
