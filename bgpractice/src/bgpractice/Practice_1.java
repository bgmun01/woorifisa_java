package bgpractice;

import java.security.PublicKey;
import java.util.ArrayList;

public class Practice_1 {

	public static void main(String[] args) {
		//ArrayList 의 add라고하는 메소드는 어떠한 형태의 데이터 타입도 수용 할 수 있다
		//그러기 위해선 one 이라는 인자가 object 여야한다. one 이라는 string 은 Arraylist에 object 로 저장되어있기 떄문
		ArrayList<E> a1 = new ArrayList(); // 
		a1.add("one");
		a1.add("two");
		a1.add("three");
		for(int i=0; i<a1.size(); i++) {
			String value = (String)a1.get(i); // (String)으로 감싸는건 옛날방식 제네릭 처럼 타입의 안정성이 떨어진다.
			System.out.println(value);
		}
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("one");
		a2.add("two");
		a2.add("three");
		for(int i=0; i<a1.size(); i++) {
			String value_1 = a2.get(i);
			System.out.println(value_1);
		
		
		
		}
	}
		

