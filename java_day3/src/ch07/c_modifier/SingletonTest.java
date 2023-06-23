package ch07.c_modifier;

// 기능(메서드만 존재) , 상태(멤버 변수가 없다!!) - stateless 한 클래스
class SingletonClass {
	private static SingletonClass sc = new SingletonClass(); // 내부적으로 밖에 접근을 못하니까 여기서 생성
//	public void setSingletonClass(SingletonClass sc) {
//		this.sc = sc;
//		}
	public static SingletonClass getSingletonClass() {
		return sc;
	}
    // TODO:SingletonClass에 singleton design pattern을 적용하시오.
	private SingletonClass() {
		
	}
    // END

    public void sayHello() {
        System.out.println("Hello");
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        // TODO: SingletonClass 객체를 사용해보자. //굳이 여러개를 만들 필요가 없다
    	// 싱글턴 디자인 패턴  객체를 못만들게해 생성자 호출 못하게해야함
    	SingletonClass sc = SingletonClass.getSingletonClass();
    	sc.sayHello();
    	
       	SingletonClass sc2 = SingletonClass.getSingletonClass();
    	sc2.sayHello();
    	
    	System.out.println(sc==sc2);
    	
        // END
    }
}
