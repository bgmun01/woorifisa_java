package ch07.b_imp;

import java.util.Date;
import java.util.List;

import static java.lang.System.out;

// TODO: 필요한 클래스를 import 해보자.
//import java.util.Date; //원래는 이렇게 사용한다?  IDE 같은 툴들은 애매한 상황이면 절대 결정 안한다.
// END

public class ImportTest {
    // TODO: java.util.Date, java.util.List, java.io.InputStream, java.awt.List를 사용해보자.
	Date date;// 자동완성으로 치면 위에 자동으로 import가 된다.
	List<String> list;
	java.awt.List mylist;
	
	public static void main(String[] args) {
		ImportTest it = new ImportTest();
		it.date = new Date();
		System.out.println(); //시스템이 가지고 있는 out 시스템 객체를 안만들고 접근한다 바로 스태틱 멤버변수
							// sout을 많이 쓸때 스태틱 임포트
		// static import 결과
		out.println(); // 위에 스태틱 java 를 임포트 하면 이걸 사용 할 수 있다 ! 장점이 뭐지?
	}
    // END
}
