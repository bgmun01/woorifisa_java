package ch07.poly;

class SuperClass {
    String x = "super";

    public void method() {
        System.out.println("super class method");
    }
}

class SubClass extends SuperClass {
    String x = "sub";

    @Override
    public void method() {
        System.out.println("sub class method");
    }
}

public class MemberBindingTest {

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        System.out.println(subClass.x);
        subClass.method();

        SuperClass superClass = subClass;
        System.out.println(superClass.x); //써져있는 그대로 나옴 정적 바인딩
        superClass.method(); //조상께 나와야 하는데 서브클래스 것이 나옴 하지만 메서드에서는 동적 바인딩

        System.out.print(superClass);

    }
}
