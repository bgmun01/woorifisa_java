package com.woorifis.preweb;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//라이브러리 JRE 만 썼는데 롬복을 쓸거다

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Builder

public class Person {
	@NonNull  // 
	private String name; 
	private int age;
	private double height;
	
	public void grow(int cm) {
		System.out.println("grow" + cm); //값 확인 안들어오면 집엑 못ㅅ가ㅏㅏㅏㅏ
		height += cm;
		System.out.println("많이 컸군!! 현재" + height );
		
		//계속 값이  로그가 없다 로그를 확인해라 
		
		try {
			int i = 1 / 0;
		} catch (ArithmeticException e) {
			System.out.println("예외 처리 :" +e.getMessage());
		}
	} //계속 돌아가게 하려고 로깅 시스템? 4번 ㄴㄴ 항상
} //로그백을 출력하려면 메이븐에서 받아 온다.
