package ch07.a_extend.spider;

public class Person {
    String name;
    
    public Person (String name) {
     	this.name = name;
		
	}

    public void eat() {
        System.out.println("밥 먹기");
    }

    public void jump() {
        System.out.println("뛰기");
    }
}
