package com.woorifis.webday3.model;
//웹과 무관
public class MyCakeService {
	//생성자가 프라이빗 하게 막힌다?
	// 모델의 대부분은 싱글턴으로 동작한다.
	// 싱글턴을 만들때 목적이 뭐였냐 머리속으로 따라가면서 왜? 인가
	
	private static MyCakeService service = new MyCakeService();
	
	private MyCakeService() {}
	
	public static MyCakeService getService() {
		return service;
	}
	
	
	public int add(int a, int b) {
		return a + b;
	}
}
