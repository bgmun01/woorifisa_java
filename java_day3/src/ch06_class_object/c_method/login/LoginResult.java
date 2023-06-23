package ch06_class_object.c_method.login;

public class LoginResult {
    // TODO: 로그인 결과와 전달되는 메시지를 관리해보자.
	boolean result; //성공 여부
	String msg;  //반환 메세지
    // END
	public Object prin;

    // TODO: printResult() 메서드에서 위의 result와 message를 출력하시오.
	public void printResult() {
		System.out.printf("성공 여부 : %b(%s)\n", result, msg);
	}
    // END
}
