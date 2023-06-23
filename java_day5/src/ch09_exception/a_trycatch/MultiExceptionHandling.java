package ch09_exception.a_trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MultiExceptionHandling {

	public static void main(String[] args) {
		// TODO: 다음 코드에서 발생하는 예외를 처리해보자.
		try {
			Class.forName("ch09.a_trycatch.MultiExceptionHandling");
			new FileInputStream("Hello.java");
			DriverManager.getConnection("Hello");
		} catch (ClassNotFoundException | FileNotFoundException e) {
			// 처리하는 내용이 동일하다면 묶어주기
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// END
		System.out.println("프로그램 정상 종료");
	}
}
