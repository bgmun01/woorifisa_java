package ch09_exception.a_trycatch;

public class SimpleException {

    public static void main(String[] args) {
        // TODO: 다음 코드가 정상적으로 종료되도록 예외를 처리하시오.
        int[] intArray = { 10 };
        try {
            System.out.println(intArray[2]);
        }catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("예외 처리합니다.");
        	System.out.println(e.getMessage());
        	e.printStackTrace();
        }
        System.out.println("프로그램 종료합니다.");

        // END
    }
}
