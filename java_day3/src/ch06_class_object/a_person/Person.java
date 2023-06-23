package ch06_class_object.a_person;

public class Person {
	// 속성 - 데이터, 필드, 멤버 변수
	String name;
	int age;
	boolean isHungry;
	
	//생성자 - 멤버 변수의 초기화가 목적
	//public Person() {} // 생성자
	//생성자 오버로딩 // 이름은 같고 파라미터는 다르니까!

	
	public Person( ) {
//		this.name = "익명"
//		this.age = 0
//		this.isHungry = false;
		// this() : 나의 overloading 된 다른 생성자 호출
		// int i = 1; 생성자 호출은 맨 처음 라인에만 가능
		this("익명", 0, false);
	}
	public Person(String name, int age, boolean isHungry) {  //좋지않은 습관 n -> name 바꿔야해
		this.name = name;
		this.age = age;
		this.isHungry = isHungry; // 파랑색 멤버변수 // 갈색변수 파라미터
	} //로컬변수 메인변수 충돌되었을때 탈출하는법 -> This : 객체 자신을 의미함 로컬변수와 멤버변수의 이름 충돌 시 멤버를  가르킨다.
	
	
	
	// 기능 - 동작, 메서드, 멤버 메서드
	void eat() {
		System.out.println("냠냠..");
		this.isHungry = false; //내가 가지고 있는 this.
	}
	void work() {
		System.out.println("열심!!!");
		isHungry = true;
	}
	
	void printInfo() {
		System.out.println(name + ":" +age+ ":" +isHungry);
	}
	
}
