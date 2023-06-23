package com.example.javastudy.variable;

public class FormatTest {

	public static void main(String[] args) {
		// TODO 나는 20살이구 이름은 홍길동, 키는 180cm 밥은 먹었니? true
		int age = 20;
		String name = "홍길동";
		double height = 180.5;
		boolean isEaten = true;
		System.out.printf("나는 %d살이구 이름은 %s, 키는 %5.1fcm, 밥은 먹었니? %b\n",
				age, name, height, isEaten);
	}

}
