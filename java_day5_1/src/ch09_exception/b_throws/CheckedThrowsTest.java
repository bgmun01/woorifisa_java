package ch09_exception.b_throws;

public class CheckedThrowsTest {
    public static void main(String[] args) {
        CheckedThrowsTest et = new CheckedThrowsTest();
        try {
            et.method1();
        } catch (ClassNotFoundException e) {
            System.out.printf("예외 처리: %s%n", e.getMessage());
            //e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }

    public void method1() throws ClassNotFoundException {
        method2();
    }

    public void method2() throws ClassNotFoundException {
        Class.forName("Some Class");
    }
}
