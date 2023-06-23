package ch06_class_object.a_person;

public class Persontest {

	public static void main(String[] args) {
		// 클래스를 구체화(객체화) 시켜보자.
		int a = 10;
		Person p1 = new Person(); // 메모리에 객체 생성 하고 그 객체에서 주소값을 가져온다! (주소로 참조)
		p1.name = "홍길동";
		p1.age = 10; // p1. . = p1 이' 가지고 있는' 속성
		p1.eat();
		System.out.println(p1.name +" : "+p1.age +" : "+p1.isHungry);
		p1.printInfo();

		Person p2 = new Person();
		p2.name = "임꺽정";
		p2.work();
		System.out.println(p2.name+" : "+p2.age+" : "+p2.isHungry);
		p2.printInfo();
		
		Person p3 = new Person("장길산", 10, false);

	}

}
